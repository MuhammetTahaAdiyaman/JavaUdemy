//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","555002022","TRH");
        Teacher t2 = new Teacher("Graham Bell","555030430","FZK");
        Teacher t3 = new Teacher("Hüseyin Tan","555023049","MTH");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);
        Course matematik = new Course("Matematik","101","MTH");
        matematik.addTeacher(t3);

        Student s1 = new Student("inek şaban","1234","4",tarih,fizik,matematik);
        s1.addBulkExamNote(100,200,50);
        s1.isPass();
    }
}