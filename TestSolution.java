public class TestSolution {
    public static void main(String[] args) {
        String S = "my.song.mp3 11b\nngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";

        Solution obj = new Solution();
        String stats = obj.solution(S);
        System.out.println(stats);
    }
}
