package anaida.sea.battle.field;

import java.awt.font.FontRenderContext;

/**
 * Абстрактный класс поля игры.
 */
public abstract class Field {

    /** Размер поля. */
    private static int N = 10;

    /** Поле. */
    private int[][] field = {
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    /**
     * Печатает поле.
     */
    public void print() {
        System.out.println("  a b c d e f g h l j");
        System.out.println("  _ _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < N; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < N; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("  - - - - - - - - - -");
    }

    public abstract void test();
}
