//package baek_joon.class_3.회의실배정;
//
//import javax.imageio.IIOException;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//
///**
// * @Point 성능 더 빠른 풀이 참고
// */
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        //N개 회의 입력 받기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        //회의 시간표 arr
//        int[][] arr = new int[n + 1][2];
//        //회의 시간 입력
//        for (int i = 1; i <= n; i++) {
//            String[] info = br.readLine().split(" ");
//            int s = Integer.parseInt(info[0]);
//            int e = Integer.parseInt(info[1]);
//            arr[i][0] = s;
//            arr[i][1] = e;
//        }
//        System.out.println(Arrays.deepToString(arr));
//
//        // 종료시간 오름차순 정렬
//        //회의 최대한 많이 배치하기 위해 회의 사이 간격 최소화, 종료시간 일찍 끝나는 순 -> 그리고 그 다음 가장 빨리 시작하는 순
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                //Compare 메소드 모르겠음
//                if (o1[1] == o2[1]) {
//                    return
//                }
//                return 0;
//            }
//        });
//
//    }
//}
