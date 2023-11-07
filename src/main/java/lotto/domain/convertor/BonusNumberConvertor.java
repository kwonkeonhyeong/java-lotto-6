package lotto.domain.convertor;
public class BonusNumberConvertor implements Convertor<String, Integer> {
    @Override
    public Integer convert(String value) {
        return convertInputValue(value);
    }

    public int convertInputValue(String inputValue) {
        return Integer.parseInt(inputValue);
    }
}
