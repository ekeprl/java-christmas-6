package christmas.View;

import christmas.Util.Rule;

public class InputDateView extends InputView{

    public Integer getValue() {
        System.out.println(Rule.FIRSTINPUT_MESSAGE);
        String result = inputValue();
        System.out.println();
        validate(result);
        return Integer.parseInt(result);
    }

    private void validate(String inputValue) {
        validateFormat(inputValue);
    }

    private void validateFormat(String inputValue) {
        if(!Rule.NUMBER_PATTERN.matcher(inputValue).matches()) {
            throw new IllegalArgumentException(Rule.WRONGNUM_ERROR);
        }
    }

}
