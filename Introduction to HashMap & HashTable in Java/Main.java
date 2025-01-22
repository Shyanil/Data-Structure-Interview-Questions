public class Main {


    public static void main(String[] args) {
        MapUsingHash mapUsingHash = new MapUsingHash();
        mapUsingHash.put("Shyanil" , "Machine Learning Engineer");
        mapUsingHash.put("Ayush" , "Java Developer");
        mapUsingHash.put("Bhawesh" , "Frontend Engineer");
        System.out.println(mapUsingHash.delete("Bhawesh"));
        HashMap<Integer , String> hashMap = new HashMap<>();
        hashMap.put(1 , "Shyanil");
        hashMap.put(2 , "Mishra");
        System.out.println(hashMap);
    }
}
