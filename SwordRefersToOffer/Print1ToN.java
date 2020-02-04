package exercise.SwordRefersToOffer;


/**
 * 《剑指offer》
 * 面试题17
 * 打印从1-n
 */
public class Print1ToN {

    public static void main(String[] args) {
        print1ToN(3);
    }

    public static void print1ToN(int n) {
        char[] num = new char[n];
        for (int j = 0; j < n; j++) {
            num[j] = '0';
        }
        int offset = n - 1;
        char n10 = '9' + 1;
        while (true) {
            num[num.length - 1]++;
            for (int j = num.length - 1; j >= 0; j--) {
                if (num[j] == n10 && j > 0) {
                    num[j - 1]++;
                    num[j] = '0';
                    if (offset > j - 1)
                        offset = j - 1;
                } else {
                    break;
                }
            }
            if (num[0] == n10)
                break;

            System.out.println(String.valueOf(num, offset, num.length - offset));

        }
    }


}
