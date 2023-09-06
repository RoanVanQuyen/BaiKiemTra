package Bai2;

import com.sun.security.jgss.GSSUtil;

public class Student  extends Person{
    private int id ;
    private Adress adress ;
    private double gpa ;

    public Student(int id, Adress adress, double gpa) {
        this.id = id;
        this.adress = adress;
        this.gpa = gpa;
    }

    public Student(String name, int age, String gender, int id, Adress adress, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.adress = adress;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student() {} ;
    @Override
    public void Input(){
        super.Input() ;
        id = Ip.nextInt() ;
        adress = new Adress() ;
        adress.Input() ;
        gpa = Ip.nextDouble() ;
    }
    public void Out(){
        super.Out() ;
        System.out.println("idstudent = " + id);
        adress.Out() ;
        System.out.println("gpa = " + gpa);
    }
}
