public class q1 {
    public static void main(String args[])
    {
        try {
            int a = 5, b = 0;
            int c = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            int a[] = new int[10];
            a[11] = 20;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        try {
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}