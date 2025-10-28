package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithIterators {
    public static void main(String[] args) {
        List<String> friends=new ArrayList<>();

        friends.add("Ana");
        friends.add("Jacob");
        friends.add("Stephen");
        friends.add("Rey");

        String friendToRemove="Jacob";

        Iterator<String> friendsIt=friends.iterator();
        while (friendsIt.hasNext())  // will check whether the iterator/list has anything or not
        {
            String friend=friendsIt.next(); //current element
            if(friend.equals(friendToRemove))
            {
                friendsIt.remove(); //safe removal-- it won't throw that exception CME
            }
        }
        System.out.println(friends);

    }
}
