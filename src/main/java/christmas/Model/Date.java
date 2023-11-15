package christmas.Model;

import christmas.Util.Rule;

public class Date {
    public final int date;

    public Date(int date) {
        validate(date);
        this.date = date;
    }

    private void validate(int inputValue) {
        validateRange(inputValue);
        validateZero(inputValue);
    }

    private void validateRange(int inputValue) {
        if (inputValue > Rule.MAX_DATE) {
            throw new IllegalArgumentException(Rule.DATERANGE_ERROR);
        }
    }

    private void validateZero(int inputValue) {
        if (inputValue == Rule.DATEZERO) {
            throw new IllegalArgumentException(Rule.DATEZERO_PATTERN);
        }
    }

    public int getDate() {
        return date;
    }
}
