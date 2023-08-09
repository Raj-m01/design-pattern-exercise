package net.media.training.designpattern.observer;

public class GameTestClient {
    private List<Character> characters = new ArrayList<>();
    public Sun sun;
    public Game game;

    public void setup() {
        characters.add(new Robot());
        characters.add(new Dog());
        characters.add(new Person());
        characters.add(new Cat());

        sun = new Sun(characters);
        game = new Game(sun);
    }

    public void addCharacter(Character character) {
        characters.add(character);
        sun.addCharacter(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
        sun.removeCharacter(character);
    }

    public void everyoneGoesOut() {
        for (Character character : characters) {
            character.goOutdoors();
        }
    }

    public void everyoneOutdoorsComesIn() {
        for (Character character : characters) {
            if(character.isOutdoors()) {
                character.goIndoors();
            }
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        for (Character character : characters) {
            if(character.isOutdoors() && !character.isFeelingWarm()) {
                return false;
            }
            if(!character.isOutdoors() && character.isFeelingWarm()) {
                return false;
            }
        }

        return true;
    }

    public boolean allFeelCold() {
        boolean anyCharacterFeelingWarm = false;
        for (Character character : characters) {
            anyCharacterFeelingWarm ||= character.isFeelingWarm();
        }
        return !anyCharacterFeelingWarm;
    }
}