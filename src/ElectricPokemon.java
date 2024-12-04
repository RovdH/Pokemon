public class ElectricPokemon extends Pokemon {

    int level;
    int hp;
    int xp;
    private String attack;
    private String defense;

    public ElectricPokemon(String name, String speaks, String type, int level, int hp, int xp, String attack, String defense) {
        super(name, speaks, "Electric");
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    @Override
    public void attack() {
        System.out.println("Electric Pokemon: " + getName() + " level: " + level + " uses " + attack + " and " + defense);
    }
}
