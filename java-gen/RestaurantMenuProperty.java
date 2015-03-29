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
    "favorites",
    "imageRatio",
    "price",
    "imageUrl",
    "cuisineId",
    "cuisineDesc",
    "vegetarian",
    "glutenFree",
    "mealTypes",
    "cuisineName",
    "favorited"
})
public class RestaurantMenuProperty {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("favorites")
    private Integer favorites;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageRatio")
    private Double imageRatio;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private Double price;
    @JsonProperty("imageUrl")
    private String imageUrl;
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
    @JsonProperty("cuisineDesc")
    private String cuisineDesc;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vegetarian")
    private Boolean vegetarian;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("glutenFree")
    private Boolean glutenFree;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mealTypes")
    private List<String> mealTypes = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisineName")
    private String cuisineName;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The favorites
     */
    @JsonProperty("favorites")
    public Integer getFavorites() {
        return favorites;
    }

    /**
     * 
     * (Required)
     * 
     * @param favorites
     *     The favorites
     */
    @JsonProperty("favorites")
    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The imageRatio
     */
    @JsonProperty("imageRatio")
    public Double getImageRatio() {
        return imageRatio;
    }

    /**
     * 
     * (Required)
     * 
     * @param imageRatio
     *     The imageRatio
     */
    @JsonProperty("imageRatio")
    public void setImageRatio(Double imageRatio) {
        this.imageRatio = imageRatio;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * (Required)
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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
     *     The cuisineDesc
     */
    @JsonProperty("cuisineDesc")
    public String getCuisineDesc() {
        return cuisineDesc;
    }

    /**
     * 
     * (Required)
     * 
     * @param cuisineDesc
     *     The cuisineDesc
     */
    @JsonProperty("cuisineDesc")
    public void setCuisineDesc(String cuisineDesc) {
        this.cuisineDesc = cuisineDesc;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The vegetarian
     */
    @JsonProperty("vegetarian")
    public Boolean getVegetarian() {
        return vegetarian;
    }

    /**
     * 
     * (Required)
     * 
     * @param vegetarian
     *     The vegetarian
     */
    @JsonProperty("vegetarian")
    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The glutenFree
     */
    @JsonProperty("glutenFree")
    public Boolean getGlutenFree() {
        return glutenFree;
    }

    /**
     * 
     * (Required)
     * 
     * @param glutenFree
     *     The glutenFree
     */
    @JsonProperty("glutenFree")
    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mealTypes
     */
    @JsonProperty("mealTypes")
    public List<String> getMealTypes() {
        return mealTypes;
    }

    /**
     * 
     * (Required)
     * 
     * @param mealTypes
     *     The mealTypes
     */
    @JsonProperty("mealTypes")
    public void setMealTypes(List<String> mealTypes) {
        this.mealTypes = mealTypes;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The cuisineName
     */
    @JsonProperty("cuisineName")
    public String getCuisineName() {
        return cuisineName;
    }

    /**
     * 
     * (Required)
     * 
     * @param cuisineName
     *     The cuisineName
     */
    @JsonProperty("cuisineName")
    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

    /**
     * 
     * @return
     *     The favorited
     */
    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * 
     * @param favorited
     *     The favorited
     */
    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
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
        return new HashCodeBuilder().append(favorites).append(imageRatio).append(price).append(imageUrl).append(cuisineId).append(cuisineDesc).append(vegetarian).append(glutenFree).append(mealTypes).append(cuisineName).append(favorited).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestaurantMenuProperty) == false) {
            return false;
        }
        RestaurantMenuProperty rhs = ((RestaurantMenuProperty) other);
        return new EqualsBuilder().append(favorites, rhs.favorites).append(imageRatio, rhs.imageRatio).append(price, rhs.price).append(imageUrl, rhs.imageUrl).append(cuisineId, rhs.cuisineId).append(cuisineDesc, rhs.cuisineDesc).append(vegetarian, rhs.vegetarian).append(glutenFree, rhs.glutenFree).append(mealTypes, rhs.mealTypes).append(cuisineName, rhs.cuisineName).append(favorited, rhs.favorited).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
