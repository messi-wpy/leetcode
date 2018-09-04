public class ReverseInteger {
    public static void main(String []orgs){
        ReverseInteger r=new ReverseInteger();
        System.out.println(r.reverse(1534236469));
        System.out.print(Integer.MAX_VALUE);
    }
    public int reverse(int x) {
        int num=0;
        int result=0;
        while (x!=0){
            int temp=x%10;
            num=num*10+temp;
            //逆运算
            if( (num-temp)/10!=result){
                result=0;
                return result;
            }
            x/=10;
            result =num;
        }

        return num;
    }
}
