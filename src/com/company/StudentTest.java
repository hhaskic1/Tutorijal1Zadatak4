package com.company;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {

    @Test
    void TestKonstruktora(){
        Student s=new Student("Haris","Haskic",17378);
        assertEquals("Haris Haskic (17378)", s.toString());

    }

    @Test
    void GetImeTest(){
        Student s=new Student("Haris","Haskic",17378);
        Student s1=new Studnet(null,null,10000);
        assertAll("Provjera imena", ()-> assertEquals("Haris", s.getIme()),
                ()-> assertEquals(null,s1.getIme()));
    }

    @Test
    void GetPrezimeTest(){
        Student s=new Student("Haris","Haskic",17378);
        Student s1=new Student(null,null,10000);
        assertAll("Provjera prezimena", ()->assertEquals("Haskic,",s.getPrezime()),
                ()->assertEquals(null,s1.getPrezime()));
    }

    @Test
    void getIndeksTest() {
        Student s=new Student("Haris", "Haskic", 17378);
        Student s2=new Student("Adnan","Brkic", Integer.MIN_VALUE);
        Student s3=new Student("Iman","Haskic",Integer.MAX_VALUE);
        Student s1=new Student(null, null, 0000);
        Student s4=new Student(null,null,132456);
        assertAll("Provjera indeksa",
                ()-> assertEquals(0, s1.getIndeks()),
                ()-> assertEquals(17378,s.getIndeks()),
                ()-> assertEquals(Integer.MIN_VALUE, s2.getIndeks()));
        final Runnable runnable = () -> assertEquals(Integer.MAX_VALUE, s3.getIndeks());
        Callable<V> vCallable = () -> {
            return assertEquals(132456, s4.getIndeks());
        };

    }


    @Test
    void setImeTest() {
        Student s=new Student("Haris", "Haskic", 17378);
        s.setIme("Taha");
        assertEquals("Taha", s.getIme());
        s.setIme(null);
        assertEquals(null, s.getIme());
    }

    @Test
    void setPrezimeTest() {
        Student s=new Student("Haris", "Haskic", 17378);
        s.setPrezime("Dervishalidovic");
        assertEquals("Dervishalidovic", s.getIme());
        s.setPrezime(null);
        assertEquals(null, s.getIme());
    }

    @Test
    void setBrojIndeksaTest(){
        Student s=new Student("Haris","Haskic",17378);
        s.setIndeks(15000);
        assertEquals(15000,s.getIndeks());
        s.setIndeks(00000);
        assertEquals(00000,s.getIndeks());
    }





}