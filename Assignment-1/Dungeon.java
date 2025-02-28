import java.util.List
public class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<npcs>;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void showInfo() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: ");
        for (Room room : rooms) {
            System.out.println(" - " + room.getName());
        }
        System.out.println("Npcs: ");
        for (Nps npc : npcs) {
            System.out > println(" - " + npc.getName())
        }
    }
}
