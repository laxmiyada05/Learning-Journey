public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; 
        int result2 = (10 + 5) * 2; 
        int result3 = 100 / 10 + 5 - 3 * 2;
        System.out.println("Result 1 (10 + 5 * 2): " + result1); // 10 + 10 = 20
        System.out.println("Result 2 ((10 + 5) * 2): " + result2); // 15 * 2 = 30
        System.out.println("Result 3 (100 / 10 + 5 - 3 * 2): " + result3); // 10 + 5 - 6 = 9
    }
}
