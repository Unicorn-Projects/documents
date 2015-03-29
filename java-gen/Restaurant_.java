import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "servingMealTypes",
    "restaurantName",
    "latitude",
    "restaurantId",
    "followed",
    "logoUrl",
    "longitude"
})
public class Restaurant_ {

    @JsonProperty("servingMealTypes")
    private List<String> servingMealTypes = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurantName")
    private String restaurantName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    private Double latitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurantId")
    private String restaurantId;
    @JsonProperty("followed")
    private Boolean followed;
    @JsonProperty("logoUrl")
    private String logoUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    private Double longitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The servingMealTypes
     */
    @JsonProperty("servingMealTypes")
    public List<String> getServingMealTypes() {
        return servingMealTypes;
    }

    /**
     * 
     * @param servingMealTypes
     *     The servingMealTypes
     */
    @JsonProperty("servingMealTypes")
    public void setServingMealTypes(List<String> servingMealTypes) {
        this.servingMealTypes = servingMealTypes;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The restaurantName
     */
    @JsonProperty("restaurantName")
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * 
     * (Required)
     * 
     * @param restaurantName
     *     The restaurantName
     */
    @JsonProperty("restaurantName")
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * (Required)
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The restaurantId
     */
    @JsonProperty("restaurantId")
    public String getRestaurantId() {
        return restaurantId;
    }

    /**
     * 
     * (Required)
     * 
     * @param restaurantId
     *     The restaurantId
     */
    @JsonProperty("restaurantId")
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * 
     * @return
     *     The followed
     */
    @JsonProperty("followed")
    public Boolean getFollowed() {
        return followed;
    }

    /**
     * 
     * @param followed
     *     The followed
     */
    @JsonProperty("followed")
    public void setFollowed(Boolean followed) {
        this.followed = followed;
    }

    /**
     * 
     * @return
     *     The logoUrl
     */
    @JsonProperty("logoUrl")
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 
     * @param logoUrl
     *     The logoUrl
     */
    @JsonProperty("logoUrl")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * (Required)
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(servingMealTypes).append(restaurantName).append(latitude).append(restaurantId).append(followed).append(logoUrl).append(longitude).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restaurant_) == false) {
            return false;
        }
        Restaurant_ rhs = ((Restaurant_) other);
        return new EqualsBuilder().append(servingMealTypes, rhs.servingMealTypes).append(restaurantName, rhs.restaurantName).append(latitude, rhs.latitude).append(restaurantId, rhs.restaurantId).append(followed, rhs.followed).append(logoUrl, rhs.logoUrl).append(longitude, rhs.longitude).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
