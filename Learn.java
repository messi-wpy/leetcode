package exercise;

import java.util.ArrayList;
import java.util.List;

public class Learn {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        List<Fruit> flist = new ArrayList<>();// 编译错误
        flist.add(new Apple());
        flist.add(new Jonathan());
        flist.add(new Orange());




    }

    static class Fruit {}
    static class Apple extends Fruit {}
    static class Jonathan extends Apple {}
    static class Orange extends Fruit {}
}
