package controller;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;

import apicalls.APIRequests;
import aws.FixturesCreateTable;
import aws.FixturesLoadData;
import aws.LeaguesCreateTable;
import aws.LeaguesLoadData;
import aws.TeamsCreateTable;
import aws.TeamsLoadData;
import fixtures.Fixture;
import fixtures.Fixtures;
import leaguestandings.LeagueStandings;
import odds.OddsForLeague;
import predictions.PredictionsMain;
import search.Search;


public class Main {

	public static void main(String[] args) throws Exception {

		String advice = "";
		String homeWinningPercent = "";
		String drawPercent = "";
		String awayWinningPercent = "";
		ArrayList <String> homeTeam = new ArrayList<>();
		ArrayList <String> awayTeam = new ArrayList<>();
		int league_id = 0;
		ArrayList<Integer> fixture_id = new ArrayList<>();
		APIRequests request = new APIRequests();
		Gson gson = new Gson();
		
		
		String requestString = request.fixturesByDateRequest( "2019-12-21" ).toString();
		Fixtures fixtures = gson.fromJson(requestString, Fixtures.class);
//		Search search = gson.fromJson(requestSTring, Search.class);
//		
//		for(int i = 0; i < ls.getApi().getStandings().get(0).size(); i++) {
//			System.out.println(ls.getApi().getStandings().get(0).get(i).getTeamName());
//		}

		for (int i = 0; i < fixtures.getApi().getFixtures().size(); i++) {
			if (fixtures.getApi().getFixtures().get(i).getLeagueId() == 524) {
				homeTeam.add(fixtures.getApi().getFixtures().get(i).getHomeTeam().getTeamName());
				awayTeam.add(fixtures.getApi().getFixtures().get(i).getAwayTeam().getTeamName());
//				league_id = fixtures.getApi().getFixtures().get(i).getLeagueId();
				fixture_id.add(fixtures.getApi().getFixtures().get(i).getFixtureId());
			}
		}
		
		System.out.println("------Premier League Fixtures 21/09/19------");

		for (int i = 0; i < fixture_id.size(); i++) {
			String prediction = request.predictionRequest(fixture_id.get(i)).toString();
			PredictionsMain predictor = gson.fromJson(prediction, PredictionsMain.class);

			for (int j = 0; j < predictor.getApi().getPredictions().size(); j++) {
				advice = predictor.getApi().getPredictions().get(j).getAdvice();
				homeWinningPercent = predictor.getApi().getPredictions().get(j).getWinningPercent().getHome();
				drawPercent = predictor.getApi().getPredictions().get(j).getWinningPercent().getDraws();
				awayWinningPercent = predictor.getApi().getPredictions().get(j).getWinningPercent().getAway();
				System.out.println(homeTeam.get(i) + " v " + awayTeam.get(i) + " Advice: " + advice + "$ Home %: "
						+ homeWinningPercent + " Away %: " + awayWinningPercent + " Draw %: " + drawPercent);
			}
		}
	}
}
