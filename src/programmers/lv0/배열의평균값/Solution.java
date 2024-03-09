package programmers.lv0.배열의평균값;

class Solution {

    public double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = answer/ numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers.length);}
}
