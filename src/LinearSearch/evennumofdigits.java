package LinearSearch;

public class evennumofdigits {
    public static void main() {
        int [] arr = { 123 , 56 , 7890 , 56 ,1 , 2};
        int ans = search(arr);
        System.out.println(ans);


    }
    static int search(int [] arr){
        int maincount = 0;
        for (int i = 0; i < arr.length ; i++){
            int count = 0;
            int temp = arr[i];
            while (temp > 0){
                temp = temp / 10;
                count++;
            }
            if (count % 2 == 0){
                maincount++;
            }
        }
        return maincount;

    }
}
