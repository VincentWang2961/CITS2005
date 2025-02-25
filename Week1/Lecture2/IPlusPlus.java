public class IPlusPlus {
    public static void main(String[] args) {
        int i = 1;
        int x = i++;
        System.out.println("i = " + i + ", x = " + x);
        int y = i+=1;
        System.out.println("i = " + i + ", y = " + y);
    }
}