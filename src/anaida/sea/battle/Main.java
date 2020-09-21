package anaida.sea.battle;

import anaida.sea.battle.field.Field;

public class Main {

    public static void main(String[] args) {
        System.out.println("be gay. do crimes. shine bright.");
        System.out.println();
        Field field = new Field() {
            @Override
            public void test() {}
        };
        field.print();
    }
}
