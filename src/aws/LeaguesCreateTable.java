package aws;

import java.util.Arrays;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

public class LeaguesCreateTable {

	public LeaguesCreateTable() {
		
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion( Regions.EU_WEST_1 ).build();

        DynamoDB dynamoDB = new DynamoDB( client );

        String tableName = "Leagues";

        try
        {
            System.out.println( "Attempting to create table; please wait..." );
            Table table = dynamoDB.createTable( tableName,
                                                Arrays.asList( new KeySchemaElement( "league_id", KeyType.HASH ), // Partition
                                                                                                             // key
                                                               new KeySchemaElement( "name", KeyType.RANGE ) ), // Sort
                                                                                                                 // key
                                                Arrays.asList( new AttributeDefinition( "league_id", ScalarAttributeType.N ),
                                                               new AttributeDefinition( "name", ScalarAttributeType.S ) ),
                                                new ProvisionedThroughput( 10L, 10L ) );
            table.waitForActive();
            System.out.println( "Success.  Table status: " + table.getDescription().getTableStatus() );

        }
        catch( Exception e )
        {
            System.err.println( "Unable to create table: " );
            System.err.println( e.getMessage() );
        }

    }
}
	
