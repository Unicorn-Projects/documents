import java.util.HashMap;
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
    "restaurant",
    "timestamp"
})
public class Restaurant {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurant")
    private Restaurant_ restaurant;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The restaurant
     */
    @JsonProperty("restaurant")
    public Restaurant_ getRestaurant() {
        return restaurant;
    }

    /**
     * 
     * (Required)
     * 
     * @param restaurant
     *     The restaurant
     */
    @JsonProperty("restaurant")
    public void setRestaurant(Restaurant_ restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * (Required)
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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
        return new HashCodeBuilder().append(restaurant).append(timestamp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restaurant) == false) {
            return false;
        }
        Restaurant rhs = ((Restaurant) other);
        return new EqualsBuilder().append(restaurant, rhs.restaurant).append(timestamp, rhs.timestamp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
