package christmas.View;

import christmas.Util.Rule;

public class InputMenuView extends InputView{

    public String getValue() {
        System.out.println(Rule.SECONDINPUT_MESSAGE);
        String result = inputValue();
        System.out.println();
        validate(result);
        return result;
    }
    private void validate(String inputValue) {
        validateFormat(inputValue);
    }

    private void validateFormat(String inputValue) {
        if(!Rule.MENU_PATTERN.matcher(inputValue).matches()) {
            throw new IllegalArgumentException(Rule.MENUINPUT_ERROR);
        }
    }

}
