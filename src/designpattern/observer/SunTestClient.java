package net.media.training.designpattern.observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 9:06:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class SunTestClient {
    private final List<Character> characters = new ArrayList<>();
    
    private static Map<Character, boolean> characterOutMap = new Hashtable<Character, boolean>();
    private Sun sun;

    public SunTestClient() {
        characters.add(new Person());
        characters.add(new Cat());
        characters.add(new Dog());
        characters.add(new Robot());
        this.sun = new Sun(characters);
    }

    public void aFewCharactersGoOutdoors(List<Character> outsideCharacters) {
        for(Character character : outsideCharacters) {
            character.goOutdoors();
            characterOutMap.put(character, true);
        }
    }

    public void aFewOtherCharactersGoOutdoors(List<Character> outsideCharacters) {
        for(Character character : outsideCharacters) {
            character.goOutdoors();
            characterOutMap.put(character, true);
        }
    }

    public void sunRise() {
        sun.rise();
    }

    public void sunSet() {
        sun.set();
    }

    public boolean charactersWhoWereOutAreFeelTired() {
        for(Character character : outsideCharacters) {
            if(character.isOutdoors() && !character.isFeelingTired())
                return false;
        }

        return true;
    }

    public boolean outdoorsCharactersFeelWarm() {
        for(Character character : outsideCharacters) {
            if(character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }

        for(Character character : outsideCharacters) {
            if(!character.isOutdoors() && character.isFeelingWarm())
                return false;
        }

        return true;
    }
}
