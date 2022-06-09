package com.company.OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Student ob1=new Student();
        Student ob2=new Student();

        ob1.rollno=12;
        ob2.rollno=15;
        System.out.println(ob1.rollno);
        System.out.println(ob2.rollno);

    }
}

class Student{
    static String college;
    static int rollno;
    void show(){
        System.out.println(rollno);
    }
}
