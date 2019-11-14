package exercise.work;

import java.util.Scanner;

public class TesingK {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for (int k = 0; k <n ; k++) {
            String word = sc.next();
            StringBuilder small = new StringBuilder(word);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < word.length(); i++) {
                for (int j = 0; j < word.length(); j++) {
                    sb.append(word.charAt((j + i) % word.length()));
                }
                if (sb.toString().compareTo(small.toString()) < 0)
                    small = sb;
                sb = new StringBuilder();
            }
            System.out.println(small.toString());
        }


         /*   int first,second;
            int start=0;
            first=0;
            second=first+1;
            while (second<word.length()) {
                while (second < word.length() && word.charAt(first) < word.charAt(second))
                    second++;
                if (second==word.length())break;
                if (word.charAt(second) == word.charAt(first)) {
                    int i=1;
                    for (; i < word.length() - 1; i++) {
                        if (word.charAt((second + i) % word.length()) < word.charAt((first + i) % word.length())) {
                            start = second;
                            first = second;
                            second++;
                            break;
                        }
                    }
                    if (i==word.length()-1)
                        break;

                }else {
                    start=first=second;
                    second++;

                }
            }*/




            
            

        
    }


}
