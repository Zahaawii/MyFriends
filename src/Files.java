import java.io.*;
import java.util.Scanner;

public class Files {

    final String FILENAME = "friends.txt";
    private FriendsSettings t;

    public Files(FriendsSettings t) {
        this.t = t;
    }

    public void saveFiles() {

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILENAME, true));
            System.out.println(t.getVenner());
            for(Friends stc : t.getVenner()) {
                pw.println(stc);
            }
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void seeFiles() {

        try {
            File fr = new File(FILENAME);
            Scanner read = new Scanner(fr);
            while(read.hasNextLine()) {
            String data = read.nextLine();
            System.out.println(data);
            System.out.println("------------");

            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
