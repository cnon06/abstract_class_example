
public class MongoDB extends Database{

    @Override
    void add() {
        System.out.println("Added with MongoDB");
    }

    @Override
    void update() {
        System.out.println("Updated with MongoDB");
    }

    @Override
    void delete() {
        System.out.println("Deleted with MongoDB");
    }


}
