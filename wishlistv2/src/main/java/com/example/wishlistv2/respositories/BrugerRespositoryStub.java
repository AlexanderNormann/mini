package com.example.wishlistv2.respositories;


import com.example.wishlistv2.domain.model.Bruger;
import com.example.wishlistv2.domain.servives.LoginSampleException;

public class BrugerRespositoryStub implements BrugerRepository {
  @Override
  public Bruger login(String email, String kodeord) throws LoginSampleException {
    Bruger bruger = new Bruger("start.com", "test");
    bruger.setId(1);
    return bruger;
  }

  @Override
  public Bruger opretBruger(Bruger bruger) throws LoginSampleException {
    return null;
  }

  @Override
  public void gem(Bruger bruger) {

  }
}
