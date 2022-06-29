
public class MongoDB extends Database{

    String dbName;

    MongoDB(String dbName) {
        this.dbName = dbName;
        super.dbName = this.dbName;
    }

    @Override
    void add() {
        System.out.println("Added with "+super.dbName);
    }

    @Override
    void update() {
        System.out.println("Updated with "+dbName);
    }

    @Override
    void delete() {
        System.out.println("Deleted with "+dbName);
    }


}
