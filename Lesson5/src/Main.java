import backpack.Backpack;
import backpack.Things;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Exponent (2, 4).getResult());
        System.out.println(new Exponent (2, -1).getResult());
        System.out.println(new Exponent (2, 0).getResult());
        System.out.println(new Exponent (0, 2).getResult());

        List<Things> things = new ArrayList<>();
        things.add(new Things("Ноутбук", 30000, 3));
        things.add(new Things("Косметичка", 5000, 2));
        things.add(new Things("Книга", 500, 1));
        things.add(new Things("Бутылка воды", 100, 1));
        things.add(new Things("Утюг", 3000, 2));
        things.add(new Things("Гиря", 2000, 2));

        List<Things> list = new Backpack(things, 4).getContentBackpack();

        for (Things th : list) {
            System.out.println(th.toString());
        }

    }
}
