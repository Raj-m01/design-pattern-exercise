package net.media.training.designpattern.strategy;

public class ValidateEmptyStringStrategy implements StringValidationStrategy{
    @Override
    public void validate(String val, int maxLength) {
        if (val == null || val.length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }
}
