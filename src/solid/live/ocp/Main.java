package solid.live.ocp;

public class Main {

    public static void main(String[] args) {

        TimeResource timeResource = new TimeResource();
        SpaceResource spaceResource = new SpaceResource();
        ResourceAllocator resourceAllocator = new ResourceAllocator();
        resourceAllocator.allocate(timeResource);
        resourceAllocator.allocate(spaceResource);


    }
}
