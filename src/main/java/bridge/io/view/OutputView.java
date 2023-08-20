package bridge.io.view;

import bridge.controller.GameResultManager;
import bridge.model.BridgeStatus;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    private static final String RESULT_GAME_MESSAGE = "최종 게임 결과";
    private static final String WHETHER_GAME_SUCCESS = "게임 성공 여부: ";
    private static final String ALL_ATTEMPT_COUNT = "총 시도한 횟수: ";

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(BridgeStatus bridgeStatus) {
        System.out.println(bridgeStatus);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(GameResultManager gameResult) {
        System.out.println(RESULT_GAME_MESSAGE);
        System.out.println(gameResult.getBridgeStatus());
        System.out.println(WHETHER_GAME_SUCCESS + gameResult.getGameClear());
        System.out.println(ALL_ATTEMPT_COUNT + gameResult.getAttemptCount());
    }
}