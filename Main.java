import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileName="songs.csv";

        Playlist obj1 = new Playlist();
        obj1.readFile(fileName);
        obj1.displayContent();
        System.out.println("Would you like to create new playlist (y/n)");
        String input1=sc.next();
        String input2;
        if(input1.equalsIgnoreCase("y"))
        {
            do
            {
                System.out.println("Enter song serial number");
                obj1.createPlaylist(sc.nextInt());
                obj1.displayList();
                System.out.println("would you like to add another song (y/n)");
                input2 = sc.next();
                if(input2.equalsIgnoreCase("n"))
                {
                    System.out.println("Thank you, playlist has been created successfully");
                }
            }
            while(input2.equalsIgnoreCase("y"));

            String input6;
            System.out.println("Would you like to remove songs from created playlist (y/n)");
            String input4 = sc.next();
            if(input4.equalsIgnoreCase("y"))
            {
                do
                {
                    obj1.displayList();
                    System.out.println("Enter song serial number of the song to remove from playlist");
                    int input5= sc.nextInt();
                    obj1.deletePlaylist(input5);
                    obj1.displayList();
                    System.out.println("would you like to add another song (y/n)");
                    input6 = sc.next();
                    if(input6.equalsIgnoreCase("n"))
                    {
                        System.out.println("Thank you, have a great day");
                    }
                }
                while(input6.equalsIgnoreCase("y"));

            }

        }


        else if(input1.equalsIgnoreCase("n"))
        {
            System.out.println("Thank you, have a great day");
        }

        else
        {
            System.out.println("Invalid input");
        }
    }
}
