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
    "restaurants",
    "userPrincipal"
})
public class IoTasteitRestActivitiesModelResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurants")
    private List<Restaurant> restaurants = new ArrayList<Restaurant>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("userPrincipal")
    private Integer userPrincipal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The restaurants
     */
    @JsonProperty("restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    /**
     * 
     * (Required)
     * 
     * @param restaurants
     *     The restaurants
     */
    @JsonProperty("restaurants")
    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The userPrincipal
     */
    @JsonProperty("userPrincipal")
    public Integer getUserPrincipal() {
        return userPrincipal;
    }

    /**
     * 
     * (Required)
     * 
     * @param userPrincipal
     *     The userPrincipal
     */
    @JsonProperty("userPrincipal")
    public void setUserPrincipal(Integer userPrincipal) {
        this.userPrincipal = userPrincipal;
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
        return new HashCodeBuilder().append(restaurants).append(userPrincipal).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IoTasteitRestActivitiesModelResponse) == false) {
            return false;
        }
        IoTasteitRestActivitiesModelResponse rhs = ((IoTasteitRestActivitiesModelResponse) other);
        return new EqualsBuilder().append(restaurants, rhs.restaurants).append(userPrincipal, rhs.userPrincipal).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
