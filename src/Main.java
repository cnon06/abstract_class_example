import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {

        String mongo = "Mongo";
        String sQl = "SQL";
        String fireBase = "FireBase";


        Database MongoDB = new MongoDB(mongo);
        Database SQL = new SQL(sQl);
        Database FireBase = new FireBase(fireBase);

        System.out.println("(1) "+mongo);
        System.out.println("(2) "+sQl);
        System.out.println("(3) "+fireBase);
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
