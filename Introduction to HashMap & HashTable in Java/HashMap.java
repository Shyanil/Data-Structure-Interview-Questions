import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K , V>{
    private class Entity{
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private ArrayList<LinkedList<Entity>> linkedLists;

    int size = 0;
    float lf = 0.5F;
    public HashMap() {
        linkedLists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            linkedLists.add(new LinkedList<>());
        }
    }

    public void put(K key , V value){
        int hash = Math.abs(key.hashCode() % linkedLists.size());
        LinkedList<Entity> entities = linkedLists.get(hash);
        for (Entity entity : entities){
            if (entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        boolean b = (float) (size) / linkedLists.size() > lf;
        if(b){
            reHash();
        }
        entities.add(new Entity(key , value));
       size++;
    }


    private void reHash() {
        System.out.println("We are now rehashing!");
        ArrayList<LinkedList<Entity>> old = linkedLists;
        linkedLists = new ArrayList<>();

        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            linkedLists.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entities : old){
            for (Entity entity : entities){
                put(entity.key , entity.value);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % linkedLists.size());
        LinkedList<Entity> entities = linkedLists.get(hash);
        for (Entity entity : entities){
            if (entity.key.equals(key)){
                return entity.value;
            }
        }

        return null;
    }

    public void  remove(K key){
        int hash = Math.abs(key.hashCode() / linkedLists.size());
        LinkedList<Entity> entities =  linkedLists.get(hash);
        Entity target = null;
        for (Entity entity : entities){
            if(entity.key.equals(key)){
                 target = entity;
            }
        }
        entities.remove(target);
        size--;
    }

    public  boolean containsKey(K key){
        return get(key) != null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (LinkedList<Entity> entities : linkedLists){
            for (Entity entity : entities){
                stringBuilder.append(entity.key);
                stringBuilder.append("=");
                stringBuilder.append(entity.value);
                stringBuilder.append(",");
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
