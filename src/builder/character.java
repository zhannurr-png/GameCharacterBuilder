package builder;
public class character {
    private String name;
    private String role;
    private String mainAbility;
    private String equipment;
    private String mobility;
    private String specialAttack;

    public character(
            String name,
            String role,
            String mainAbility,
            String equipment,
            String mobility,
            String specialAttack) {

        this.name = name;
        this.role = role;
        this.mainAbility = mainAbility;
        this.equipment = equipment;
        this.mobility = mobility;
        this.specialAttack = specialAttack;
    }

    @Override
    public String toString() {
        return "сharacter{" +
                "\n  Name: " + name +
                "\n  Role: " + role +
                "\n  Main Ability: " + mainAbility +
                "\n  Equipment: " + equipment +
                "\n  Mobility: " + mobility +
                "\n  Special Attack: " + specialAttack +
                "\n}";
    }
}