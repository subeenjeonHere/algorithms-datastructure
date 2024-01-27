package demo.mergesort;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println("Before:");
        printArray(numbers);
        mergesort(numbers);
        System.out.println("After:");
        printArray(numbers);
    }

    private static void mergesort(int[] numbers) {
        int inputlength = numbers.length;
        if (inputlength < 2) { // 배열 길이 1 이하이면 return
            return;
        }
        //두 개의 배열로 나눔
        int mid = inputlength / 2;
        int[] leftharf = new int[mid];
        int[] rightharf = new int[inputlength - mid];

        for (int i = 0; i < mid; i++) {
            leftharf[i] = numbers[i]; // 배열 절반을 왼쪽 배열에 채움
        }
        for (int i = mid; i < numbers.length; i++) {
            rightharf[i] = numbers[i]; // 배열 오른쪽 절반을 오른족 배열에 채움
        }

        mergesort(leftharf);
        mergesort(rightharf);

    }

    private static void merge(int[] numbers, int[] leftharf, int[] righthalf) {

        int leftSize = leftharf.length;
        int rightSize = righthalf.length;
    }

    private static void printArray(int[] numbers) {
    }
}
