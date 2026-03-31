package dsapractice.parceltracker;

public class Parcel {
    String parcelId;
    StageNode head, currentStage;

    public Parcel(String parcelId) {
        this.parcelId = parcelId;
        this.head = new StageNode("Order Placed");
        this.currentStage = head;
    }

    public void addStage(String stageName) {
        StageNode newStage = new StageNode(stageName);
        currentStage.nextStage = newStage;
        currentStage=newStage;
    }

    public String trackParcel() {
        return currentStage.stageName;
    }
}
