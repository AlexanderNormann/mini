package com.example.wishlistv2.domain.model;

public class Vare {

  private String navn;
  private String størrelse;
  private String beskrivelse;
  private String farve;
  private int id;

  public String getNavn() {
    return navn;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }

  public String getStørrelse() {
    return størrelse;
  }

  public void setStørrelse(String størrelse) {
    this.størrelse = størrelse;
  }

  public String getBeskrivelse() {
    return beskrivelse;
  }

  public void setBeskrivelse(String beskrivelse) {
    this.beskrivelse = beskrivelse;
  }

  public String getFarve() {
    return farve;
  }

  public void setFarve(String farve) {
    this.farve = farve;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Vare(String navn, String størrelse, String beskrivelse, String farve, int id) {
    this.navn = navn;
    this.størrelse = størrelse;
    this.beskrivelse = beskrivelse;
    this.farve = farve;
    this.id = id;



  }
}
