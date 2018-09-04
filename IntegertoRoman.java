public class IntegertoRoman {

    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        for (int i=nums.length-1;i>=0;i++){
            while (num>=nums[i]){
                sb.append(roman[i]);
                num-=nums[i];
            }
        }
        return sb.toString();
    }
}
