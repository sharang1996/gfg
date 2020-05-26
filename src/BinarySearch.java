public class BinarySearch {
    public static void main(String[] args){
        int[] a = {2,2,3,9,11,11,11,94};

        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(a, 2));
    }

    public int firstOccurrence(int[] arr, int s){
        int l = 0;
        int r = arr.length -1;

        while(l<=r){
            int mid = (l+r)/2;

        }


        return -1;
    }

    public int search(int[] arr, int s){

        int l = 0;
        int r = arr.length-1;

        while(l <= r){
            int mid = (l + r)/2;
            System.out.println(l);
            System.out.println(r);
            System.out.println(mid);
            System.out.println("\n");

            //the second condition is for the first occurrence of the search element
            //if(arr[mid]==s &&(mid == 0 || arr[mid-1]<arr[mid]))

            //the second condition is for the last occurrence of the search element
            //if(arr[mid]==s &&(mid == arr.length-1 || arr[mid+1]>arr[mid]))

            if(arr[mid]==s)
                return mid;
            else if(arr[mid] <= s){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return -1;
    }
}
