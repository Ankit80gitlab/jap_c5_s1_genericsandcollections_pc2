import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {

    LinkedList<Song> list = new LinkedList<>();
    LinkedList list2 = new LinkedList<>();

    public List<Song> readFile(String fileName){

        try
        {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            String str;
            int m=0;
            while((str=buffer.readLine()) != null)
            {
                if(m==0){
                    m++;
                    continue;
                }
                String [] arr = str.split(",");
                Song obj = new Song(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4]);
                list.add(obj);
            }
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }

        return list;
    }

    public void displayContent()
    {
        ListIterator<Song> li4 = list.listIterator();
        System.out.format("%-15s %-20s %-20s %-25s %-20s","S.No.","Song Name","Lyricists","Album","Duration");
        System.out.println();
        while (li4.hasNext())
        {
            Song s = (Song)li4.next();
            System.out.format("%-15s %-20s %-20s %-25s %-20s",s.getsNO(),s.getSongsName(),s.getLyricists(),s.getMoviesName(),s.getSongDuration());
            System.out.println();
        }
        System.out.println();
    }

    public List<Song> createPlaylist(int sNo)
    {
        try
        {
            ListIterator li1 = list.listIterator();
            while(li1.hasNext())
            {
                Song s = (Song)li1.next();
                if(s.getsNO()==sNo)
                {
                    list2.add(s);
                }
            }
            return list2;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("please check entered S.No");
        }
        return list2;
    }

    public List<Song> deletePlaylist(int sNo)
    {
        try
        {
            ListIterator li3 = list2.listIterator();
            while(li3.hasNext())
            {
                Song s = (Song)li3.next();
                if(s.getsNO()==sNo)
                {
                    list2.remove(s);
                }
            }
            return list2;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("please check entered S.No");
        }
        return list2;

    }

    void displayList (){

        ListIterator<Song> li2 = list2.listIterator();
        System.out.println("Songs added in new playlist - ");
        System.out.println();
        System.out.format("%-15s %-20s %-20s %-25s %-20s","S.No.","Song Name","Lyricists","Album","Duration");
        System.out.println();
        while (li2.hasNext())
        {
            Song s = (Song)li2.next();
            System.out.format("%-15s %-20s %-20s %-25s %-20s",s.getsNO(),s.getSongsName(),s.getLyricists(),s.getMoviesName(),s.getSongDuration());
            System.out.println();
        }
        System.out.println();

    }
}
