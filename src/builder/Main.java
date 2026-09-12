package builder;

public class Main {
    public static void main(String[] args) {
        characterDirector director = new characterDirector();
        character spiderMan = director.createSpiderMan();
        character greenGoblin = director.createGreenGoblin();

        System.out.println(spiderMan);
        System.out.println(greenGoblin);
    }
}