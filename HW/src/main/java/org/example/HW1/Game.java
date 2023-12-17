package HW1;

import java.util.ArrayList;
import java.util.List;

public class Game {

    /**
     * Класс для реализации игры
     */

    private Player player;
    private List<Door> doors = new ArrayList<>();

    public Game(Player player, List<Door> doors) {
        this.player = player;
        this.doors = doors;
    }

    public Door round (int door) {
        if (!player.getRisk()) return doors.get(door);
        else {
            doors.remove(doors.get(door));
            return doors.get(0).isPrize() ? doors.get(0) : doors.get(1);
        }
    }
}