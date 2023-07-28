package self.java.reflection.data;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private final String decription;

    Gender(String decription) {
        this.decription = decription;
    }

    public String getDecription() {
        return decription;
    }
}
