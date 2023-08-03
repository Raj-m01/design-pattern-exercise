package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId = resource.findFreeSlot();
        resource.markSlotBusy();
        return resourceId;
//        switch (resourceType) {
//            case TIME_SLOT:
//                resourceId = findFreeTimeSlot();
//                markTimeSlotBusy(resourceId);
//                break;
//            case SPACE_SLOT:
//                resourceId = findFreeSpaceSlot();
//                markSpaceSlotBusy(resourceId);
//                break;
//            default:
//                System.out.println("ERROR: Attempted to allocate invalid resource");
//                resourceId = INVALID_RESOURCE_ID;
//                break;
//        }
    }

    public void free(Resource resource) {
            resource.markSlotFree();
//        switch (resourceType) {
//            case TIME_SLOT:
//                markTimeSlotFree(resourceId);
//                break;
//            case SPACE_SLOT:
//                markSpaceSlotFree(resourceId);
//                break;
//
//            default:
//                System.out.println("ERROR: attempted to free invalid resource");
//                break;
//        }
    }

}
