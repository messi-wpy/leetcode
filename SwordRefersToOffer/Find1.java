package exercise.SwordRefersToOffer;

public class Find1 {


        public int NumberOf1Between1AndN_Solution(int n) {
            //count表示1出现的总次数
            int count = 0;
            //从1到n循环n次，对每一个数求它包含多少个1
            for (int i = 1; i <= n; i++) {
                int temp = i;
                //求这个数包含多少个1
                while (temp != 0) {
                    if (temp % 10 == 1) {
                        count++;
                    }
                    temp = temp / 10;
                }
            }
            return count;
        }

}

