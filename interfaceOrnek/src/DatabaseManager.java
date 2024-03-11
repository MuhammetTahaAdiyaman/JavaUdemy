public class DatabaseManager {
    public void addDatabase(IDatabase database){
        database.add();
    }

    public void insertDatabase(IDatabase database){
        database.insert();
    }

    public void deleteDatabase(IDatabase database){
        database.delete();
    }

    public void updateDatabase(IDatabase database){
        database.update();
    }
}
