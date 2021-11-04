package com.example.wishlistv2.domain.model;

public class Bruger {
  private String fornavn;
  private String efternavn;
  private String email;
  private String kodeord;
  private int id;

  public Bruger(String fornavn, String efternavn, String email, String kodeord) {
    this.fornavn = fornavn;
    this.efternavn = efternavn;
    this.email = email;
    this.kodeord = kodeord;
  }

  public Bruger(String email, String kodeord) {
    this.email = email;
    this.kodeord = kodeord;
  }

  public Bruger() {

  }


  public String getFornavn() {
    return fornavn;
  }

  public void setFornavn(String fornavn) {
    this.fornavn = fornavn;
  }

  public String getEfternavn() {
    return efternavn;
  }

  public void setEfternavn(String efternavn) {
    this.efternavn = efternavn;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getKodeord() {
    return kodeord;
  }

  public void setKodeord(String kodeord) {
    this.kodeord = kodeord;
  }

  public void setId(int id) {
    this.id = id;
  }
}
