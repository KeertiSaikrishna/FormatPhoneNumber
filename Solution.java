import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String S) {

        String[] arrOfNumbers = S.split("-| ");
                                        // removind '-' and ' ' from string and storing it in arrOfNumbers
        String numbersOnly = String.join("", arrOfNumbers);
                                        //creating a String of number without any delimiters
        List<String> listOfNumbers = new ArrayList<String>();

        int indexOfJoinedString = 0;
        while (indexOfJoinedString < numbersOnly.length()) {
            if ((numbersOnly.length() - indexOfJoinedString) > 4 || indexOfJoinedString + 3 == numbersOnly.length()) {
                listOfNumbers.add(numbersOnly.substring(indexOfJoinedString,
                        Math.min(indexOfJoinedString + 3, numbersOnly.length())));
                indexOfJoinedString += 3;
            } else {
                listOfNumbers.add(numbersOnly.substring(indexOfJoinedString,
                        Math.min(indexOfJoinedString + 2, numbersOnly.length())));
                indexOfJoinedString += 2;
            }
        }
                                        //deviding the numbers into 3 or 2 groups and storing them in listOfNumbers
        String formattedNumber = String.join("-", listOfNumbers);
                                        //creating the formattedNumber using delimiter "-"
        return formattedNumber;
    }
}