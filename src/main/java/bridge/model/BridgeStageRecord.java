package bridge.model;

public class BridgeStageRecord {

    private static final int firstStage = 0;
    private static int curStage = firstStage;
    private static boolean canMoveNextStage = true;
    private static boolean clearsGame = false;
    private static int totalAttemptCount = 1;

    public static int getCurStage() {
        return curStage;
    }

    public static void nextStage(){
        curStage++;
    }

    public static void reset(){
        curStage = firstStage;
        canMoveNextStage = true;
        totalAttemptCount++;
    }

    public static void changeMoveStatus(boolean stageStatus){
        canMoveNextStage = stageStatus;
    }

    public static void changeProgressStatus(boolean stageStatus) {
        clearsGame = stageStatus;
    }

    public static boolean isProgressing(){
        return canMoveNextStage && !clearsGame;
    }

    public static boolean canNotMoveNextStage() {
        return !canMoveNextStage;
    }

    public static boolean clearsGame() {
        return clearsGame;
    }

    public static int getTotalAttemptCount() {
        return totalAttemptCount;
    }
}