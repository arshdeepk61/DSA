package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutIterators {

    public static void main(String[] args) {
        List<String> friends=new ArrayList<>();

        friends.add("Ana");
        friends.add("Jacob");
        friends.add("Jacob");
        friends.add("Stephen");
        friends.add("Rey");

        String friendToRemove="Jacob";

        //Throws concurrent modification exception
        //When trying to remove any object from list while iterating
        for(String friend: friends)
        {
            if(friends.contains(friendToRemove))
            {
                friends.remove(friendToRemove);
            }
        }
        System.out.println(friends);
    }
}
