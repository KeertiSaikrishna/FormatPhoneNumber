import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String S) {

        String[] arr = S.split("-| ");
        String joined = String.join("", arr);
        List<String> listOfNumbers = new ArrayList<String>();

        int indexOfJoinedString = 0;
        while (indexOfJoinedString < joined.length()) {
            if ((joined.length() - indexOfJoinedString) > 4 || indexOfJoinedString + 3 == joined.length()) {
                listOfNumbers.add(joined.substring(indexOfJoinedString,
                        Math.min(indexOfJoinedString + 3, joined.length())));
                indexOfJoinedString += 3;
            } else {
                listOfNumbers.add(joined.substring(indexOfJoinedString, 
                        Math.min(indexOfJoinedString + 2, joined.length())));
                indexOfJoinedString += 2;
            }
        }
        String formattedNumber = String.join("-", listOfNumbers);
        return formattedNumber;
    }
}