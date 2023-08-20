package bridge.io.view;

import bridge.constant.GameCommand;
import bridge.constant.GameProgressMessage;
import bridge.io.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String input;
        do {
            input = inputBridgeSize();
        } while (input == null);

        return Integer.parseInt(input);
    }

    private String inputBridgeSize() {
        System.out.println(GameProgressMessage.INPUT_BRIDGE_LENGTH);
        String bridgeSize = Console.readLine();
        System.out.println(GameProgressMessage.BLANK);
        try {
            inputValidator.validateBridgeSize(bridgeSize);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving(){
        String input;
        do{
            input = inputBridgeMoveStep();
        }while (input == null);
        return input;
    }

    private String inputBridgeMoveStep() {
        System.out.println(String.format(GameProgressMessage.INPUT_MOVE_STAIR.toString()
                , GameCommand.UP_BRIDGE, GameCommand.DOWN_BRIDGE));
        String bridgeMoveStep = Console.readLine();
        try {
            inputValidator.validateBridgeMoveStep(bridgeMoveStep);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        return bridgeMoveStep;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand(){
        String input;
        do{
            input = inputRetryCommand();
        }while (input == null);
        return input;
    }

    private String inputRetryCommand() {
        System.out.println(String.format(GameProgressMessage.INPUT_RETRY_GAME.toString()
                , GameCommand.RETRY, GameCommand.QUIT));
        String retryCommand = Console.readLine();
        try {
            inputValidator.validateBridgeStartCommand(retryCommand);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        return retryCommand;
    }
}