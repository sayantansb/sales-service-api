
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
    "firstname",
    "lastname",
    "gender",
    "companyName",
    "phoneNumber",
    "emailAddress",
    "country",
    "federalState",
    "city",
    "zipCode",
    "street",
    "houseNo",
    "addOn"
})
@Generated("jsonschema2pojo")
public class UserContactAddress {

    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("country")
    private String country;
    @JsonProperty("federalState")
    private String federalState;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("street")
    private String street;
    @JsonProperty("houseNo")
    private String houseNo;
    @JsonProperty("addOn")
    private String addOn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("federalState")
    public String getFederalState() {
        return federalState;
    }

    @JsonProperty("federalState")
    public void setFederalState(String federalState) {
        this.federalState = federalState;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("houseNo")
    public String getHouseNo() {
        return houseNo;
    }

    @JsonProperty("houseNo")
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @JsonProperty("addOn")
    public String getAddOn() {
        return addOn;
    }

    @JsonProperty("addOn")
    public void setAddOn(String addOn) {
        this.addOn = addOn;
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
