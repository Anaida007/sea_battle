package anaida.sea.battle.ship;

/** Субмарина (однопалубный корабль). */
public class Submarine implements Ship {

    /** Состояние палуб корабля. */
    // n - количество палуб в консанту в абстрактный класс
    // в конструкторе создавать new[n]
    // ранен/убит можно в абстрактый вынести
    boolean[] health = {false};

    @Override
    public boolean isWounded() {
        return false;
    }

    @Override
    public boolean isKilled() {
        return health[0];
    }

    @Override
    public void strike(int aDeck) {
        if (aDeck == 0) {
            health[0] = true;
        }
    }

    @Override
    public boolean isVertical() {
        return false;
    }
}
