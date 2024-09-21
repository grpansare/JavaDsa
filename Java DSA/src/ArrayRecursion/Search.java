package ArrayRecursion;

import java.util.ArrayList;

public class Search {
	static ArrayList<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,8,8,8,5};
//		System.out.println(findIndex(arr,8,0));
//		System.out.println(findIndexLast(arr,8,arr.length-1));
		findAllIndexes(arr, 8, 0);
		ArrayList<Integer> list=findAllIndex(arr,8,0,new ArrayList<Integer>());
		System.out.println(list);
	}
	
    static boolean find(int [] arr,int target,int index) {
    	if(index == arr.length) {
    		return false;
    	}
    	return arr[index] == target || find(arr,target,index+1);
    }
    static int findIndex(int [] arr,int target,int index) {
    	if(index == arr.length) {
    		return -1;
    	}
    	if(arr[index] == target ) {
    		return index;
    	}
    	return   findIndex(arr,target,index+1);
    }
    static int findIndexLast(int [] arr,int target,int index) {
    	if(index == -1) {
    		return -1;
    	}
    	if(arr[index] == target ) {
    		return index;
    	}
    	return   findIndex(arr,target,index-1);
    }
    static void findAllIndexes(int [] arr,int target,int index) {
    	if(index == arr.length) {
    		return ;
    	}
    	if(arr[index] == target ) {
    		list.add(index);
    		System.out.println(index);
    	}
    	findAllIndexes(arr,target,index+1);
    }
    
    static ArrayList<Integer> findAllIndex(int [] arr,int target,int index,ArrayList<Integer> list){
    	if(index == arr.length) {
    		return list;
    	}
    	if(arr[index] == target) {
    		list.add(index);
    	}
    	return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
