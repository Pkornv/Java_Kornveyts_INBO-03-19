public class Ex15 {
    public static String recursion(int n) {
        if (n > 10) {
            return n%10+" "+recursion(n/10);
        }
        return Integer.toString(n);
    }
    public static void main(String[] args) {
        System.out.println(recursion(12345)); // вызов рекурсивной функции
    }
}
