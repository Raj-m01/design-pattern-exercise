package net.media.training.designpattern.strategy;

public class AtmostStrategy implements NumberValidationStrategy{
    @Override
    public void validate(int value, int cap) {
        if (value > cap)
            throw new RuntimeException("at least check failed:" + value);
    }
}
