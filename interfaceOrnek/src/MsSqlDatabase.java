public class MsSqlDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("MsSql eklendi");
    }

    @Override
    public void insert() {
        System.out.println("MsSql verileri gösterildi");

    }

    @Override
    public void delete() {
        System.out.println("MsSql verileri silindi");

    }

    @Override
    public void update() {
        System.out.println("MsSql verileri güncellendi");

    }
}
