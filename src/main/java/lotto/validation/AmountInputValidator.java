package lotto.validation;

import static lotto.validation.constant.AmountInput.NUMERIC_FORMAT_MESSAGE;
import static lotto.validation.constant.AmountInput.ONE_LOTTO_PRICE;
import static lotto.validation.constant.AmountInput.POSITIVE_CHECK_NUMBER;
import static lotto.validation.constant.AmountInput.POSITIVE_MESSAGE;
import static lotto.validation.constant.AmountInput.VALUE_DIVIDE_MESSAGE;

public class AmountInputValidator {

    public void validateInputNumericFormat(String input) {
        if (isNotNumericFormat(input)) {
            throw new IllegalArgumentException(NUMERIC_FORMAT_MESSAGE.getMessage());
        }
    }

    private boolean isNotNumericFormat(String input) {
        return !input.chars().allMatch(Character::isDigit);
    }

    public void validatePositive(String input) {
        int amountInput = Integer.parseInt(input);
        if (isNotPositive(amountInput)) {
            throw new IllegalArgumentException(POSITIVE_MESSAGE.getMessage());
        }
    }

    private boolean isNotPositive(int amountInput) {
        return amountInput < POSITIVE_CHECK_NUMBER.getNumber();
    }

    public void validateDivisibilityBy1000(String input) {
        int amountInput = Integer.parseInt(input);
        if (isNotValueDivisibleBy1000(amountInput)) {
            throw new IllegalArgumentException(VALUE_DIVIDE_MESSAGE.getMessage());
        }
    }

    private boolean isNotValueDivisibleBy1000(int amountInput) {
        return !(amountInput % ONE_LOTTO_PRICE.getNumber() == 0);
    }

    public void validateAmountInput(String input) {
        validateInputNumericFormat(input);
        validatePositive(input);
        validateDivisibilityBy1000(input);
    }
}
