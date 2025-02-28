import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private List<NPS> npcs = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();


    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(nps)
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs)
    }
}