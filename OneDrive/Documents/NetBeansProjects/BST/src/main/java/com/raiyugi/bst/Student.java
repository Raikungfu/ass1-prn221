/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.bst;

/**
 *
 * @author Raiku
 */
public class Student implements Comparable<Student>{
    private String code, name;
    protected float mark;

    public Student() {
        mark = -1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws Exception {
        if (!code.matches("[DCHSQ]"+"[AES]"+"[0-9]{6}"))throw new Exception("Invalid Student's code");
        else this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!name.matches("[a-zA-Z ]+"))throw new Exception("Invalid Student's name");
        else this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) throws Exception {
        if (mark>10 || mark<0) throw new Exception("Invalid Student's mark");
        else this.mark = mark;
    }
    
    @Override
    public String toString() {
        return code + "," + name + "," + mark;
    }

    @Override
    public int compareTo(Student st) {
        return this.code.compareTo(st.code);
    }
}
