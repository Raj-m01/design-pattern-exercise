package net.media.training.designpattern.observer;

public interface Character {
    boolean isFeelingWarm();

    void goOutdoors();

    void goIndoors();

    boolean isOutdoors();

    void notifySunRose();

    void notifySunSet();

    boolean isFeelingTired();
}