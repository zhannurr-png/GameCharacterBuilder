package builder;

public class characterDirector {
    public character createSpiderMan(){
        return new spiderManBuilder()
                .setname("Peter Parker")
                .setrole("Hero")
                .setmainAbility("Spider sense")
                .setequipment("Web shooters")
                .setMobility("wall crawling")
                .setspecialAttack("web attack")
                .build();
    }
    public character createGreenGoblin(){
        return new greenGoblinBuilder()
                .setname("Norman Osborn")
                .setrole("Villain")
                .setmainAbility("Enhanced reflexes")
                .setequipment("Goblin glider")
                .setMobility("gliding")
                .setspecialAttack("Pumpkin Bomb")
                .build();
    }
}
