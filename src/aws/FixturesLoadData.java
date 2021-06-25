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

public class FixturesLoadData {
	public FixturesLoadData(String fixturesJson) throws Exception {

		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.EU_WEST_1).build();

		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable("FixturesTest");

		JsonParser parser = new JsonFactory().createParser(fixturesJson);

		JsonNode rootNode = new ObjectMapper().readTree(parser);
		
		Iterator<JsonNode> iter = (rootNode.findPath("fixtures")).iterator();

		ObjectNode currentNode;
		

		while (iter.hasNext()) {
			currentNode = (ObjectNode) iter.next();

			int fixture_id = currentNode.path("fixture_id").asInt();
			int league_id = currentNode.path("league_id").asInt();

			try {
				table.putItem(new Item().withPrimaryKey("fixture_id", fixture_id, "league_id", league_id)
						.withJSON("Home Team", currentNode.path("homeTeam").findValue("team_name").toString())
						.withJSON("Away Team", currentNode.path("awayTeam").findValue("team_name").toString()));
				System.out.println("PutItem succeeded: " + fixture_id + " " + league_id);

			} catch (Exception e) {
				System.err.println("Unable to add: " + fixture_id);
				System.err.println(e.getMessage());
				break;
			}
		}
		parser.close();
		
	}
}
