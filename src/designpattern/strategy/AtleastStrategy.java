package net.media.training.designpattern.strategy;

public class AtleastStrategy implements NumberValidationStrategy{

    @Override
    public void validate(int value, int cap) {
        if (value < cap)
            throw new RuntimeException("at least check failed:" + value);
    }
}
