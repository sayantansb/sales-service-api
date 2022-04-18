
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
    "salesManagerId",
    "profitCenter",
    "totalShareInPercent",
    "totalShareValue"
})
@Generated("jsonschema2pojo")
public class SmRevenueShare {

    @JsonProperty("salesManagerId")
    private Integer salesManagerId;
    @JsonProperty("profitCenter")
    private String profitCenter;
    @JsonProperty("totalShareInPercent")
    private Double totalShareInPercent;
    @JsonProperty("totalShareValue")
    private Double totalShareValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("salesManagerId")
    public Integer getSalesManagerId() {
        return salesManagerId;
    }

    @JsonProperty("salesManagerId")
    public void setSalesManagerId(Integer salesManagerId) {
        this.salesManagerId = salesManagerId;
    }

    @JsonProperty("profitCenter")
    public String getProfitCenter() {
        return profitCenter;
    }

    @JsonProperty("profitCenter")
    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    @JsonProperty("totalShareInPercent")
    public Double getTotalShareInPercent() {
        return totalShareInPercent;
    }

    @JsonProperty("totalShareInPercent")
    public void setTotalShareInPercent(Double totalShareInPercent) {
        this.totalShareInPercent = totalShareInPercent;
    }

    @JsonProperty("totalShareValue")
    public Double getTotalShareValue() {
        return totalShareValue;
    }

    @JsonProperty("totalShareValue")
    public void setTotalShareValue(Double totalShareValue) {
        this.totalShareValue = totalShareValue;
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
