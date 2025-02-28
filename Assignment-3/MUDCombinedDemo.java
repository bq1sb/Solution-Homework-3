public class MUDCombinedDemo {
    public static void main(String[] args) {
        // Создаем базовое подземелье через Builder
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins")
                .addRoom(new Room("Entrance", "A dark entrance"))
                .addNPC(new NPC("Sceleton", "A wandering skeleton"))
                .build();
        // Клонируем комнату и добавляем клоны
        Room prototypeRoom = new Room("Hall", "A Grand hall with pillars");
        Room clone1 = prototypeRoom.cloneEntity();
        Room clone2 = prototypeRoom.cloneEntity();

        // Добавляем клоны в подземелье через Builder
        Dungeon extendedDungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins - Extended")
                .addRoom(clone1)
                .addRoom(clone2)
                .addNPC(new NPC("Zombie", "A slow-moving zombie"))
                .build();
        extendedDungeon.showInfo();
    }
}