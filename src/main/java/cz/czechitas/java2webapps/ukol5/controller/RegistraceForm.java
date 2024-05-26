package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;

public class RegistraceForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @NotBlank
    private String pohlavi;
    @NotBlank
    private String turnus;
    //@NotBlank
    @PastOrPresent
    @DateTimeFormat//(iso = DateTimeFormat.ISO.DATE)
    private LocalDate narozeni;
    //@Min(9)
    //@Max(15)
    private int vek;
    @Email
    private String email;
    private String telefon;

    public RegistraceForm() {
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public LocalDate getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(LocalDate narozeni) {
        this.narozeni = narozeni;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public int getVek() {
        Period period = narozeni.until(LocalDate.now());
        this.vek = period.getYears();
        return vek;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
