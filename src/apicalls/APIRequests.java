package apicalls;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class APIRequests {
	
	private final static String APIURL = "https://api-football-v1.p.rapidapi.com/v2/";
	private JsonNode response;
	private static String APIKEY = "";
	
	public APIRequests() {
	}
	public void UnirestCall(String URL) throws UnirestException {
         response = Unirest.get(URL)
                .header("x-rapidapi-host", "api-football-v1.p.rapidapi.com")
                .header("x-rapidapi-key", APIKEY)
                .asJson()
                .getBody();
         System.out.println(response.toString());
		
	}
	
	/* Countries Returns
	 * Country String
	 * Code String
	 * Flag String (image in SVG format
	 */
	public JsonNode countriesRequest() throws UnirestException {
		
		UnirestCall(APIURL.concat("countries/"));
		System.out.println(response.toString());
		return response;
	}
	
	/* Seasons Returns
	 * Array of all Seasons available in API
	 */
	public JsonNode seasonsRequest() throws UnirestException {
		
		UnirestCall(APIURL.concat("seasons/"));
		System.out.println(response.toString());
		return response;
	}
	
	/*
	 * Leagues Returns 
	 * league_id : integer 
	 * name : string 
	 * type : string 
	 * country : string 
	 * country_code : string 
	 * season : integer 
	 * season_start : date YYYY-MM-DD
	 * season_end : date YYYY-MM-DD 
	 * logo : string image in png format, 150/150px
	 * flag : string image in svg format 
	 * standings : integer ‘1’ if standings are available else ‘0’ 
	 * is_current : integer ‘1’ if this is the current season
	 * else ‘0’
	 */
	public JsonNode leaguesRequest() throws UnirestException {
		
		UnirestCall(APIURL.concat("leagues/"));
		return response;
	}
	
	/*
	 * Same returns as above
	 */
	public JsonNode leaguesIDRequest(int league_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("league/") + league_id);
		System.out.println(response.toString());
		return response;
	}
	
	/*
	 * Same returns as above method 
	 * YYYY is year format
	 */
	public JsonNode leaguesSeasonRequest(int year) throws UnirestException {
		
		UnirestCall(APIURL.concat("leagues/season/") + year);
		System.out.println(response.toString());
		return response;
	}
	
	//same returns as league season request method
	public JsonNode leaguesSeasonsAvailableRequest(int league_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("leagues/seasonsAvailable/") + league_id);
		System.out.println(response.toString());
		return response;
	}
	
	//same returns as league season request method
	public JsonNode leaguesSeasonsAvailableSpecificSeasonRequest(int league_id, int year) throws UnirestException {
		
		UnirestCall(APIURL.concat("leagues/seasonsAvailable/") + league_id + "/" + year);
		System.out.println(response.toString());
		return response;
	}
	//same returns as league season request method
	public JsonNode leaguesCountryRequest(String countryOrCode) throws UnirestException {
		
		UnirestCall(APIURL.concat("leagues/country/").concat(countryOrCode));
		System.out.println(response.toString());
		return response;
	}
	//same returns as league season request method, YYYY format
	public JsonNode leaguesCountrySeasonRequest(String countryOrCode, int year) throws UnirestException {
		
		UnirestCall(APIURL.concat("leagues/country/").concat(countryOrCode) + "/" + year);
		System.out.println(response.toString());
		return response;
	}
	
	/*
	 * team_id : integer name : string code : string logo : string image in png
	 * format, 150/150px country : string founded : date YYYY venue_name : string
	 * venue_surface : string venue_address : string venue_city : string
	 * venue_capacity : integer
	 */
	public JsonNode teamRequest(int team_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("teams/team/") + team_id);
		System.out.println(response.toString());
		return response;
	}
	
	//same return as team request
	public JsonNode teamInLeagueRequest(int league_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("teams/league/") + league_id);
		System.out.println(response.toString());
		return response;
	}
	
	//Returns all years to select a year to see specific players
	public JsonNode playersRequest() throws UnirestException {
		
		UnirestCall(APIURL.concat("players/seasons/"));
		System.out.println(response.toString());
		return response;
	}
	
	public JsonNode playersInSpecificFixtureRequest(int fixture_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("players/fixture/") + fixture_id);
		System.out.println(response.toString());
		return response;
	}

	public JsonNode playersInSpecificFixtureRequest(int team_id, int season) throws UnirestException {
		
		UnirestCall(APIURL.concat("players/squad/") + team_id + "/" + season);
		System.out.println(response.toString());
		return response;
	}
	
	public JsonNode fixturesByDateRequest(String date) throws UnirestException {
		
		UnirestCall(APIURL.concat("fixtures/date/") +  date);
		return response;
	}
	
	public JsonNode predictionRequest(int fixture_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("predictions/") +  fixture_id);
		return response;
	}
	
	//returns list of bookmakers names and their bookmaker ID
	public JsonNode bookmakersRequest() throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/bookmakers"));
		return response;
	}
	
	public JsonNode bookmakersRequestWithId(int bookmaker_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/bookmakers/") + bookmaker_id );
		return response;
	}
	
	public JsonNode oddsLabelRequest() throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/labels"));
		return response;
	}
	
	public JsonNode oddsLabelRequestWithId(int label_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/labels/") + label_id);
		return response;
	}
	
	public JsonNode oddsForFixtureRequest(int fixture_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/fixture/") + fixture_id);
		return response;
	}
	
	public JsonNode oddsForFixtureSpecificBookmakerRequest(int fixture_id, int bookmaker_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/fixture/") + fixture_id + "/bookmaker/" +  bookmaker_id);
		return response;
	}
	
	public JsonNode oddsForFixtureSpecificLabelRequest(int fixture_id, int label_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/fixture/") + fixture_id + "/label/" +  label_id);
		return response;
	}
	
	public JsonNode oddsForLeagueRequest(int league_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/league/") + league_id);
		return response;
	}
	
	public JsonNode oddsForLeagueSpecificBookmakerRequest(int league_id, int bookmaker_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/league/") + league_id + "/bookmaker/" +  bookmaker_id);
		return response;
	}
	
	public JsonNode oddsForLeagueSpecificLabelRequest(int league_id, int label_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("odds/league/") + league_id + "/label/" +  label_id);
		return response;
	}
	
   public JsonNode teamsSearchRequest(String countryOrName) throws UnirestException {
	        
	        UnirestCall(APIURL.concat("teams/search/") + countryOrName);
	        return response;
    }
   
	public JsonNode leaguesStandingsRequest(int league_id) throws UnirestException {
		
		UnirestCall(APIURL.concat("leagueTable/") + league_id);
		System.out.println(response.toString());
		return response;
	}
	
	public JsonNode getResponse() {
		return response;
	}	
}
