public class Course {
    public String name;
    public String code;
    public String prefix;
    public int note;
    public Teacher teacher;

    public Course(String name, String code, String  prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Ogretmen ve ders bölümleri uyuşmuyor");
        }

    }
    public void printTeacherInfo(){
        this.teacher.print();
    }
}
