public class ContainerWithMostWater {
    public static void main(String []args){
        int []test={1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater c=new ContainerWithMostWater();
        System.out.print(c.maxArea(test));
    }
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for (int j=i+1;j<height.length;j++){
                int temp=height[i]>height[j]?height[j]:height[i];
                int x=temp*(j-i);
                max=max>x?max:x;
            }
        }
        return max;
    }
}
