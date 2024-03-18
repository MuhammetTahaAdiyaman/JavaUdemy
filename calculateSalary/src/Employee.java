public class Employee {
    public String name;
    public double salary;
    public  int workHours;
    public int hireYear;

    public double tax;
    public double bonus;
    public double raiseSalary;
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary>0 && this.salary < 1000){
            this.tax = this.salary*0;
        }else{
            this.tax = this.salary*0.03;
        }
    }

    public void bonus(){
        if(this.workHours > 40){
            this.bonus = (this.workHours-40)*30;
        }else{
            this.bonus = 0;
        }
    }

    public void raiseSalary(){
        if(2021-this.hireYear<10){
            this.raiseSalary = this.salary*0.05;
        }else if(2021-this.hireYear<20){
            this.raiseSalary = this.salary*0.10;
        }else{
            this.raiseSalary = this.salary*0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + tax +
                ", bonus=" + bonus +
                ", raiseSalary=" + raiseSalary +
                ", Vergi ve bonuslarla birlikte maaş= "+(this.salary+this.bonus-this.tax)+
                ", toplam maaş="+(this.salary+this.bonus+this.raiseSalary-this.tax)+
                '}';

    }
}
