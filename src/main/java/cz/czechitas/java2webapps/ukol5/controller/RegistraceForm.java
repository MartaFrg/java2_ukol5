package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;

public class RegistraceForm {
    @NotBlank(message="Vyplňte křestní jméno dítěte!")
    private String jmeno;
    @NotBlank(message="Vyplňte příjmení dítěte!")
    private String prijmeni;
    @NotBlank(message="Vyberte pohlaví dítěte!")
    private String pohlavi;
    @NotBlank(message="Vyberte termín tábora!")
    private String turnus;
    @NotNull(message="Zadejte platné datum narození dítěte!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @PastOrPresent(message="Zadejte platné datum narození dítěte!")
    private LocalDate narozeni;
    @Min(value = 9, message = "Věk dítěte musí být více než 9 let!")
    @Max(value = 15, message = "Věk dítěte musí být méně než 15 let!")
    private int vek;
    @Email(message="Formát emailu je neplatný!")
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
        //Period period = narozeni.until(LocalDate.now());
        //this.vek = period.getYears();
    }

    public void setVek(int vek) {
        Period period = this.narozeni.until(LocalDate.now());
        this.vek = period.getYears();
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public int getVek() {

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
