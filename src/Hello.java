public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Hello obj = new Hello();
        obj.num(1);
    }

    public int num(int n) {
        System.out.println(n);
        if (n != 5) {
            return num(n + 1);
        }

        return n;
    }
}
