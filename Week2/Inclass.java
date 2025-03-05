public class Inclass {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        //c = 4;
        if (a + b > c) {
            c = a + b;
            a = b;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Gives value of i to x, then increments i by 1
        int i = 1;
        int x = i++;
        System.out.println("i = " + i + " x = " + x);

        // Increments x by 1, then assigns the value to y
        int y = x += 1;
        System.out.println("i = " + i + " x = " + x + " y = " + y);
    }
}