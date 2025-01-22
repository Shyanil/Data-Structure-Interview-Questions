public class toString {
    String name;

    @Override
    public String toString() {  // i created  to string method that returns the name
        return "This is default toString " +  name;
    }
    public toString(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
      toString obj = new toString("Shyanil");

        // first when i print this its return me random value if i dont created to string its print default java to string value
        // now i have toString method now its print the my toString Method
        System.out.println(obj);
    }
}
