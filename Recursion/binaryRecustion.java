import java.util.*;

public class binaryRecustion {
    public static void main(String[] args) {
      int arr[] = {20 , 30 , 40 , 40, 50};
      int target = 40;
      // System.out.println(isoh(arr , target, 0, arr.length - 1));
            System.out.println(isohL(arr , target, 0, arr.length - 1));

  }
  
  public static int isoh(int arr[] , int target , int start , int end){
    
    if(start > end){
      return -1;
    }
    int mid = start + (end - start)/2;
    if(target < arr[mid]){
      return isoh(arr , target , start , mid - 1);
    } else if(target > arr[mid]){
      return isoh(arr , target , mid + 1 , end);
    } else {
      return mid;
    }
    
  }
  
   public static List<Integer> isohL(int arr[] , int target , int start , int end){
    List<Integer> list = new ArrayList();
    if(start > end){
      return list;
    }
    int mid = start + (end - start)/2;
    if(target < arr[mid]){
      isohL(arr , target , start , mid - 1);
    } else if(target > arr[mid]){
      isohL(arr , target , mid + 1 , end);
    } else {
      list.add(mid);
      list.addAll((isohL(arr , target , start , mid - 1)));
      list.addAll((isohL(arr , target , mid + 1 , end)));
    }
    return list;
  }
}