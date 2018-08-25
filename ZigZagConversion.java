public class ZigZagConversion {
    //看清问题的实质，找规律
    //beats 93%
    public static void main(String []orgs){
        ZigZagConversion z=new ZigZagConversion();
        System.out.println(z.convert("PAYPALISHIRING",3));
    }
    public String convert(String s, int numRows) {
        if (numRows==1)return s;
        StringBuilder z=new StringBuilder();
        int x=numRows*2-2;
        int index=0;
        //第一行
        while (index<s.length()){
            z.append(s.charAt(index));
            index+=x;
        }
        //中间
        for (int i=1;i<numRows-1;i++){
            for (index=i;index<s.length();index+=2*i){
                z.append(s.charAt(index));
                index+=x-2*i;
                if (index<s.length())
                    z.append(s.charAt(index));
                else
                    break;

            }
        }
        //最后一行
        for (int i=numRows-1;i<s.length();i+=x){
            z.append(s.charAt(i));
        }

        return z.toString();
    }
}
