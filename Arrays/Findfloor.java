public class Findfloor {
    public static void main(String[] args) {
        int[]arr={1,2,3,5,7,8,9,10};
        System.out.println(findFloor(arr,4));
    }
    static int findFloor(int[]arr,int target){
        int start=0,end=arr.length-1;
        int ans = arr[0];
        while (start<=end) {
            int mid =start+(end-start)/2;
            if(arr[mid]<=target){
                ans=arr[mid];
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return ans;
    }
}
