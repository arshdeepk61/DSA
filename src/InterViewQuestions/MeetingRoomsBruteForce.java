package InterViewQuestions;

public class MeetingRoomsBruteForce {

    public static void main(String[] args) {
        int[][] intervals= {{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals));
    }

    private static int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0)
            return 0;

        int maxRooms=0;
        for(int i=0;i<intervals.length;i++)
        {
            int rooms =1; //current meeting itself
            for(int j=0;j<intervals.length;j++)
            {
                if(i!=j && overlaps(intervals[i],intervals[j]))
                {
                    rooms++;
                }
            }
            maxRooms=Math.max(maxRooms,rooms);
         }
        return maxRooms;
    }

    private static boolean overlaps(int[] a, int[] b) {

    return a[0]<b[1] && b[0]<a[1]; //overlap condition
    }
}
