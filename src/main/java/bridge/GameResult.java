package bridge;

public class GameResult {

    private static final String GAME_SUCCESS = "성공";
    private static final String GAME_FAIL = "실패";
    private final BridgeStatus bridgeStatus = new BridgeStatus();
    private final OutputView outputView = new OutputView();
    private int attemptCount = 0;
    private String gameClear = GAME_SUCCESS;

    public void printFailBridge(String bridgeMoveStep){
        bridgeStatus.failStair(bridgeMoveStep);
        outputView.printMap(bridgeStatus);
    }

    public void printSuccessBridge(String bridgeMoveStep){
        bridgeStatus.successStair(bridgeMoveStep);
        outputView.printMap(bridgeStatus);
    }

    public void restartGameSet(){
        bridgeStatus.reset();
    }

    public void upAttemptCount(){
        attemptCount++;
    }

    public void printGameResult(){
        outputView.printResult(this);
    }

    public void gameClearFail(){
        gameClear = GAME_FAIL;
    }

    public BridgeStatus getBridgeStatus() {
        return bridgeStatus;
    }

    public String getGameClear() {
        return gameClear;
    }

    public int getAttemptCount() {
        return attemptCount;
    }
}
