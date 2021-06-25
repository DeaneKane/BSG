package aws;

import java.io.File;
import java.util.Iterator;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class LeaguesLoadData {
	
	public LeaguesLoadData() throws Exception {
		
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.EU_WEST_1).build();

		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable("Leagues");

		JsonParser parser = new JsonFactory().createParser(new File("leagues.json"));

		JsonNode rootNode = new ObjectMapper().readTree(parser);
		Iterator<JsonNode> iter = rootNode.iterator();

		ObjectNode currentNode;

		while (iter.hasNext()) {
			currentNode = (ObjectNode) iter.next();

			int league_id = currentNode.path("league_id").asInt();
			String name = currentNode.path("name").toString();

			try {
				table.putItem(new Item().withPrimaryKey("league_id", league_id, "name", name)
						.withJSON("Country", currentNode.path("country").toString())
						.withJSON("Season", currentNode.path("season").toString()));
				System.out.println("PutItem succeeded: " + league_id + " " + name);

			} catch (Exception e) {
				System.err.println("Unable to add: " + league_id);
				System.err.println(e.getMessage());
				break;
			}
		}
		parser.close();

	}
}

