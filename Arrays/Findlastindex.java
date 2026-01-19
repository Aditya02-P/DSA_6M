public class Findlastindex {
    public static void main(String[] args) {
        int[]arr={5,7,7,8,8,10,11,11,11,11,11,11,11};
        System.out.println(arr.length);
        int index = findLastIndex(arr,11);
        System.out.println("Last Index: "+index);
    }
    static int findLastIndex(int[]arr,int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return ans;
    }
}
