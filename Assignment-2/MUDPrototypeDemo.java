public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Chamber", "A dark chamber with torches")
        Room clonedRoom = originalRoom.cloneEntity;

        System.out.println("original Room:" + originalRoom.getName());
        System.out.println("Cloned Room:" + clonedRoom.getName());

        NPC originalNPC = new NPC("Orc", "A large, ugly");
        NPC clonedNPC = originalNPC.cloneEntity();

        System.out.println("original NPC:" + originalNPC.getName());
        System.out.println("Cloned NPC:" + clonedNPC.getName());


    }
}