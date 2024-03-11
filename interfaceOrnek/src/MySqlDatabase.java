public class MySqlDatabase implements IDatabase{
    @Override
    public void add() {
        System.out.println("MySQL veri tabanına eklendi");
    }

    @Override
    public void insert() {
        System.out.println("MySQL veri tabanına gösterildi");

    }

    @Override
    public void delete() {
        System.out.println("MySQL veri tabanına silindi");

    }

    @Override
    public void update() {
        System.out.println("MySQL veri tabanına güncellendi");

    }
}
