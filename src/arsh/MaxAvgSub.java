package arsh;

public class MaxAvgSub {

    public static void main(String[] args) {
        int[] rotate = new int[]{ 1,12,-5,-6,50,3};
        int k = 4;
        int start=k;
        int end=rotate.length;
        int sum=0;
        //sum of first winode
        for (int i = 0; i < k; i++) {
            sum = sum+rotate[i];
        }

        int maxSum = sum;
        for(int i=k;i<rotate.length;i++)
        {
            sum=sum-rotate[i-k]+rotate[i];
            maxSum=Math.max(sum,maxSum);

        }

        double maxAverage = (double) maxSum / k;
        System.out.println("Max sum = " + maxSum);
        System.out.println("Max average = " + maxAverage);
    }
}
