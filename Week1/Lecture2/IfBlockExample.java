public class IfBlockExample {
    public static void main(String[] args) {
        int a = 2, b = 3, c;
        c = 4;
        if (a+b > c) {
            c = a+b;
            a = b;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}