public class LinearSearchAlgorithm2 {
    /*How can you implement a linear search 
    algorithm in Java that finds the index of a target element within a specified range in an array?
     */    public static void main(String[] args) {
        int arr[] = {10, 20 ,30 ,40 , 50};
        int target = 20;
        int Start = arr[0] ;
        int End = arr[3];
        System.out.println(Serch(arr, target, Start, End));

        
    }
  /* 
    when i do this - int Start = arr[0] ;
    int End = arr[3];  its how index bound beacuse in serch index i try to make array index 10 how ok arr[0] 
    in psvm is 10 but in down serch function its make it indeex 10  
    int element = arr[indexCheak];  these area index make it 10 if you 
    */
    static int Serch(int arr[], int target, int Start , int End) {
       // int element = arr.length;
        if(arr.length == 0){
            return  -1;
        }
        for(int indexCheak = Start ; indexCheak <= End ; indexCheak++){
            int element = arr[indexCheak]; // these area index make it 10 if you 
            if (element == target){
                return  indexCheak;
            }
        }
        return -1;
    }
}
