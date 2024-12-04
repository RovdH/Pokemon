import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = addPokemon();
//        FirePokemon charmander = new FirePokemon("Charmander", "Charmander, Charmander, Charmander", 11, 100, 30, "Flamethrower", "Harden");
//        charmander.printInfo();
//        charmander.pokemonSpeaks();
//        charmander.attack();
    pokemon.printInfo();
    pokemon.pokemonSpeaks();
    pokemon.attack();
    }

    private static Pokemon addPokemon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoe heet je Pokemon?");
        String name = scanner.nextLine();
        System.out.println("Wat zegt je Pokemon?");
        String speaks = scanner.nextLine();
        System.out.println("Welk level is je Pokemon?");
        int level = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Welk type Pokemon is je Pokemon? \n Kies uit Fire, Water, Grass of Electric.");
        String type = scanner.nextLine();
        System.out.println("Wat voor aanval gebruikt je Pokemon?");
        String attack = scanner.nextLine();
        System.out.println("Wat voor verdediging gebruikt je Pokemon?");
        String defense = scanner.nextLine();
        return switch (type) {
            case "Fire" -> new FirePokemon(name, speaks, "Fire", level, 100, 40, attack, defense);
            case "Water" -> new WaterPokemon(name, speaks, "Water", 45, 100, 55, attack, defense);
            case "Grass" -> new GrassPokemon(name, speaks, "Grass", 32, 110, 69, attack, defense);
            case "Electric" -> new ElectricPokemon(name, speaks, "Electric", 66, 100, 89, attack, defense);
            default -> throw new IllegalStateException("Unknown Pokemon");
        };
    }
}
