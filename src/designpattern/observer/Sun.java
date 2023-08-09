package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    private final List<Character> characters = new ArrayList<>();

    public Sun(List<Character> characters) {
        this.characters = characters;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;

        for (Character character : characters) {
            if(character.isOutdoors()) {
                character.notifySunSet();
            }
        }
    }

    public void rise() {
        isUp = true;

        for (Character character : characters) {
            if(character.isOutdoors()) {
                character.notifySunRose();
            }
        }
    }
}