
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class H2h_ {

    @SerializedName("fixture_id")
    @Expose
    private int fixtureId;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("goalsHomeTeam")
    @Expose
    private int goalsHomeTeam;
    @SerializedName("goalsAwayTeam")
    @Expose
    private int goalsAwayTeam;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeam awayTeam;
    @SerializedName("event_timestamp")
    @Expose
    private int eventTimestamp;
    @SerializedName("referee")
    @Expose
    private String referee;
    @SerializedName("elapsed")
    @Expose
    private int elapsed;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("round")
    @Expose
    private String round;
    @SerializedName("event_date")
    @Expose
    private String eventDate;
    @SerializedName("statusShort")
    @Expose
    private String statusShort;
    @SerializedName("homeTeam")
    @Expose
    private HomeTeam homeTeam;
    @SerializedName("secondHalfStart")
    @Expose
    private int secondHalfStart;
    @SerializedName("firstHalfStart")
    @Expose
    private int firstHalfStart;
    @SerializedName("league_id")
    @Expose
    private int leagueId;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public H2h_() {
    }

    /**
     * 
     * @param eventDate
     * @param awayTeam
     * @param eventTimestamp
     * @param status
     * @param firstHalfStart
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
    public H2h_(int fixtureId, String venue, int goalsHomeTeam, int goalsAwayTeam, AwayTeam awayTeam, int eventTimestamp, String referee, int elapsed, Score score, String round, String eventDate, String statusShort, HomeTeam homeTeam, int secondHalfStart, int firstHalfStart, int leagueId, String status) {
        super();
        this.fixtureId = fixtureId;
        this.venue = venue;
        this.goalsHomeTeam = goalsHomeTeam;
        this.goalsAwayTeam = goalsAwayTeam;
        this.awayTeam = awayTeam;
        this.eventTimestamp = eventTimestamp;
        this.referee = referee;
        this.elapsed = elapsed;
        this.score = score;
        this.round = round;
        this.eventDate = eventDate;
        this.statusShort = statusShort;
        this.homeTeam = homeTeam;
        this.secondHalfStart = secondHalfStart;
        this.firstHalfStart = firstHalfStart;
        this.leagueId = leagueId;
        this.status = status;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(int eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public int getElapsed() {
        return elapsed;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getStatusShort() {
        return statusShort;
    }

    public void setStatusShort(String statusShort) {
        this.statusShort = statusShort;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getSecondHalfStart() {
        return secondHalfStart;
    }

    public void setSecondHalfStart(int secondHalfStart) {
        this.secondHalfStart = secondHalfStart;
    }

    public int getFirstHalfStart() {
        return firstHalfStart;
    }

    public void setFirstHalfStart(int firstHalfStart) {
        this.firstHalfStart = firstHalfStart;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
