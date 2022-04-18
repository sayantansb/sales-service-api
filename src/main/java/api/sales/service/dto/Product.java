
package api.sales.service.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enumValue",
    "price",
    "pricePerMonth",
    "description"
})
@Generated("jsonschema2pojo")
public class Product {

    @JsonProperty("enumValue")
    private String enumValue;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("pricePerMonth")
    private Integer pricePerMonth;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("enumValue")
    public String getEnumValue() {
        return enumValue;
    }

    @JsonProperty("enumValue")
    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("pricePerMonth")
    public Integer getPricePerMonth() {
        return pricePerMonth;
    }

    @JsonProperty("pricePerMonth")
    public void setPricePerMonth(Integer pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
