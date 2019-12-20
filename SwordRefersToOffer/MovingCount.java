package exercise.SwordRefersToOffer;

public class MovingCount {

    public int movingCount(int threshold, int rows, int cols) {
        if (rows<=0||cols<=0||threshold<0)
            return 0;
        boolean[] isVisited=new boolean[rows*cols];
        return travel(threshold,rows,cols,0,0,isVisited);


    }
    public int travel(int threshold,int rows,int cols,int curR,int curC,boolean[] isVisited){
        if (curR<0||curR>=rows||curC<0||curC>=cols||isVisited[cols*curR+curC]||threshold<getSum(curC)+getSum(curR))
            return 0;
        int count=0;
        isVisited[cols*curR+curC]=true;
        count=1+travel(threshold,rows,cols,curR+1,curC,isVisited)
                +travel(threshold,rows,cols,curR,curC+1,isVisited)
                +travel(threshold,rows,cols,curR-1,curC,isVisited)
                +travel(threshold,rows,cols,curR,curC-1,isVisited);

        return count;
    }


    public int getSum(int num){
        int res=0;
        while (num!=0){
            res+=num%10;
            num/=10;
        }
        return res;
    }
}
