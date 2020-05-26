import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] a = {2, 2, 3, 9, 11, 11, 11, 94};
        Arrays.sort(a);

        BinarySearch obj = new BinarySearch();
        System.out.println("searching element '11' position : " + obj.search(a, 11));
        int firstOccurrence = obj.firstOccurrence(a, 11);
        int lastOccurrence = obj.lastOccurrence(a, 11);

        System.out.println("First occurrence of element : " + firstOccurrence);
        System.out.println("Last occurrence of element : " + lastOccurrence);
        int count = lastOccurrence - firstOccurrence + 1;
        System.out.println("count of element : " + count);
    }

    public int firstOccurrence(int[] arr, int element) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (element == arr[mid] && (mid == 0 || arr[mid - 1] < element))
                return mid;

            else if (arr[mid] >= element)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }

    public int lastOccurrence(int[] arr, int element) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (arr[mid] == element && (mid == arr.length - 1 || arr[mid + 1] > element))
                return mid;

            else if (arr[mid] <= element)
                l = mid + 1;

            else
                r = mid - 1;
        }
        return -1;
    }

    public int search(int[] arr, int s) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            //System.out.println(l);
            //System.out.println(r);
            //System.out.println(mid);
            //System.out.println("\n");

            if (arr[mid] == s)
                return mid;
            else if (arr[mid] <= s) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}

/* Output :
searching element '11' position : 5
First occurrence of element : 4
Last occurrence of element : 6
count of element : 3
 */