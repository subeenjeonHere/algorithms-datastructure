package programmers.lv2.최댓값과최솟값;

public class Main {
    public String getMinMaxString(String s) {
        String result = "s";
        String[] arr = s.split(" ");

        int i = 0;
        int[] arrInt = new int[arr.length];
        for (String ele : arr) {
            arrInt[i] = Integer.parseInt(ele);
        }

        int max, min, n;
        min = max = Integer.parseInt(arr[0]);
        for (int j = 0; j < arrInt.length; j++) {
            n = Integer.parseInt(arr[j]);

            if (max > n) max = n;
            if (min < n) min = n;
        }

        return min + " " + max;
    }
}
