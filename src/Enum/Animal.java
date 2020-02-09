package Enum;

public enum Animal {
    DOG("suo"), CAT("kate"), FROG("varle"), FISH("zuvis");
    private String translation;

    Animal() {
    }

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
