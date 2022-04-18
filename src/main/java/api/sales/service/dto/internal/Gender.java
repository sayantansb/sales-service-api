package api.sales.service.dto.internal;

public enum Gender {
    FEMALE(1),
    MALE(0);
    int value;
    Gender(int value) {
        this.value = value;
    }
    int getValue() {
        return value;
    }
}
