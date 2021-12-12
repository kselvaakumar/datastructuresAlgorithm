//I assume hashmap is not expected here. Please correct me if i am wrong.

//Implemented using Interface with generics
// Map<String, String> map = new SimpleMap<String, String>();
// map.put("NL", "Netherlands")

//Map<String, Integer> anotherMap = new SimpleMap<String, Integer>(); //For <Name,Age>
//anotherMap.put("Spiderman" , "28")
//Integer age = anotherMap.get("Spiderman");

/*public interface Map<K,V> {
    V get(K key);
    void put(K key, V value);
}

public class SimpleMap<K, V> implements Map<K,V> {

    class InternalMapStore {
        Object key;
        Object value;
        public void add(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<InternalMapStore> list;

    public SimpleMap() {
        this.list = new ArrayList<InternalMapStore>();
    }

    public void put(K key, V value) {
        if(key == null) return;
        InternalMapStore internalMapStore = new InternalMapStore();
        internalMapStore.add(key, value);

        //Remove the old object if already exits- this may not be needed in cases.
        for(int i=0; i<list.size(); i++) {
            InternalMapStore imap = list.get(i);
            if(imap.key.equals(key)) {
                list.remove(i);
                break;
            }
        }

        list.add(internlMapStore);
    }

    public V get(K key) {
        if(key == null) return null;
        for(int i=0; i<list.size();i++) {
            InternalMapStore imap = list.get(i);
            if(imap.key.equals(key)) {
                return imap.value;
            }
        }
        return null;
    }
} */