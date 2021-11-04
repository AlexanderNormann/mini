package com.example.wishlistv2.domain.servives;

import com.example.wishlistv2.domain.model.Bruger;
import com.example.wishlistv2.respositories.BrugerRepository;

public class Services {
  private BrugerRepository brugerRepository;

  public void gem(Bruger bruger){
    brugerRepository.gem(bruger);

  }
}
