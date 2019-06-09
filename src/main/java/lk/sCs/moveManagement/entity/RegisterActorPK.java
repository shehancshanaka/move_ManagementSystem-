package lk.sCs.moveManagement.entity;

public class RegisterActorPK {
    private int actorID;
    private int moveId;

    public RegisterActorPK() {
    }

    public RegisterActorPK(int actorID, int moveId) {
        this.actorID = actorID;
        this.moveId = moveId;
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }
}
