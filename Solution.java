import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String solution(String S) {
        String[] arrOfStr = S.split("\n", -2);
        int musicStats = 0;
        int imageStats = 0;
        int movieStats = 0;
        int otherStats = 0;
        for (String str : arrOfStr) {
            musicStats += music_size(str);
            imageStats += imgSize(str);
            movieStats += mvSize(str);
            otherStats += othersSize(str);
        }
        return ("music " + musicStats + "b" + "\nimages " + imageStats +
                "b" + "\nmovies " + movieStats + "b" + "\nothers " + otherStats + "b");
    }

    public static int music_size(String s) {
        Pattern p1 = Pattern.compile(".mp3");
        Pattern p2 = Pattern.compile(".aac");
        Pattern p3 = Pattern.compile(".flac");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        String[] arrToSeparteNameAndSize = s.split(" ", 2);
        String[] arrToFindSize;

        if (m1.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m2.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m3.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else {
            return 0;
        }
    }

    public static int imgSize(String s) {
        Pattern p1 = Pattern.compile(".jpg");
        Pattern p2 = Pattern.compile(".bmp");
        Pattern p3 = Pattern.compile(".gif");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        String[] arrToSeparteNameAndSize = s.split(" ", 2);
        String[] arrToFindSize;

        if (m1.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m2.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m3.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else {
            return 0;
        }
    }

    public static int mvSize(String s) {
        Pattern p1 = Pattern.compile(".mp4");
        Pattern p2 = Pattern.compile(".avi");
        Pattern p3 = Pattern.compile(".mkv");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        String[] arrToSeparteNameAndSize = s.split(" ", 2);
        String[] arrToFindSize;

        if (m1.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m2.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m3.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else {
            return 0;
        }
    }

    public static int othersSize(String s) {
        Pattern p1 = Pattern.compile(".txt");
        Pattern p2 = Pattern.compile(".exe");
        Pattern p3 = Pattern.compile(".zip");
        Pattern p4 = Pattern.compile(".7z");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        Matcher m4 = p4.matcher(s);
        String[] arrToSeparteNameAndSize = s.split(" ", 2);
        String[] arrToFindSize;

        if (m1.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m2.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m3.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else if (m4.find()) {
            arrToFindSize = arrToSeparteNameAndSize[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arrToFindSize[0]));
        } else {
            return 0;
        }
    }
}
