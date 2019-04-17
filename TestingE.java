package leetcode;

import java.util.Scanner;

public class TestingE {
    /*
    #include <stdio.h>
#include <string.h>
int main() {
	int vis[5], cnt = 0;
	char pain[20];
	while (scanf ("%s", pain) != EOF) {
		cnt = 0;
		memset (vis, 0, sizeof(vis));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((pain[i] == pain[6+j] && pain[5-i] == pain[11-j]) ||(pain[i] == pain[11-j] && pain[5-i] == pain[6+j]) && !vis[j]) {
					cnt++;
					vis[j] = 1;
					break;
				}
			}
		}
			if (cnt==3)
				printf("TRUE\n");
			else
				printf("FALSE\n");
	}
	return 0;

}
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=0;
            boolean[] has=new boolean[3];
            String pain=sc.nextLine();
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j <3 ; j++) {
                    if ((pain.charAt(i)==pain.charAt(6+j)&&pain.charAt(5-i)==pain.charAt(11-j))||
                            (pain.charAt(i)==pain.charAt(11-j)&&pain.charAt(5-i)==pain.charAt(6+j))&&!has[j]){
                        has[j]=true;
                        n++;
                        break;

                    }
                }
            }
            if (n==3)
                System.out.println("TRUE");
            else
                System.out.println("FALSE");

        }
    }
}
