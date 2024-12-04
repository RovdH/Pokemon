import java.util.Objects;

public abstract class Pokemon {

    private static String name;
    private static String speaks;
    private static String type;

    public Pokemon(String name, String speaks, String type) {
        this.name = name;
        this.speaks = speaks;
        this.type = type;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pokemon.name = name;
    }

    public static String getSpeaks() {
        return speaks;
    }

    public static void setSpeaks(String speaks) {
        Pokemon.speaks = speaks;
    }

    public void pokemonSpeaks() {
        System.out.println("Pokemon: " + name + " says " + speaks);
    }

    public void printInfo() {
        switch (type) {
            case "Fire" -> System.out.println("Pokemon type: " + type + " is strong against Grass");
            case "Water" -> System.out.println("Pokemon type: " + type + " is strong against Fire");
            case "Grass" -> System.out.println("Pokemon type: " + type + " is strong against Electric");
            case "Electric" -> System.out.println("Pokemon type: " + type + " is strong against Water");
            case null, default -> System.out.println("Pokemon type unknown please scan with PokeDex");
        }

    }

    public abstract void attack();


