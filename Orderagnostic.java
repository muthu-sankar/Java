public class Orderagnostic {
    public static void main(String[] args) {
         int[] arr ={99,88,77,66,55,44,33,22,11};
         int target = 77;
         int ans =orderbs(arr,target);
        System.out.println(ans);
    }
    static int orderbs(int[] arr , int target)
    {
        int start =0;
        int end = arr.length -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            // to find the given array is ascending or descending
            boolean isacd = arr[start] < arr[end];

            if(arr[mid] == target){
                return mid;
            }
            if(isacd)
            {
                if(target < arr[mid])
                {
                    end = mid -1;
                } else{
                    start = mid +1;
                }
            }
            else {
                if(target > arr[mid])
                {
                    end = mid -1;
                } else{
                    start = mid +1;
                }
            }

        }
        return -1;
    }

}
