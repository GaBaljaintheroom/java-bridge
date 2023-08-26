package bridge.constant;

public enum GameProgressMessage {

    BRIDGE_GAME_START("다리 건너기 게임을 시작합니다."),

    // input
    INPUT_BRIDGE_LENGTH("다리의 길이를 입력해주세요."),
    INPUT_BRIDGE_STAGE("이동할 칸을 선택해주세요. (위: %s, 아래: %s)"),
    INPUT_BRIDGE_RETRY("게임을 다시 시도할지 여부를 입력해주세요. (재시도: %s, 종료: %s)"),

    //output
    OUTPUT_FINAL_GAME_RESULT("최종 게임 결과"),
    OUTPUT_BRIDGE_SUCCESS_OR_NOT("게임 성공 여부: %s"),
    OUTPUT_BRIDGE_ATTEMPT_RESULT("총 시도한 횟수: %d");

    private final String message;

    GameProgressMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}