package api.sales.service.dto.internal;

public enum AccountBookingType {

    NEW_BUSINESS("new business"),
    UPGRADE("upgrade"),
    WINBACK("winback"),
    WINBACK_UPGRADE("winback upgrade");

    AccountBookingType(String displayString) {
        this.displayString = displayString;
    }
    private String displayString; public String toString() {
        return displayString;
    }
}
