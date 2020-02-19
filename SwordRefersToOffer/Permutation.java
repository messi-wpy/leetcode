package exercise.SwordRefersToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutation {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String>res=new ArrayList<>();
        if (str==null||str.isEmpty())
            return res;

        permutationHelp(res,str.toCharArray(),0);
        Collections.sort(res);
        return res;

    }
    public void permutationHelp(ArrayList<String> res ,char[]chars,int star){
        if(star==chars.length){
            String s=new String(chars);
            if (!res.contains(s))
                res.add(s);
            return;
        }

        for (int i = star; i <chars.length ; i++) {
            swap(chars,i,star);
            permutationHelp(res,chars,star+1);
            swap(chars,i,star);
        }


    }

    public void swap(char[]chars,int a,int b){

        char temp= chars[a];
        chars[a]=chars[b];
        chars[b]=temp;

    }
}
