// Necessary imports without using java.util.*
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PlayListManager {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cartList = readDataFromFile("PlayList.txt");
        checkAndPrintSameItems(cartList);
    }

    /**
     * Reads data from a file and returns a list of songs.
     * @param fileName The file containing the playlist.
     * @return An ArrayList of songs.
     * @throws IOException If file reading fails.
     */
    public static ArrayList<String> readDataFromFile(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        Scanner inpScnr = new Scanner(inputStream);
        ArrayList<String> songsList = new ArrayList<String>();

        while (inpScnr.hasNextLine()) {
            songsList.add(inpScnr.nextLine());
        }

        inpScnr.close();
        inputStream.close();

        return songsList;
    }

    /**
     * Checks for duplicate songs and prints them.
     * @param songsList The list of songs.
     */
    public static void checkAndPrintSameItems(ArrayList<String> songsList) {
        for (int i = 0; i < songsList.size(); ++i) {
            for (int j = i + 1; j < songsList.size(); ++j) {
                if (songsList.get(i).equals(songsList.get(j))) {
                    System.out.println("This song is already on your playlist: " + songsList.get(i));
                }
            }
        }
    }
}
