//Daniel Castillo CSIS 1400 3-1 Arraylist Assignment
import java.util.ArrayList;

public class Song{
    
    private String title;
    private String artist;
    
    public Song(String t, String a){
        title = t;
        artist = a;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public void setTitle(String e){
        title = e;
    }
    public void setArtist(String s){
        artist = s;
    }
    public void printSong(){
        System.out.println("Title: " + title + "|Artist: " + artist + ".");
    }
}
