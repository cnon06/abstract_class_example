import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {
        Database MongoDB = new MongoDB();
        Database SQL = new SQL();
        Database FireBase = new FireBase();

        System.out.println("(1) Mongo");
        System.out.println("(2) SQL");
        System.out.println("(3) FireBase");
        System.out.print("Select Pls: ");
        Scanner sc = new Scanner(System.in);
        byte sc1 = sc.nextByte();

        switch (sc1)
        {
            case 1:
                MongoDB.subMenu();
                break;

            case 2:
                SQL.subMenu();
                break;

            case 3:
                FireBase.subMenu();
                break;
        }



    }


}
