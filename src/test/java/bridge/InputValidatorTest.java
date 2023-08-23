package bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {

    InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("다리 길이가 숫자가 아니면 에러가 발생한다.")
    void validateBridgeIsNumber(){
        assertThatThrownBy(() -> inputValidator.validateBridgeSize("ㅁ"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("다리 길이가 3~20사이가 아니면 에러가 발생한다.")
    void validateBridgeLength(){
        assertThatThrownBy(() -> inputValidator.validateBridgeSize("21"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("이동할 칸은 대문자 영어가 아니면 에러가 발생한다.")
    void validateBridgeStageUpperEnglish(){
        assertThatThrownBy(() -> inputValidator.validateBridgeStage("u"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("이동할 칸은 'U' 혹은 'D'가 아니면 에러가 발생한다.")
    void validateBridgeStage(){
        assertThatThrownBy(() -> inputValidator.validateBridgeStage("T"))
                .isInstanceOf(IllegalArgumentException.class);
    }




}
