import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        char[]alphbet=new char[127];

        alphbet['A']='A';
        alphbet['E']='3';
        alphbet['H']='H';
        alphbet['I']='I';
        alphbet['J']='L';
        alphbet['L']='J';
        alphbet['M']='M';
        alphbet['O']='O';
        alphbet['S']='2';
        alphbet['T']='T';
        alphbet['U']='U';
        alphbet['V']='V';
        alphbet['W']='W';
        alphbet['X']='X';
        alphbet['Y']='Y';
        alphbet['Z']='5';
        alphbet['1']='1';
        alphbet['2']='S';
        alphbet['5']='Z';
        alphbet['8']='8';

        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            boolean isHui,isMirrore;
            isHui=isMirrore=true;
            for (int i=0,j=s.length()-1;i<j;i++,j--){
                if (s.charAt(i)!=s.charAt(j))
                    isHui=false;
                if (alphbet[s.charAt(i)]!=s.charAt(j))
                    isMirrore=false;

            }
            if (isHui){
                if (isMirrore)
                    System.out.println(s+" -- is a mirrored palindrome.");
                else
                    System.out.println(s+" -- is a regular palindrome.");
            }
            else {
                if (isMirrore)
                    System.out.println(s+" -- is a mirrored string.");
                else
                    System.out.println(s+" -- is not a palindrome.");

            }
            System.out.println();

        }


    }

}
