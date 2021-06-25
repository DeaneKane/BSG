package aws;

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

public class TeamsLoadData {
	
	public TeamsLoadData(String teamsJson) throws Exception {

		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.EU_WEST_1).build();

		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable("Teams");

		JsonParser parser = new JsonFactory().createParser(teamsJson);

		JsonNode rootNode = new ObjectMapper().readTree(parser);
		
		Iterator<JsonNode> iter = (rootNode.findPath("teams")).iterator();

		ObjectNode currentNode;
		

		while (iter.hasNext()) {
			currentNode = (ObjectNode) iter.next();

			int team_id = currentNode.path("team_id").asInt();
			String name = currentNode.path("name").toString();

			try {
				table.putItem(new Item().withPrimaryKey("team_id", team_id, "name", name)
						.withJSON("Code", currentNode.path("code").toString())
						.withJSON("Logo", currentNode.path("logo").toString())
						.withJSON("Country", currentNode.path("country").toString())
						.withJSON("Founded", currentNode.path("founded").toString())
						.withJSON("Venue", currentNode.path("venue_name").toString())
						.withJSON("Venue City", currentNode.path("venue_city").toString())
						.withJSON("Capacity", currentNode.path("venue_capacity").toString()));
				System.out.println("PutItem succeeded: " + team_id + " " + name);

			} catch (Exception e) {
				System.err.println("Unable to add: " + team_id);
				System.err.println(e.getMessage());
				break;
			}
		}
		parser.close();
		
	}

}
