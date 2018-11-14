import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int []a=new int[26];
        for (int task:tasks
             ) {
            a[task-'A']+=1;
        }
        Arrays.sort(a);
        int i=25;
        while (i>= 0&& a[i]==a[25]) i--;

        return Math.max(tasks.length,(n+1)*(a[25]-1)+25-i);

    }
}
