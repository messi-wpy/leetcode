import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        ListIterator l=list.listIterator();
        System.out.println(l.next());
        System.out.println(l.next());


    }
}
