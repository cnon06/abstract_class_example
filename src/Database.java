import java.util.Scanner;

abstract class Database {
    abstract void add();
    abstract void update();
    abstract void delete();

    String dbName;

    void subMenu()
    {
        System.out.println("---------- "+dbName+" ------------");
        System.out.println("(1) Add");
        System.out.println("(2) Update");
        System.out.println("(3) Delete");
        System.out.print("Select item: ");
        Scanner sc = new Scanner(System.in);
        byte sc1 = sc.nextByte();
        System.out.println("Output: "+sc1);

        switch (sc1)
        {
            case 1:
                add();
                break;

            case 2:
                update();
                break;

            case 3:
                delete();
                break;

            default:
                System.out.println("you entered a wrong value");

        }


    }

}
