
import java.util.Scanner;

public class BWERTYU {

    public static void main(String[] args) {
        String keyboard="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        Scanner in =new Scanner(System.in);

        while (in.hasNext()){
            StringBuilder text=new StringBuilder(in.nextLine());
            for (int i=0;i<text.length();i++){
                if (text.charAt(i)=='Q'||text.charAt(i)=='A'||text.charAt(i)=='Z')
                    continue;
                int index=0;
                while (index<keyboard.length()&&text.charAt(i)!=keyboard.charAt(index))index++;
                if (index!=keyboard.length())
                text.setCharAt(i,keyboard.charAt(index-1));

            }
            System.out.println(text.toString());

        }

    }
}
