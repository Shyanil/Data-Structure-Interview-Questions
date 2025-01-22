public class LinearSearchAlgorithm1 {
    /* How can you implement a linear search algorithm in Java that returns true or false to 
    indicate whether a specific character (case insensitive) is present in a given string? */
    public static void main(String[] args) {
        String s = "Shyanil";
        char target = 's';
       
        System.out.println(Serch(s, target));
        
    
}
    static boolean Serch(String s, char target){
        s=s.toLowerCase(); // its ignore the capital case 
        if(s.length() == 0){
            return false;
        }
        for(char indexCheak : s.toCharArray()){ // only use over the array toCharArray make it array
            if (indexCheak == target){
                return true;
            }
        }
        return false;
    }
}