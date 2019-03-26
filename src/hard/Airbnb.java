package hard;

import static java.lang.System.out;

public class Airbnb {
    public static void main(String[] args) {
        int[] array = {5, 1, 1, 5, 6, 1, 124};
        out.println(sumOfNonAdjacentNumbers(array));
    }

    static int checkArrayFromZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                count++;
        }
        return count;
    }

    static void turnZeroToOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
        }
    }

    static int sumOfNonAdjacentNumbers(int[] array) {
        int sum = 0, firstNumber, secondNumber = 0;
        int count = checkArrayFromZero(array);
        turnZeroToOne(array);
        int[] secondArray = newArray(array);
        while (!halfOfTheArrayIsZero(secondArray)) {
            firstNumber = greatestNumberInArray(secondArray);
            if ((findPosition(secondArray, firstNumber) == 0 || findPosition(secondArray, firstNumber) == secondArray.length - 1)
                    && secondArray[findPosition(secondArray, firstNumber)] != 0) {
                sum = sum + firstNumber;
                kickNumberFromArray(secondArray, firstNumber);
            } else {
                if ((secondArray[findPosition(secondArray, firstNumber) + 1] != 0) &&
                        (secondArray[findPosition(secondArray, firstNumber) - 1] != 0)) {
                    sum += firstNumber;
                    kickNumberFromArray(secondArray, firstNumber);
                } else {
                    secondArray[findPosition(secondArray, firstNumber)] = Integer.MIN_VALUE;
                }
            }

        }

        return sum - count;
    }

    static int[] newArray(int[] array) {
        int j = 0;
        int[] retArray = new int[2 + array.length];
        for (int index = 0; index < retArray.length; index++) {
            if (index == 0 || index == retArray.length - 1) {
                retArray[index] = Integer.MIN_VALUE;
                continue;
            } else {
                retArray[index] = array[j];
                j++;
            }
        }
        return retArray;
    }


    static boolean halfOfTheArrayIsZero(int[] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }

            if (counter > (float) array.length / 2) {
                return true;
            }
        }
        return false;
    }

    static int findPosition(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return 0;
    }

    static int[] kickNumberFromArray(int[] array, int number) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == number) {
                array[index] = 0;
                return array;
            }
        }
        return array;
    }

    static int greatestNumberInArray(int[] array) {
        int number = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                number = array[i];
            }
        }
        return number;
    }
}