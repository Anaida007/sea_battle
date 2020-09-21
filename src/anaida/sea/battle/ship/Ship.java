package anaida.sea.battle.ship;

/** Интерфейс, описывающий корабль. */
public interface Ship {

    /**
     * Возвращает признак того, что кораболь подбит, экипаж ранен.
     */
    public boolean isWounded();

    /**
     * Возвращает признак того, что корабль потоплен, экипаж убит.
     */
    public boolean isKilled();

    /**
     * Наносит удар по кораблю.
     *
     * @param aDeck номер палубы, по которой нанесен удар
     */
    public void strike(int aDeck);

    /**
     * Возвращает признак, расположен ли корабль на поле вертикально.
     *
     * @return {@code true} если корабль расположен вертикально, иначе {@code false}
     */
    public boolean isVertical();
}
