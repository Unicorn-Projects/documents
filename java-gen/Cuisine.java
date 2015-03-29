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
    "cuisineId",
    "timestamp"
})
public class Cuisine {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisineId")
    private String cuisineId;
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
     *     The cuisineId
     */
    @JsonProperty("cuisineId")
    public String getCuisineId() {
        return cuisineId;
    }

    /**
     * 
     * (Required)
     * 
     * @param cuisineId
     *     The cuisineId
     */
    @JsonProperty("cuisineId")
    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId;
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
        return new HashCodeBuilder().append(cuisineId).append(timestamp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cuisine) == false) {
            return false;
        }
        Cuisine rhs = ((Cuisine) other);
        return new EqualsBuilder().append(cuisineId, rhs.cuisineId).append(timestamp, rhs.timestamp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
