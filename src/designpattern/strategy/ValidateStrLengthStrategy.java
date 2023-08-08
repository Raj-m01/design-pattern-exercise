package net.media.training.designpattern.strategy;

public class ValidateStrLengthStrategy implements StringValidationStrategy{
    @Override
    public void validate(String val, int allowedLength) {
        if (val.length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }
}
