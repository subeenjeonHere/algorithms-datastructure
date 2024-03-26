package Algorithms.countingSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int[] count = new int[8];
        int[] sortedOutput = new int[arr.length];


        //arr의 각 원소가 몇 개 있는지, 각 인덱스 값에 저장
        for (int i = 0; i < arr.length; i++) {
            // arr i=0, 4이고 -> newArr의 idx 4에 저장되어야 함
            int num = arr[i];
            count[num] += 1;
        }

        //카운팅한 수 -> 다시 idx를 출력한다 (원본배열의 원소값, 저장된 횟수만큼 sortedOutput에 출력
        for (int i = 0; i < sortedOutput.length; i++) {
            while (count[i] == 0) {
                if (count[i] > 0) {
                    sortedOutput[i] = i;
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int ele : sortedOutput) {
            sb.append(ele).append('\n');
        }

        System.out.println("Length" + sortedOutput.length);

    }
}
