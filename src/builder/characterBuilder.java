package builder;

public abstract class characterBuilder {
    protected String name = "Unknown";
    protected String role = "Unknown";
    protected String mainAbility = "Unknown";
    protected String equipment = "Unknown";
    protected String mobility = "Unknown";
    protected String specialAttack = "Unknown";
    public characterBuilder setname(String name){
        this.name = name;
        return this;
    }
    public characterBuilder setrole(String role){
        this.role = role;
        return this;
    }
    public characterBuilder setmainAbility(String mainAbility){
        this.mainAbility = mainAbility;
        return this;
    }
    public characterBuilder setequipment(String equipment){
        this.equipment = equipment;
        return this;
    }
    public characterBuilder setMobility(String mobility) {
        this.mobility = mobility;
        return this;
    }
    public characterBuilder setspecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
        return this;
    }

    public character build(){
        return new character(
            name,
            role,
            mainAbility,
            equipment,
            mobility,
            specialAttack
        );
    }
}