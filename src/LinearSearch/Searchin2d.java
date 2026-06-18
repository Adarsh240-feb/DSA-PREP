package LinearSearch;

public class Searchin2d {
    public static void main() {
        int[][] arr = {
                {12, 67, 78},
                {15, 76, 52},
                {45, 73, 90}
        };
        int target = 68;
        boolean ans = search(arr , target);
        System.out.println(ans);

    }

    static boolean search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
