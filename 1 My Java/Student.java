// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 1/9/2022 5:00:17 PM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Student.java


public class Student
{

    Student()
    {
        gpa = 0.0D;
    }

    Student(String s, String s1, double d)
    {
        gpa = 0.0D;
        name = s;
        grade = s1;
        gpa = d;
    }

    public String studentName()
    {
        return name;
    }

    public String studentGrade()
    {
        return grade;
    }

    public double studentGPA()
    {
        return gpa;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Name: ").append(name).append(" # Grade: ").append(grade).append(" # GPA: ").append(gpa).toString();
    }

    private String name;
    private String grade;
    private double gpa;
}
