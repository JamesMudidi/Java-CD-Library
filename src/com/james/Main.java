package com.james;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MovieCD movieCD = new MovieCD(
                301,
                "Die Hard two",
                3500,
                8,
                "2hrs"
        );
        MusicCD musicCD = new MusicCD(
                101,
                "Cinderella",
                5000,
                4,
                "The Kings Plan."
        );
        musicCD.displayMusicCD();
        movieCD.displayMovieCD();
    }
}
