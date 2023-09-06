package Bai2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Classroom {
    private int id  ;
    private int soHS ;
    private ArrayList<Student> students  ;

    public Classroom(int id, int soHS, ArrayList<Student> students) {
        this.id = id;
        this.soHS = soHS;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoHS() {
        return soHS;
    }

    public void setSoHS(int soHS) {
        this.soHS = soHS;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.print("Nhap vao ID Lớp : " );
        id = Ip.nextInt() ;
        System.out.print("Nhập vào số học sinh  : ");
        soHS = Ip.nextInt() ;
        students = new ArrayList<>() ;
        for(int i = 0 ; i < soHS ; i++){
            System.out.println("Nhap vao thong tin hoc sinh thu : " + (i+1));
            System.out.println("Theo cu phap : Tên HS + Tuổi + Giới tính + mã sinh viên  + quê hương + huyện + GPA");
            Student one = new Student();
            one.Input() ;
            students.add(one) ;
        }
    }
    public void Out(){
        System.out.println("idclass = " + id);
        System.out.println("soluongHS = " + soHS);
        for(int i = 0 ; i < soHS ; i++){
            System.out.println("ĐÂY LÀ THÔNG TIN SINH VIÊN : " + (i+1));
            students.get(i).Out() ;
            System.out.println();
        }
    }
    public Classroom(){}


    public void Search(String TenSV){
        for(int i = 0 ; i < soHS ; i++){
            String h = students.get(i).getName() ;
            if(h == TenSV) {
                System.out.println("ten do la cua sinh vien thu : " + (i + 1));
            }
//            System.out.println(students.get(i).getName());
//            System.out.println(TenSV);
        }
    }
}
