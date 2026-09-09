class LRUCache {

    private LinkedList<Integer> dll;
    private Map<Integer,Integer> hmap;
    private int capacity;

    public LRUCache(int capacity) {
    this.capacity=capacity;
    this.dll =  new LinkedList<>();
    this.hmap= new HashMap<>();
    }
    
    private void makeItFirst(int key){
        dll.remove(Integer.valueOf(key));
        dll.addFirst(key);

    }
    public int get(int key) {
        if(!hmap.containsKey(key)){
            return -1;
        }
        makeItFirst(key);
        return hmap.get(key);
    }
    
    public void put(int key, int value) {
        if(hmap.containsKey(key)){
            hmap.put(key,value);
            makeItFirst(key);
            return ;
        }

        if(dll.size() >= capacity){
            int lestRecentlyUsed =dll.removeLast();
            hmap.remove(lestRecentlyUsed);
        }
        dll.addFirst(key);
        hmap.put(key,value);
    }
}
