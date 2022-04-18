package api.sales.service.dto.internal;

public enum ProfitCenter {

    ASIA("Asia"),
    DACH_CORE("Dach"),
    DACH_EU("EU"),
    FRANCE("FR"),
    UNITED_KINGDOM("UK"),
    UNITED_STATES("US");

    private String shortName; ProfitCenter(String shortName) {
        this.shortName = shortName; }
    public String getShortName() {
        return shortName;
    }

}
