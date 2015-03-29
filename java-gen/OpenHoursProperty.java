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
    "mealType",
    "startTime",
    "endTime"
})
public class OpenHoursProperty {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mealType")
    private String mealType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    private String endTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mealType
     */
    @JsonProperty("mealType")
    public String getMealType() {
        return mealType;
    }

    /**
     * 
     * (Required)
     * 
     * @param mealType
     *     The mealType
     */
    @JsonProperty("mealType")
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The startTime
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param startTime
     *     The startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The endTime
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param endTime
     *     The endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
        return new HashCodeBuilder().append(mealType).append(startTime).append(endTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenHoursProperty) == false) {
            return false;
        }
        OpenHoursProperty rhs = ((OpenHoursProperty) other);
        return new EqualsBuilder().append(mealType, rhs.mealType).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
