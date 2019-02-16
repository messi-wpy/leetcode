import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class LetterCount {
    public static void main(String[]args){
        letterCount();

    }
    public static void letterCount()  {
        long t1=System.currentTimeMillis();

        //读文件的引用声明放在外面,便于finally中保证关闭
        BufferedReader reader=null;
        Map<Character,Integer> words=new HashMap<>();
        try {
            reader=new BufferedReader(new FileReader("/home/messi-lp/JavaProject/src/main/java/hamlet.txt"));
            reader.lines()
                    .parallel()
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .flatMapToInt(s -> s.toLowerCase().chars())
                    .filter(value -> value>='a'&&value<='z')
                    .forEach(value ->{
                        //parallel并行,线程可能不安全
                        if (words.containsKey((char)value))
                             words.put((char) value,words.get((char)value)+1);
                        else
                            words.put((char) value,1);

                    });


        }catch (FileNotFoundException f){
                f.printStackTrace();
                System.out.println(f.getMessage());
        } finally {
            if (reader!=null)
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        words.entrySet().stream()
                //java8 新特性　接口增强,接口类里可以有default方法和static方法,可以被实现
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));

        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
    }


}
