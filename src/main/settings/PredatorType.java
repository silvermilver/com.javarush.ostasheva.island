package main.settings;

public enum PredatorType {

    WOLF("🐺"),
    BOA("🐍"),
    FOX("🦊"),
    BEAR("🐻"),
    EAGLE("🦅");

    private final String picture;

    PredatorType(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public static boolean isPredator(String name) {
        try {
            valueOf(name.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
