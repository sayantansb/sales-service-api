package api.sales.service.dto.internal;

public enum AccountAccessType {

    DOMAIN("domain"),
    IP_LOGIN("IP login"),
    PASSWORD("password"),
    SAML_2("SAML 2.0"),
    SHIBBOLETH("shibboleth"),
    SSO_LINK("SSO link");

    AccountAccessType(String displayString) {
        this.displayString = displayString; }
    private String displayString; public String toString() {
        return displayString;
    }

}
