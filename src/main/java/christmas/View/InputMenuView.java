package christmas.View;

import christmas.Util.Rule;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputMenuView extends InputView{

    public List<String> getValue() {
        System.out.println(Rule.SECONDINPUT_MESSAGE);
        String result = inputValue();
        System.out.println();
        validate(result);
        return Stream.of(result.split(","))
                .map(String::toString)
                .collect(Collectors.toList());
    }
    private void validate(String inputValue) {
        if(inputValue.contains(",")) {

            for(String value : inputValue.split(",")) {
                validateFormat(value);
            }
        } else {
            validateFormat(inputValue);
        }
    }


    private void validateFormat(String inputValue) {
        if(!Rule.MENU_PATTERN.matcher(inputValue).matches()) {
            throw new IllegalArgumentException(Rule.MENUINPUT_ERROR);
        }
    }

}
