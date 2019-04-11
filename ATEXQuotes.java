import java.util.Scanner;

public class ATEXQuotes {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            boolean flag=true;
            for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i)=='"'){
                    if (flag) {
                        System.out.print("``");
                        flag =false;
                    }else {
                        System.out.print("''");
                        flag=true;
                    }
                }
                else
                    System.out.print(s.charAt(i));
            }


        }

    }


}
