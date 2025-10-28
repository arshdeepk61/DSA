package InterViewQuestions;

import java.util.Arrays;
import java.util.PriorityQueue;

//O(nlogn)
public class MeetingRooms2Optimized {

    public static void main(String[] args) {
        int[][] intervals= {{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals));
    }

    private static int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0)
            return 0;

        //Step 1- sort meetings by start time
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        //Step 2- Min heap for end times
        PriorityQueue<Integer> heap=new PriorityQueue<>();

        //Add 1st meeting's end time
        heap.add(intervals[0][1]);

        //Step 3: Process other meetings
        for(int i=1;i<intervals.length;i++)
        {
            //if room is free(meeting ended)
            if(intervals[i][0]>=heap.peek()){
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }

        //Heap size = rooms needs
        return heap.size();
    }
}
