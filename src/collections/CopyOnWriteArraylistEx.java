package collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistEx {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> friends=new CopyOnWriteArrayList<>();

        friends.add("Ana");
        friends.add("Jacob");
        friends.add("Stephen");
        friends.add("Rey");

        String friendToRemove="Jacob";

        for(String friend: friends)
        {
            friends.remove(friendToRemove);
        }

        System.out.println(friends);
    }
}
