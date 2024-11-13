import java.util.ArrayList;
import java.util.Scanner;

public class FriendsSettings {

    private ArrayList <Friends> venner = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void vennerne(String name, int number, String email) {
        Friends nyeVenner = new Friends(name, number, email);
        venner.add(nyeVenner);
    }

    public void tilføjNyeVenner() {
        System.out.println("Navn");
        String name = scanner.next();
        System.out.println("Telefonnummer");
        int number = scanner.nextInt();
        System.out.println("Email");
        String email = scanner.next();
        vennerne(name, number, email);
    }

    public ArrayList<Friends> getVenner() {
        return venner;
    }

    public void removeFriend() {
        System.out.println("What friend do you want to remove");
        int userRemove = scanner.nextInt();
        System.out.println("Removed: " + venner.get(userRemove));
        venner.remove(userRemove);
    }

    public void seAlleVenner() {
        for(Friends hej : getVenner()) {
            System.out.println(hej);
        }
    }

}
