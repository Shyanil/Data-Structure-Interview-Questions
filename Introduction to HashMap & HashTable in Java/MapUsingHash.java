public class MapUsingHash {
    private class Entity{
        String key;
        String value;
        public Entity(String key , String value){
            this.key = key;
            this.value = value;
        }
    }


    public Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key ,String value){
        int hashI = Math.abs(key.hashCode() % entities.length);
        entities[hashI] = new Entity(key , value);
    }

    public String get(String key){
        int hashI = Math.abs(key.hashCode() % entities.length);
        if (entities[hashI] != null && entities[hashI].key.equals(key)){
            return entities[hashI].value;
        }
        return String.valueOf(new Exception( "Error ! No Element matched with given key"));
    }

    public String delete(String key){
        int hashI = Math.abs(key.hashCode() % entities.length);
        if (entities[hashI] != null && entities[hashI].key.equals(key)){
            entities[hashI] = null;
            return "Successfully deleted";
        }
        return String.valueOf(new Exception( "Error ! No Element matched with given key"));
    }
}
