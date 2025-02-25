public class MyNumber2 {
    public static void main(String[] args) {
        String myString = "hi";
        int myNumber;
        myNumber = 5*2 + 1;
        myNumber = myString; // causes a type error
        System.out.println("myNumber is: " + myNumber);
    }
}