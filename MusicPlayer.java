import java.util.*;
import java.io.*;

public class MusicPlayer{

    ArrayList<Song> songlist;
    public MusicPlayer(){
        songlist = new ArrayList<Song> ();
        readFile();
    }

    public void printSongs(){
        for(Song song : songlist){
            song.printSong();
        }
    }

    public void addSong(){
        boolean done = false;
        while(!done){
            Scanner scan = new Scanner(System.in);
            String titl;
            String auth;

            System.out.println("Please enter the title of the song: ");  
            titl = scan.nextLine();
            System.out.println("Please enter the artist's name");
            auth = scan.nextLine();
            Song s = new Song(titl, auth);
            songlist.add(s);
            System.out.println("Alright! Added \nWould you like to add another song? (Y/N)");
            String response = scan.nextLine();
            if(response.equals("Y")){
                done = false;
                System.out.println("Please enter the title of the song: ");  
                titl = scan.nextLine();
                System.out.println("Please enter the artist's name");
                auth = scan.nextLine();
                s = new Song(titl, auth);
                songlist.add(s);
                System.out.println("Alright! Added \nWould you like to add another song? (Y/N)");
                response = scan.nextLine();
            }else if(response.equals("N")){
                done = true;
                System.out.println("Okay");

            }else{
                System.out.println("make sure you enter Y for yes or N for no");
            }

        }
    }

    public void writeThem(){
        try{
            FileWriter myWriter = new FileWriter("songs.txt");
            for(Song song: songlist){
                myWriter.write(song.getTitle()+ "\n");
                myWriter.write(song.getArtist()+ "\n");

            }
            myWriter.close();

        }catch(IOException e){
            System.out.println("An error occurred. ");
            e.printStackTrace();
        }
    }
    public void readFile(){
        
        try{
            File fileAccessor = new File("songs.txt");
        Scanner reader = new Scanner(fileAccessor);
        while(reader.hasNextLine()){
            String title = reader.nextLine();
            String artist = reader.nextLine();
            Song s = new Song(title, artist);
           songlist.add(s);
        }
            
        }catch(FileNotFoundException e){
           System.out.println("File not found, sorry");
        }
        
    }

    public void findSong(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the song you would like to find?");
        String sung = scan.nextLine();
        boolean found = false;
        for(Song song : songlist){
            if(song.getTitle().equals(sung)){
                System.out.println(song);
                found = true;
            }
        }
        if(found == false){
            System.out.println("Your song was not found");
        }
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();
        String answer = "0";

        while(!answer.equals( "4")){

            System.out.println("What would you like to do? \n 1. Add Song(s) \n 2. find a Song \n 3. Print Songs \n 4. Quit");
            answer = scan.nextLine();
            if(answer.equals("1")){
                player.addSong();
            }else if(answer.equals("2")){
                player.findSong();
            }else if(answer.equals("3")){
                player.printSongs();
            }else if(answer.equals("4")){
                System.out.println("Goodbye. Thanks for using my program");
            }
            else{System.out.println("Make sure you enter 1, 2,3, or a 4");
            }
        }
        player.writeThem();
    }

}
