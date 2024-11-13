import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    FriendsSettings friends = new FriendsSettings();
    Files file = new Files(friends);

    public void userChoice() {
        System.out.println("1. Show me list of friends \n2. Enter a new friend \n3. Delete a friend \n4. Save list \n5. Load list \n9. Quit");
        int user = test();

        if(user == 1) {
            System.out.println("List of friends");
            friends.seAlleVenner();
        }

        if(user == 2) {
            System.out.println("Enter a new friend");
            friends.tilføjNyeVenner();

        }

        if(user == 3) {
            System.out.println("Delete a friend");
            friends.removeFriend();
        }

        if(user == 4) {
            System.out.println("Save list");
            file.saveFiles();
        }

        if(user == 5) {
            System.out.println("Load list");
            file.seeFiles();
        }

        if(user == 9) {
            System.out.println("Exiting");
            System.exit(0);
        }
    }

    private String userInput() {
        String user = scanner.nextLine();
        return user;
    }

    private int test() {
        int user;
        do {
            try {
                user = Integer.parseInt(userInput());

            } catch (Exception e) {
                System.out.println("Try again");
                user = 0;
            }
        } while (user < 0 || user > 10);
        return user;
    }
}
