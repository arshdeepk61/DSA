package arsh;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // int nums1[]= {1,1,1,2,3,3,3,2}; output =3
// 1 n/2 3 n/2

    public static void main(String[] args) {
        int nums1[]= {1,2,2,2,2,2,3,3,3,2};

    //    int[] nums =new int[5];

        int counter=0;
        Map<Integer,Integer> map =new HashMap();

        int size=nums1.length;
        for(int i =0;i<size;i++) {
     if( map!=null)
         
        if(map.get(nums1[i])!=0)
        {
        map.put(nums1[i],(map.get(nums1[i])+1));
         }



         }



        System.out.println(map);
//     for(int i =0;i< nums1.length;i++)
//     {
//         int counter2=0;
//       for (int j=0;j<nums1.length;j++)
//       {
//           if(nums1[i]==nums1[j])
//               counter++;
//
//
//       }
//
//         if(counter>nums1.length/2)
//         {
//             System.out.println(nums1[i]);
//             break;
//         }
//
//
//     }



    }
}
