
package api.sales.service.dto;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requesterId",
    "userId",
    "userContactAddress",
    "userBillingAddress",
    "clearingHouse",
    "liableOffice",
    "salesTeam",
    "salesManagerId",
    "accountBookingType",
    "billingTerms",
    "otherBillingTerms",
    "salesChannels",
    "areSeatsLimited",
    "seatsLimit",
    "accountAccessTypes",
    "agreementForm",
    "products",
    "subscriptionStartDate",
    "subscriptionFullMonths",
    "subscriptionEndDate",
    "pricePerMonth",
    "discountAmount",
    "newBusinessAmountPart",
    "renewalAmountPart",
    "invoiceAmount",
    "currency",
    "businessLanguage",
    "isPurchaseOrderNumberRequired",
    "purchaseOrderNumber",
    "vatId",
    "hasAutoCancellation",
    "contractDocumentUrl",
    "contractDocumentFileName",
    "contractDocument",
    "offerDocumentUrl",
    "offerDocumentFileName",
    "offerDocument",
    "isBundleBooking",
    "isInvoiceSplit",
    "dealType",
    "salesforceOpportunityId",
    "smRevenueShares",
    "flsRevenueShares",
    "additionalInfo",
    "version"
})
@Generated("jsonschema2pojo")
public class Request {

    @JsonProperty("requesterId")
    private Integer requesterId;
    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("userContactAddress")
    private UserContactAddress userContactAddress;
    @JsonProperty("userBillingAddress")
    private Object userBillingAddress;
    @JsonProperty("clearingHouse")
    private String clearingHouse;
    @JsonProperty("liableOffice")
    private String liableOffice;
    @JsonProperty("salesTeam")
    private String salesTeam;
    @JsonProperty("salesManagerId")
    private Integer salesManagerId;
    @JsonProperty("accountBookingType")
    private String accountBookingType;
    @JsonProperty("billingTerms")
    private String billingTerms;
    @JsonProperty("otherBillingTerms")
    private Object otherBillingTerms;
    @JsonProperty("salesChannels")
    private List<String> salesChannels = null;
    @JsonProperty("areSeatsLimited")
    private Boolean areSeatsLimited;
    @JsonProperty("seatsLimit")
    private Integer seatsLimit;
    @JsonProperty("accountAccessTypes")
    private List<String> accountAccessTypes = null;
    @JsonProperty("agreementForm")
    private String agreementForm;
    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("subscriptionStartDate")
    private Object subscriptionStartDate;
    @JsonProperty("subscriptionFullMonths")
    private Integer subscriptionFullMonths;
    @JsonProperty("subscriptionEndDate")
    private Object subscriptionEndDate;
    @JsonProperty("pricePerMonth")
    private Object pricePerMonth;
    @JsonProperty("discountAmount")
    private Object discountAmount;
    @JsonProperty("newBusinessAmountPart")
    private Object newBusinessAmountPart;
    @JsonProperty("renewalAmountPart")
    private Object renewalAmountPart;
    @JsonProperty("invoiceAmount")
    private Double invoiceAmount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("businessLanguage")
    private String businessLanguage;
    @JsonProperty("isPurchaseOrderNumberRequired")
    private Boolean isPurchaseOrderNumberRequired;
    @JsonProperty("purchaseOrderNumber")
    private Object purchaseOrderNumber;
    @JsonProperty("vatId")
    private Object vatId;
    @JsonProperty("hasAutoCancellation")
    private Object hasAutoCancellation;
    @JsonProperty("contractDocumentUrl")
    private Object contractDocumentUrl;
    @JsonProperty("contractDocumentFileName")
    private Object contractDocumentFileName;
    @JsonProperty("contractDocument")
    private Object contractDocument;
    @JsonProperty("offerDocumentUrl")
    private Object offerDocumentUrl;
    @JsonProperty("offerDocumentFileName")
    private Object offerDocumentFileName;
    @JsonProperty("offerDocument")
    private Object offerDocument;
    @JsonProperty("isBundleBooking")
    private Object isBundleBooking;
    @JsonProperty("isInvoiceSplit")
    private Object isInvoiceSplit;
    @JsonProperty("dealType")
    private String dealType;
    @JsonProperty("salesforceOpportunityId")
    private String salesforceOpportunityId;
    @JsonProperty("smRevenueShares")
    private List<SmRevenueShare> smRevenueShares = null;
    @JsonProperty("flsRevenueShares")
    private List<Object> flsRevenueShares = null;
    @JsonProperty("additionalInfo")
    private Object additionalInfo;
    @JsonProperty("version")
    private Object version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("requesterId")
    public Integer getRequesterId() {
        return requesterId;
    }

