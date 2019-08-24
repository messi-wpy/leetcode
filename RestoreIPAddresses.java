package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

    public static void main(String[] args) {
        RestoreIPAddresses r=new RestoreIPAddresses();
        System.out.println(r.restoreIpAddresses("010010"));
    }
    public List<String> restoreIpAddresses(String s) {
        if (s==null||s.length()<4)return new ArrayList<>();
        List<String>res=new ArrayList<>();
        backtracking(s,res,new ArrayList<>(),0);
        return res;
    }

    public void backtracking(String ip,List<String> res,List<String>num,int index){
        if (num.size()==4){
            if (index==ip.length()){
                StringBuilder sb=new StringBuilder();
                num.forEach(s -> {
                    sb.append(s).append('.');
                });
                sb.deleteCharAt(sb.length()-1);
                if (sb.length()!=ip.length()+3)
                    return;
                res.add(sb.toString());

            }
            return;
        }
        if (index>=ip.length())return;
        String last="";
        for (int i=1; i<=3 ; i++) {
            if (index+i>ip.length())return;
            String n=ip.substring(index,index+i);

            if (i==2&&n.charAt(0)=='0'){
                index++;
                i=0;
                continue;
            }
            if (Integer.parseInt(n)<=255) {
                if (n.equals(last))continue;
                num.add(n);
                backtracking(ip,res,num,index+i);
                last=num.remove(num.size()-1);
            }

        }


    }
}
