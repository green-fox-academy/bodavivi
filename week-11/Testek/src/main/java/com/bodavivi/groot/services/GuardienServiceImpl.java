package com.bodavivi.groot.services;

import com.bodavivi.groot.models.Cargo;
import com.bodavivi.groot.models.Fill;
import org.springframework.stereotype.Service;

@Service
public class GuardienServiceImpl implements GuardienService {

  public void fillCargo(Cargo cargo, String received, Integer amount){
    if (received.equals(".50")){
      cargo.setCaliber50(cargo.getCaliber50() + amount);
    }else if(received.equals(".30")){
      cargo.setCaliber30(cargo.getCaliber30() + amount);
    }else if(received.equals("25")){
      cargo.setCaliber25(cargo.getCaliber25() + amount);
    }
  }
}
