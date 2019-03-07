package com.example.hp_user.intiadmin.classes;

public interface dbInterface {
    String c1="_id";
    String c2="cname";
    String c3="fee";
    String c4="duration";
    String c5="about";
    String ca="rno";
    String cb="fname";
    String cc="lname";
    String cd="email";
    String ce="contact";
    String cf="address";
    String t1Name="tbCourse";
    String t2Name="tbStudent";
    String Dname="dbInst";
    int dversion=2;
    String t1create="Create table "+t1Name+"("+c1+" integer Primary key,"+c2+" varchar(50),"+c3+" varchar(50),"+c4+" varchar(50),"+c5+" varchar(50))" ;
    String t2create="Create table "+t2Name+"("+ca+" integer Primary key,"+cb+" varchar(50),"+cc+" varchar(50),"+cd+" varchar(50),"+ce+" varchar(50),"+cf+" varchar(50))" ;

}
