public class SquareRoot {

    public static void main(String[] args) {

        SquareRoot obj = new SquareRoot();
        for(int i = 0; i < 100; i++){
            System.out.print(i);
            System.out.print(" : ");
            System.out.println(obj.floorSquareRoot(i));}

    }

    public int floorSquareRoot(int n) {

        int left = 1;
        int right = n/2;
        int mid = 1;

        while (left <= right) {
            mid = (left + right) / 2;

            if (mid * mid == n || (mid * mid < n && (mid + 1) * (mid + 1) > n))
                return mid;

            else if (mid * mid < n)
                left = mid + 1;
            else
                right = mid - 1;
        }

        if((mid + 1) * (mid + 1) == n)
            return mid+1;
        else
            return mid;
    }

}
