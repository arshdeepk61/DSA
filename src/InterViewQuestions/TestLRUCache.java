package InterViewQuestions;

public class TestLRUCache {
    public static void main(String[] args) {
        LRUCache<Integer,String > cache= new LRUCache<>(3);

        cache.put(1,"A");
        cache.put(2,"B");
        cache.put(3,"C");

        System.out.println(cache);

        //Access keys-makes it most recently used
        cache.get(1);
        cache.get(2);
        cache.get(3);


        System.out.println(cache);

        //Insert new entry (cache full, so least recently used -> key 2 will be victed
        cache.put(4,"D");


        System.out.println(cache);
    }
}
