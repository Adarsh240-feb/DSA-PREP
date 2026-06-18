package LinearSearch;

import java.util.Scanner;

public class StringSearch {
    public static void main() {
            String str = "Adarsh";
            Scanner in = new Scanner(System.in);
            char Target = in.next().charAt(0);

        System.out.println(StringFind(str , Target));



    }
    static boolean StringFind(String str , char Target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0 ; i < str.length() ; i++){
            if (Target == str.charAt(i)){
                return true;
            }
        }


        return false;
    }
}
