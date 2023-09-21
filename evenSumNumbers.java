public class evenSumNumbers {
    public static void main(String[] args) {
        //for loop sum of every even number from 0 to 99
        int sum = 0;
        for (int i = 2; i <= 99; i+=2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of even numbers from 0 to 99: " + sum);
    }  
}
