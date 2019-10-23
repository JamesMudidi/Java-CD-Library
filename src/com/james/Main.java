package com.james;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MovieCD movieCD = new MovieCD(
                new int[]{301, 302, 303},  // Create an array of movie cdNo.
                new String[]{"Die Hard two.", "Crazy Wedding.", "Mind your Language"},  // Create an array of movie title
                new double[]{3500, 4000, 4500},  // Create an array of movie cd cost
                new int[]{8, 3, 3},  // Create an array of movie stock level
                new String[]{"2hrs.", "2.5hrs.", "3hrs."}  // Create an array of movie duration
        );
        MusicCD musicCD = new MusicCD(
                new int[]{101, 102},  // Create an array of music cdNo.
                new String[]{"Cinderella", "Chameleon Collection"},  // Create an array of music title
                new double[]{5000, 3000},  // Create an array of music cd cost
                new int[]{4, 6},  // Create an array of music stock level
                new String[][]{ {"A Dream is a Wish", "The Kings Plan"}, {"Wale Wale", "Ba Yuda", "Moto Moto" } }  // Create an array of songs
        );
        musicCD.displayMusicCD();
        movieCD.displayMovieCD();
    }
}
