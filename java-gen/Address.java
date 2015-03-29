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
    "zipCode",
    "country",
    "city",
    "localAddress",
    "state"
})
public class Address {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("localAddress")
    private String localAddress;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The zipCode
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param zipCode
     *     The zipCode
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The localAddress
     */
    @JsonProperty("localAddress")
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * 
     * (Required)
     * 
     * @param localAddress
     *     The localAddress
     */
    @JsonProperty("localAddress")
    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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
        return new HashCodeBuilder().append(zipCode).append(country).append(city).append(localAddress).append(state).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(zipCode, rhs.zipCode).append(country, rhs.country).append(city, rhs.city).append(localAddress, rhs.localAddress).append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
