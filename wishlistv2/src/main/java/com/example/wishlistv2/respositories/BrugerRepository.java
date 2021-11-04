package com.example.wishlistv2.respositories;


import com.example.wishlistv2.domain.model.Bruger;
import com.example.wishlistv2.domain.servives.LoginSampleException;

public interface BrugerRepository {

  public Bruger login(String email, String kodeord) throws LoginSampleException;

  public  Bruger opretBruger(Bruger bruger) throws LoginSampleException;

  void gem(Bruger bruger);
}
