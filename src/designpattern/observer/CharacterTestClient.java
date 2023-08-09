package net.media.training.designpattern.observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 12:26:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterTestClient {
    private List<Character> characters = new ArrayList<>();

    public CharacterTestClient() {
        characters.add(new Robot());
        characters.add(new Dog());
        characters.add(new Person());
        characters.add(new Cat());
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public boolean testOutdoors() {
        for (Character character : characters) {
            character.goOutdoors();
        }

        boolean allCharactersOutdoor = true;
        for (Character character : characters) {
            allCharactersOutdoor &&= character.isOutdoors();
        }
        
        return allCharactersOutdoor;
    }

    public boolean testSunRose() {
        for (Character character : characters) {
            character.notifySunRose();
        }

        boolean allCharactersFeelingWarm = true;
        for (Character character : characters) {
            allCharactersFeelingWarm &&= character.isFeelingWarm();
        }
        
        return allCharactersFeelingWarm;
    }

    public boolean testSunSet() {
        for (Character character : characters) {
            character.notifySunSet();
        }

        boolean anyCharacterFeelingWarm = false;
        for (Character character : characters) {
            anyCharacterFeelingWarm ||= character.isFeelingWarm();
        }
        
        return !anyCharacterFeelingWarm;
    }

    public boolean testIndoors() {
        for (Character character : characters) {
            character.goIndoors();
        }

        boolean anyCharacterOutdoor = false;
        for (Character character : characters) {
            anyCharacterOutdoor ||= character.isOutdoors();
        }
        
        return !anyCharacterOutdoor;
    }
}
