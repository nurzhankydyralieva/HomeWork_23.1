import java.security.PublicKey;

public class Developer extends Employee{
    private String grades;

    public Developer(String fullName, int age, double salary, String grades) {
        super(fullName, age, salary);
        this.grades = grades;
    }

    public Developer(){

    }
    public void print(){
        super.print();

        System.out.println("Developer has grades  " + this.getGrades());
    }

    @Override
    public void goToDayOff() {
        System.out.println("Developer says 'Last two month I have worked very hard and I got tired. I need day off to take rest'");
    }

    public void writeCode(){
        System.out.println("We are working on great project.");
    }
    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }


}
