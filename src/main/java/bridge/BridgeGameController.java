package bridge;

public class BridgeGameController {

    private final InputManager inputManager;
    private final GameResult gameResult;

    public BridgeGameController() {
        this.inputManager = new InputManager();
        this.gameResult = new GameResult();
    }

    public void gameStart(){
        try{
            System.out.println("다리 건너기 게임을 시작합니다.\n");
            BridgeGame bridgeGame = new BridgeGame(inputManager.makeBridge());
            boolean isProceed = true;
            while (isProceed){
                gameResult.upAttemptCount();
                if(inputManager.isClearMoveBridge(bridgeGame, gameResult)){
                    gameResult.printGameResult();
                    break;
                }
                isProceed = isRetryGame(bridgeGame);
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    private boolean isRetryGame(BridgeGame bridgeGame) {
        boolean isRetryGame = inputManager.isRetryGame(bridgeGame);
        if(isRetryGame){
            gameResult.restartGameSet();
            return true;
        }
        gameResult.gameClearFail();
        gameResult.printGameResult();
        return false;
    }
}
