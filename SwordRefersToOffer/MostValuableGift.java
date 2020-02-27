package exercise.SwordRefersToOffer;

public class MostValuableGift {


    public static void main(String[] args) {
        int [][]gifts={{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        System.out.println(findMostValuableSolution(gifts));
    }
    public static int findMostValuableSolution(int [][]gifts){
        if (gifts==null)return 0;
        int row=gifts.length;
        int col=gifts[0].length;
        int[][]dp=new int[gifts.length][gifts[0].length];

        for (int i = 0; i <gifts.length ; i++) {
            for (int j = 0; j <gifts[0].length ; j++) {
                int leftMax=gifts[i][j];
                int topMax=gifts[i][j];
                if (i>=1)
                    leftMax=dp[i-1][j]+gifts[i][j];
                if (j>=1)
                    topMax=dp[i][j-1]+gifts[i][j];
                dp[i][j]=Math.max(topMax,leftMax);

            }

        }

        return dp[row-1][col-1];


    }
}
