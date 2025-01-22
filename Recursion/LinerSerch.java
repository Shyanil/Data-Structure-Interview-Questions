/**
 * LinerSerch
 */
import java.util.*;
public class LinerSerch {

    public static void main(String[] args) {
		int[] arr = {1, 2, 3,5,5, 4};
		System.out.println(search(arr, 5, 0));
        System.out.println(search2(arr, 5, 0));
		returnArrayLiner(arr, 5, 0);
		System.out.println(list);
    }

    public static int search(int[] arr, int target, int index) {
		if(index == arr.length){
		  return - 1;
		}
		if(arr[index] == target){
			return index;
		}
		return search(arr , target , index + 1);
	}

    public static boolean search2(int arr[] , int target ,int index){
		if(index == arr.length){
			return false;
		}
		return arr[index] == target || search2(arr, target, index+1);
	}
	static ArrayList<Integer> list = new ArrayList<>();
	static void returnArrayLiner(int arr[],int target, int index){
		if(index == arr.length-1){
			return;
		}
		if(arr[index] == target){
			list.add(index);
		}
		returnArrayLiner(arr,target,index+1);  // here index + 1 always means element is exist other part of array
	}
    
}