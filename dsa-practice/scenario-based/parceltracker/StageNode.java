package dsapractice.parceltracker;

public class StageNode {
    String stageName;
    StageNode nextStage;

    public StageNode(String stageName) {
        this.stageName = stageName;
        this.nextStage = null;
    }
}


