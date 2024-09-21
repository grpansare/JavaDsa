package BinarySearch;

public class FirstAndLastPosition {
public static void main(String[] args) {
	int [] nums= {7,7,7,7,7,8,8,10};
	
}
public int[] searchRange(int[] nums, int target) {
	int [] ans= {-1,-1};
	//check for first occurence of target first
	
	
	ans[0]=search(nums,target,true);
	if(ans[0] != -1) {
	ans[2]=search(nums,target,false);
	}
	
	return ans;
}

//this function just returns index of target
int search(int [] nums,int target,boolean findStartIndex) {
	int ans=-1;
	int start=0;
	int end=nums.length-1;

	while(start <=end) {
		int mid=start + (end-start)/2;
		if(target < nums[mid]) {
			end=mid-1;
		}
		else if(target > nums[mid]) {
			start=mid+1;
		}else {
			//potential ans found
			ans=mid;
			//but first occurence also posible in left side
			if(findStartIndex) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
			
		}
	}
	return ans;
}
}