    @JsonProperty("requesterId")
    public void setRequesterId(Integer requesterId) {
        this.requesterId = requesterId;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("userContactAddress")
    public UserContactAddress getUserContactAddress() {
        return userContactAddress;
    }

    @JsonProperty("userContactAddress")
    public void setUserContactAddress(UserContactAddress userContactAddress) {
        this.userContactAddress = userContactAddress;
    }

    @JsonProperty("userBillingAddress")
    public Object getUserBillingAddress() {
        return userBillingAddress;
    }

    @JsonProperty("userBillingAddress")
    public void setUserBillingAddress(Object userBillingAddress) {
        this.userBillingAddress = userBillingAddress;
    }

    @JsonProperty("clearingHouse")
    public String getClearingHouse() {
        return clearingHouse;
    }

    @JsonProperty("clearingHouse")
    public void setClearingHouse(String clearingHouse) {
        this.clearingHouse = clearingHouse;
    }

    @JsonProperty("liableOffice")
    public String getLiableOffice() {
        return liableOffice;
    }

    @JsonProperty("liableOffice")
    public void setLiableOffice(String liableOffice) {
        this.liableOffice = liableOffice;
    }

    @JsonProperty("salesTeam")
    public String getSalesTeam() {
        return salesTeam;
    }

    @JsonProperty("salesTeam")
    public void setSalesTeam(String salesTeam) {
        this.salesTeam = salesTeam;
    }

    @JsonProperty("salesManagerId")
    public Integer getSalesManagerId() {
        return salesManagerId;
    }

    @JsonProperty("salesManagerId")
    public void setSalesManagerId(Integer salesManagerId) {
        this.salesManagerId = salesManagerId;
    }

    @JsonProperty("accountBookingType")
    public String getAccountBookingType() {
        return accountBookingType;
    }

    @JsonProperty("accountBookingType")
    public void setAccountBookingType(String accountBookingType) {
        this.accountBookingType = accountBookingType;
    }

    @JsonProperty("billingTerms")
    public String getBillingTerms() {
        return billingTerms;
    }

    @JsonProperty("billingTerms")
    public void setBillingTerms(String billingTerms) {
        this.billingTerms = billingTerms;
    }

    @JsonProperty("otherBillingTerms")
    public Object getOtherBillingTerms() {
        return otherBillingTerms;
    }

    @JsonProperty("otherBillingTerms")
    public void setOtherBillingTerms(Object otherBillingTerms) {
        this.otherBillingTerms = otherBillingTerms;
    }

    @JsonProperty("salesChannels")
    public List<String> getSalesChannels() {
        return salesChannels;
    }

    @JsonProperty("salesChannels")
    public void setSalesChannels(List<String> salesChannels) {
        this.salesChannels = salesChannels;
    }

    @JsonProperty("areSeatsLimited")
    public Boolean getAreSeatsLimited() {
        return areSeatsLimited;
    }

    @JsonProperty("areSeatsLimited")
    public void setAreSeatsLimited(Boolean areSeatsLimited) {
        this.areSeatsLimited = areSeatsLimited;
    }

    @JsonProperty("seatsLimit")
    public Integer getSeatsLimit() {
        return seatsLimit;
    }

    @JsonProperty("seatsLimit")
    public void setSeatsLimit(Integer seatsLimit) {
        this.seatsLimit = seatsLimit;
    }

    @JsonProperty("accountAccessTypes")
    public List<String> getAccountAccessTypes() {
        return accountAccessTypes;
    }

    @JsonProperty("accountAccessTypes")
    public void setAccountAccessTypes(List<String> accountAccessTypes) {
        this.accountAccessTypes = accountAccessTypes;
    }

    @JsonProperty("agreementForm")
    public String getAgreementForm() {
        return agreementForm;
    }

    @JsonProperty("agreementForm")
    public void setAgreementForm(String agreementForm) {
        this.agreementForm = agreementForm;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("subscriptionStartDate")
    public Object getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    @JsonProperty("subscriptionStartDate")
    public void setSubscriptionStartDate(Object subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    @JsonProperty("subscriptionFullMonths")
    public Integer getSubscriptionFullMonths() {
        return subscriptionFullMonths;
    }

    @JsonProperty("subscriptionFullMonths")
    public void setSubscriptionFullMonths(Integer subscriptionFullMonths) {
        this.subscriptionFullMonths = subscriptionFullMonths;
    }

    @JsonProperty("subscriptionEndDate")
    public Object getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    @JsonProperty("subscriptionEndDate")
    public void setSubscriptionEndDate(Object subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    @JsonProperty("pricePerMonth")
    public Object getPricePerMonth() {
        return pricePerMonth;
    }

    @JsonProperty("pricePerMonth")
    public void setPricePerMonth(Object pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    @JsonProperty("discountAmount")
    public Object getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discountAmount")
    public void setDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("newBusinessAmountPart")
    public Object getNewBusinessAmountPart() {
        return newBusinessAmountPart;
    }

    @JsonProperty("newBusinessAmountPart")
    public void setNewBusinessAmountPart(Object newBusinessAmountPart) {
        this.newBusinessAmountPart = newBusinessAmountPart;
    }

    @JsonProperty("renewalAmountPart")
    public Object getRenewalAmountPart() {
        return renewalAmountPart;
    }

    @JsonProperty("renewalAmountPart")
    public void setRenewalAmountPart(Object renewalAmountPart) {
        this.renewalAmountPart = renewalAmountPart;
    }

    @JsonProperty("invoiceAmount")
    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    @JsonProperty("invoiceAmount")
    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("businessLanguage")
    public String getBusinessLanguage() {
        return businessLanguage;
    }

    @JsonProperty("businessLanguage")
    public void setBusinessLanguage(String businessLanguage) {
        this.businessLanguage = businessLanguage;
    }

    @JsonProperty("isPurchaseOrderNumberRequired")
    public Boolean getIsPurchaseOrderNumberRequired() {
        return isPurchaseOrderNumberRequired;
    }

    @JsonProperty("isPurchaseOrderNumberRequired")
    public void setIsPurchaseOrderNumberRequired(Boolean isPurchaseOrderNumberRequired) {
        this.isPurchaseOrderNumberRequired = isPurchaseOrderNumberRequired;
    }

    @JsonProperty("purchaseOrderNumber")
    public Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    @JsonProperty("purchaseOrderNumber")
    public void setPurchaseOrderNumber(Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    @JsonProperty("vatId")
    public Object getVatId() {
        return vatId;
    }

    @JsonProperty("vatId")
    public void setVatId(Object vatId) {
        this.vatId = vatId;
    }

    @JsonProperty("hasAutoCancellation")
    public Object getHasAutoCancellation() {
        return hasAutoCancellation;
    }

    @JsonProperty("hasAutoCancellation")
    public void setHasAutoCancellation(Object hasAutoCancellation) {
        this.hasAutoCancellation = hasAutoCancellation;
    }

    @JsonProperty("contractDocumentUrl")
    public Object getContractDocumentUrl() {
        return contractDocumentUrl;
    }

    @JsonProperty("contractDocumentUrl")
    public void setContractDocumentUrl(Object contractDocumentUrl) {
        this.contractDocumentUrl = contractDocumentUrl;
    }

    @JsonProperty("contractDocumentFileName")
    public Object getContractDocumentFileName() {
        return contractDocumentFileName;
    }

    @JsonProperty("contractDocumentFileName")
    public void setContractDocumentFileName(Object contractDocumentFileName) {
        this.contractDocumentFileName = contractDocumentFileName;
    }

    @JsonProperty("contractDocument")
    public Object getContractDocument() {
        return contractDocument;
    }

    @JsonProperty("contractDocument")
    public void setContractDocument(Object contractDocument) {
        this.contractDocument = contractDocument;
    }

    @JsonProperty("offerDocumentUrl")
    public Object getOfferDocumentUrl() {
        return offerDocumentUrl;
    }

    @JsonProperty("offerDocumentUrl")
    public void setOfferDocumentUrl(Object offerDocumentUrl) {
        this.offerDocumentUrl = offerDocumentUrl;
    }

    @JsonProperty("offerDocumentFileName")
    public Object getOfferDocumentFileName() {
        return offerDocumentFileName;
    }

    @JsonProperty("offerDocumentFileName")
    public void setOfferDocumentFileName(Object offerDocumentFileName) {
        this.offerDocumentFileName = offerDocumentFileName;
    }

    @JsonProperty("offerDocument")
    public Object getOfferDocument() {
        return offerDocument;
    }

    @JsonProperty("offerDocument")
    public void setOfferDocument(Object offerDocument) {
        this.offerDocument = offerDocument;
    }

    @JsonProperty("isBundleBooking")
    public Object getIsBundleBooking() {
        return isBundleBooking;
    }

    @JsonProperty("isBundleBooking")
    public void setIsBundleBooking(Object isBundleBooking) {
        this.isBundleBooking = isBundleBooking;
    }

    @JsonProperty("isInvoiceSplit")
    public Object getIsInvoiceSplit() {
        return isInvoiceSplit;
    }

    @JsonProperty("isInvoiceSplit")
    public void setIsInvoiceSplit(Object isInvoiceSplit) {
        this.isInvoiceSplit = isInvoiceSplit;
    }

    @JsonProperty("dealType")
    public String getDealType() {
        return dealType;
    }

    @JsonProperty("dealType")
    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    @JsonProperty("salesforceOpportunityId")
    public String getSalesforceOpportunityId() {
        return salesforceOpportunityId;
    }

    @JsonProperty("salesforceOpportunityId")
    public void setSalesforceOpportunityId(String salesforceOpportunityId) {
        this.salesforceOpportunityId = salesforceOpportunityId;
    }

    @JsonProperty("smRevenueShares")
    public List<SmRevenueShare> getSmRevenueShares() {
        return smRevenueShares;
    }

    @JsonProperty("smRevenueShares")
    public void setSmRevenueShares(List<SmRevenueShare> smRevenueShares) {
        this.smRevenueShares = smRevenueShares;
    }

    @JsonProperty("flsRevenueShares")
    public List<Object> getFlsRevenueShares() {
        return flsRevenueShares;
    }

    @JsonProperty("flsRevenueShares")
    public void setFlsRevenueShares(List<Object> flsRevenueShares) {
        this.flsRevenueShares = flsRevenueShares;
    }

    @JsonProperty("additionalInfo")
    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("version")
    public Object getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Object version) {
        this.version = version;
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
