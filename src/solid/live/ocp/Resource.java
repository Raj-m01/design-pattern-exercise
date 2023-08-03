package solid.live.ocp;

public interface Resource {

    public int findFreeSlot();
    public void markSlotBusy();
    public void markSlotFree();

}
