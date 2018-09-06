import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String S) {

        String[] arr = S.split("-| ");
        String joined1 = String.join("", arr);
        System.out.println(joined1);
        List<String> slist = new ArrayList<>();

        int index = 0;
        while (index < joined1.length()) {
            if ((joined1.length() - index) > 4 || index+3== joined1.length()) {
                slist.add(joined1.substring(index, Math.min(index + 3, joined1.length())));
                index += 3;
            } else {
                slist.add(joined1.substring(index, Math.min(index + 2, joined1.length())));
                index += 2;
            }
        }
        String finalList = String.join("-", slist);
        return finalList;
    }
}