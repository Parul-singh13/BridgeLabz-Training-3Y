import java.util.Arrays;

public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == number;
    }

    public static int[] largestAndSecondLargest(int number) {
        int[] digits = storeDigits(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int number) {
        int[] digits = storeDigits(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static int[] reverseDigits(int number) {
        int[] digits = storeDigits(number);
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(number);
        return arraysEqual(digits, reversed);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumDigits = sumOfDigits(square);
        return sumDigits == number;
    }

    public static boolean isSpyNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        int product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += factorial(d);
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int testNumber = 153; // example number for testing

        System.out.println("Count of digits: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(storeDigits(testNumber)));
        System.out.println("Is Duck Number: " + isDuckNumber(testNumber));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(testNumber));
        System.out.println("Largest and Second Largest digits: " + Arrays.toString(largestAndSecondLargest(testNumber)));
        System.out.println("Smallest and Second Smallest digits: " + Arrays.toString(smallestAndSecondSmallest(testNumber)));
        System.out.println("Sum of digits: " + sumOfDigits(testNumber));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(testNumber));
        System.out.println("Is Harshad Number: " + isHarshadNumber(testNumber));
        System.out.println("Digit Frequency: ");
        int[][] freq = digitFrequency(testNumber);
        for (int[] f : freq) {
            System.out.println("Digit " + f[0] + ": " + f[1]);
        }
        System.out.println("Reversed digits: " + Arrays.toString(reverseDigits(testNumber)));
        System.out.println("Is Palindrome: " + isPalindrome(testNumber));
        System.out.println("Is Prime: " + isPrime(testNumber));
        System.out.println("Is Neon Number: " + isNeonNumber(testNumber));
        System.out.println("Is Spy Number: " + isSpyNumber(testNumber));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(testNumber));
        System.out.println("Is Buzz Number: " + isBuzzNumber(testNumber));
        System.out.println("Is Perfect Number: " + isPerfectNumber(testNumber));
        System.out.println("Is Abundant Number: " + isAbundantNumber(testNumber));
        System.out.println("Is Deficient Number: " + isDeficientNumber(testNumber));
        System.out.println("Is Strong Number: " + isStrongNumber(testNumber));
    }
}
