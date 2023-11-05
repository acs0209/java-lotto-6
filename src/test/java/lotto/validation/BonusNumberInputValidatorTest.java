package lotto.validation;

import static lotto.validation.constant.BonusNumber.DUPLICATION_BONUS_NUMBER;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BonusNumberInputValidatorTest {

    @Test
    @DisplayName("보너스 번호와 당첨번호가 중복이 되면 예외가 발생하는 테스트 ")
    void testValidateBonusNumberDuplication() {
        BonusNumberInputValidator inputValidation = new BonusNumberInputValidator();

        String numbers = "1,2,3,4,5,6";
        String number = "6";

        assertThatThrownBy(() -> inputValidation.validateBonusNumberDuplication(numbers, number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(DUPLICATION_BONUS_NUMBER.getMessage());
    }
}