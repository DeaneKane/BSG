
package search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("venue_name")
    @Expose
    private String venueName;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("venue_capacity")
    @Expose
    private Integer venueCapacity;
    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("venue_address")
    @Expose
    private String venueAddress;
    @SerializedName("venue_surface")
    @Expose
    private String venueSurface;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("founded")
    @Expose
    private Integer founded;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("venue_city")
    @Expose
    private String venueCity;

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(Integer venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueSurface() {
        return venueSurface;
    }

    public void setVenueSurface(String venueSurface) {
        this.venueSurface = venueSurface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFounded() {
        return founded;
    }

    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getVenueCity() {
        return venueCity;
    }

    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

}
