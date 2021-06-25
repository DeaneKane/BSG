package fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fixture {

    @SerializedName("fixture_id")
    @Expose
    private int fixtureId;
    @SerializedName("league_id")
    @Expose
    private int leagueId;
    @SerializedName("event_date")
    @Expose
    private String eventDate;
    @SerializedName("event_timestamp")
    @Expose
    private int eventTimestamp;
    @SerializedName("firstHalfStart")
    @Expose
    private int firstHalfStart;
    @SerializedName("secondHalfStart")
    @Expose
    private int secondHalfStart;
    @SerializedName("round")
    @Expose
    private String round;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusShort")
    @Expose
    private String statusShort;
    @SerializedName("elapsed")
    @Expose
    private int elapsed;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("referee")
    @Expose
    private Object referee;
    @SerializedName("homeTeam")
    @Expose
    private HomeTeam homeTeam;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeam awayTeam;
    @SerializedName("goalsHomeTeam")
    @Expose
    private int goalsHomeTeam;
    @SerializedName("goalsAwayTeam")
    @Expose
    private int goalsAwayTeam;
    @SerializedName("score")
    @Expose
    private Score score;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fixture() {
    }

    /**
     * 
     * @param eventDate
     * @param awayTeam
     * @param eventTimestamp
     * @param firstHalfStart
     * @param status
     * @param score
     * @param round
     * @param venue
     * @param statusShort
     * @param goalsAwayTeam
     * @param elapsed
     * @param leagueId
     * @param goalsHomeTeam
     * @param secondHalfStart
     * @param referee
     * @param homeTeam
     * @param fixtureId
     */
    public Fixture(int fixtureId, int leagueId, String eventDate, int eventTimestamp, int firstHalfStart, int secondHalfStart, String round, String status, String statusShort, int elapsed, String venue, Object referee, HomeTeam homeTeam, AwayTeam awayTeam, int goalsHomeTeam, int goalsAwayTeam, Score score) {
        super();
        this.fixtureId = fixtureId;
        this.leagueId = leagueId;
        this.eventDate = eventDate;
        this.eventTimestamp = eventTimestamp;
        this.firstHalfStart = firstHalfStart;
        this.secondHalfStart = secondHalfStart;
        this.round = round;
        this.status = status;
        this.statusShort = statusShort;
        this.elapsed = elapsed;
        this.venue = venue;
        this.referee = referee;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goalsHomeTeam = goalsHomeTeam;
        this.goalsAwayTeam = goalsAwayTeam;
        this.score = score;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(int eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public int getFirstHalfStart() {
        return firstHalfStart;
    }

    public void setFirstHalfStart(int firstHalfStart) {
        this.firstHalfStart = firstHalfStart;
    }

    public int getSecondHalfStart() {
        return secondHalfStart;
    }

    public void setSecondHalfStart(int secondHalfStart) {
        this.secondHalfStart = secondHalfStart;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusShort() {
        return statusShort;
    }

    public void setStatusShort(String statusShort) {
        this.statusShort = statusShort;
    }

    public int getElapsed() {
        return elapsed;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Object getReferee() {
        return referee;
    }

    public void setReferee(Object referee) {
        this.referee = referee;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(int goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public int getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void setGoalsAwayTeam(int goalsAwayTeam) {
        this.goalsAwayTeam = goalsAwayTeam;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

}
