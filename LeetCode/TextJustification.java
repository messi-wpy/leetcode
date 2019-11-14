package exercise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static void main(String[] args) {
        String[] words={"What","must","be","acknowledgment","shall","be"};
        List<String>res=fullJustify(words,16);
        for (int i = 0; i <res.size() ; i++) {
            System.out.println(res.get(i));
        }
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list=new ArrayList<>();
        if (words==null||words.length==0)return list;
        StringBuilder sb=new StringBuilder();
        int start=0,len=0;
        for (int i = 0; i <words.length ; i++) {
            len+=words[i].length();

            if (len==maxWidth){
                for (int j = start; j <=i ; j++) {
                    sb.append(words[j]);
                    sb.append(" ");
                }
                sb.deleteCharAt(sb.length()-1);
                list.add(sb.toString());
                sb=new StringBuilder();
                start=i+1;
                len=0;
            }
            else if (len<maxWidth){
                len+=1;
                if (i==words.length-1){
                    for (int j = start; j <=i ; j++) {
                        sb.append(words[j]);
                        sb.append(" ");
                    }
                    int l=sb.length();
                    while (l<maxWidth){
                        sb.append(" ");
                        l++;
                    }
                    list.add(sb.toString());
                }
            }else {
                len-=words[i].length();
                len-=i-start;
                i-=1;

                int num=i-start+1;
                int escape=maxWidth-len;
                if (num==1){
                    sb.append(words[start]);
                    while (escape>0) {
                        sb.append(" ");
                        escape--;
                    }
                    list.add(sb.toString());
                    sb=new StringBuilder();
                    start=i+1;
                    len=0;
                }else {
                    int eNum=escape/(num-1);
                    int x=escape%(num-1);
                    for (int j = start; j <=i ; j++) {
                        sb.append(words[j]);
                        if (j!=i)
                        for (int k = 0; k <eNum ; k++) {
                            sb.append(" ");
                        }
                        if (x>0){
                            sb.append(" ");
                            x--;
                        }
                    }
                    list.add(sb.toString());
                    sb=new StringBuilder();
                    start=i+1;
                    len=0;


                }

            }

        }
        return list;
    }
}
