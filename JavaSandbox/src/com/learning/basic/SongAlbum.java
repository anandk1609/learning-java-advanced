package com.learning.basic;

import java.util.Scanner;
import java.util.ArrayList;

public class SongAlbum {
    public static void main(String[] args) {
        ArrayList<String> songList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Liked Playlist");
        System.out.println("1. Enter a song\n2. Update a song\n3. Delete a song\n4. Show liked playlist\n5. Exit\n");
        while(true) {
            System.out.println("Enter a choice:");
            int choice = input.nextInt();
            input.nextLine();
            if(choice == 1) {
                System.out.println("Enter a song:");
                String song = input.nextLine();
                songList.add(song);
                System.out.println("Song added!");
            } else if(choice == 2) {
                System.out.println("Select a song name to update: ");
                int number = input.nextInt();
                if(number > 0 && number <= songList.size()) {
                    String newSong = input.nextLine();
                    songList.add(number - 1, newSong);
                    System.out.println("Song updated!");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if(choice == 3) {
                System.out.println("Select a song name to delete:\n");
                int num = input.nextInt();
                if(num > 0 && num <= songList.size()) {
                    songList.remove(num);
                } else {
                    System.out.println("Invalid choice");
                }
            } else if(choice == 4) {
                for(int i = 0; i < songList.size(); i++) {
                    System.out.println((i+1) + ". " + songList.get(i));
                }
            } else if(choice == 5) {
                break; 
            } else {
                System.out.println("Invalid choice");
            }
        }

        input.close();
    }   
}