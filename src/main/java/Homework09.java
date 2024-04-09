public class Homework09 {

    public static void main(String[] args) {
        int divisorsLimit = 50;
        int triangleNumber = findTriangleNumberWithDivisors(divisorsLimit);
        System.out.println("First triangle number to have more than " + divisorsLimit + " divisors is: " + triangleNumber);
    }

    public static int findTriangleNumberWithDivisors(int divisorsLimit) {
        int triangleNumber = 1;
        int index = 2;
        while (true) {
            int divisorsCount = countDivisors(triangleNumber);
            if (divisorsCount > divisorsLimit) {
                break;
            }
            triangleNumber += index;
            index++;
        }
        return triangleNumber;
    }
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
