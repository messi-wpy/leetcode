import java.util.Scanner;

public class ATEXQuotes {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            StringBuilder sb=new StringBuilder(s);
            int flag=0;
            for (int i=0;i<sb.length();i++){
                if (sb.charAt(i)=='"'){
                        if (flag==0) {
                            sb.setCharAt(i,'`');
                            sb.insert(i+1,'`');
                            flag=1;
                        }
                        else {
                            sb.setCharAt(i,'\'');
                            sb.insert(i+1,'\'');
                            flag=0;
                        }
                    }

                }

            System.out.println(sb.toString());

        }

    }


}
