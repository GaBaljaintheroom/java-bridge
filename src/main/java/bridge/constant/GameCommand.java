package bridge.constant;

public enum GameCommand {
    UP_STAIR("U"),
    DOWN_STAIR("D"),
    BRIDGE_RETRY("R"),
    BRIDGE_QUITE("Q");


    private final static int  DOWN_RANDOM_NUMBER = 0;
    private final String command;

    GameCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return command;
    }

    public static String bridgeStageCase(int num){
        if (num == DOWN_RANDOM_NUMBER){
            return DOWN_STAIR.getCommand();
        }
        return UP_STAIR.getCommand();
    }

    public static boolean isNotBridgeStageCommand(String bridgeStage) {
        return !bridgeStage.equals(UP_STAIR.getCommand()) && !bridgeStage.equals(DOWN_STAIR.getCommand());
    }

    public static boolean isBridgeStageCommandU(String bridgeStage){
        return bridgeStage.equals(UP_STAIR.getCommand());
    }

    public static boolean isNotBridgeRetryCommand(String bridgeRetry){
        return !bridgeRetry.equals(BRIDGE_RETRY.getCommand()) && !bridgeRetry.equals(BRIDGE_QUITE.getCommand());
    }

    public static boolean isBridgeRetryCommandR(String bridgeRetry){
        return bridgeRetry.equals(BRIDGE_RETRY.getCommand());
    }

}