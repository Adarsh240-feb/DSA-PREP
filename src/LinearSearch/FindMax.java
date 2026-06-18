package LinearSearch;

public class FindMax {
    public static void main() {
        int [] arr = {1 , 45 , 67 , -6 , 89 };
        int ans = min(arr);
        System.out.println(ans);

    }
    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
