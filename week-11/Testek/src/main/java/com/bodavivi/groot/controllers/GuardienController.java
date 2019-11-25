package com.bodavivi.groot.controllers;

import com.bodavivi.groot.models.GrootError;
import com.bodavivi.groot.models.GrootMessage;
import com.bodavivi.groot.models.YondusArrow;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardienController {

  @GetMapping(value = "/groot")
  public ResponseEntity groot(@RequestParam(name = "message", required = false) String message){
    if (message == null){
      return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(new GrootError());
    }else{
      return ResponseEntity.status(HttpStatus.OK).body(new GrootMessage(message));
    }
  }

  @GetMapping(value = "/yondu")
  public ResponseEntity yondu(@RequestParam (name = "distance", required = false) Double distance, @RequestParam(name = "time", required = false) Double time){
    if ((distance == null && time == null) || (distance == null) || (time == null)){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please add the distance and/or the time");
    }else if (time == 0){
      return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("The time can't be 0");
    }else{
      return ResponseEntity.status(HttpStatus.OK).body(new YondusArrow(distance, time));
    }
  }
}
