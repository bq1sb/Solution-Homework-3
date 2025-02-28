public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark entrance"))
                .addRoom(new Room("Chamber", "A mysterious chamber"))
                .addNPC(new NPC("Goblin", "A small green creature"))
                .build();
        dungeon.showInfo();
    }
}