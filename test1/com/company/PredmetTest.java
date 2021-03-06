package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {


    @Test
    void PredmetTest() {
        Predmet p=new Predmet("rpr", 17378,10);
        assertEquals("rpr 17617",p.toString());
    }
    @Test
    void upisiTest() {
        Predmet p = new Predmet("RPR", 111,14);
        assertAll("predmet",
                () -> assertEquals("RPR", p.getNazivPredmeta()),
                () -> assertEquals(111, p.getSifraPredmeta()));
    }
    @Test
    void ispisiTest() {
    }

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("RPR", 003, 12);
        assertAll("predmet", () -> assertEquals("RPR", p.getNazivPredmeta()));
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet("RPR", 003, 12);
        assertAll("sifra", () -> assertEquals(003,p.getSifraPredmeta()));
    }
    @Test
    void setSifraPredmetaTest() {
        Predmet p = new Predmet("RPR", 17378, 12);
        p.setSifraPredmeta(17378);
        assertEquals("RPR 17378", p.toString());
    }

    @Test
    void setNazivPredmeta() {
        Predmet p = new Predmet("RPR", 17378, 12);
        p.setNazivPredmeta("OR");
        assertEquals("OR 17378", p.toString());
    }

    @Test
    void getStudentiTest() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student s = new Student("Haris", "Haskic", 17378);
        p.setStudenti(new Student[12]);
        assertThrows(IllegalArgumentException.class, () -> {
            p.upisi(s);
        });
        p.setStudenti(null);
        assertArrayEquals(null , p.getStudenti());
    }
    @Test
    void setStudentiTest() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student[] s=new Student[2];
        p.setStudenti(new Student[2]);
        assertEquals(2, (p.getStudenti().length));
    }

}