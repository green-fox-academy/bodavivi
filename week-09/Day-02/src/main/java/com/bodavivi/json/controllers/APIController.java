package com.bodavivi.json.controllers;

import com.bodavivi.json.models.*;
import com.bodavivi.json.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class APIController {
  Log log;

  @Autowired
  LogRepository logRepository;

  //Doubling
  @GetMapping("/doubling")
  public ResponseEntity<Object> doubling(@RequestParam(required = false) Integer input) {
    log = new Log("/doubling", "input=" + input);
    logRepository.save(log);
    if (input == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Errorz("Please provide an input!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Num(input));
    }
  }

  //Greeter
  @GetMapping("/greeter")
  public ResponseEntity<Object> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    log = new Log("/greeter", "name=" + name + ", title " + title);
    logRepository.save(log);
    if (name == null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errorz("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errorz("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errorz("Please provide a title!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Greeter(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<Object> appenda(@PathVariable(name = "appendable") String appendable) {
    log = new Log("/appendale/" + appendable, "appendable=" + appendable);
    logRepository.save(log);
    if (appendable == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@PathVariable(name = "action") String action, @RequestBody DoUntil until) {
    log = new Log("/dountil/" + action, "action=" + action);
    logRepository.save(log);
    int result = 1;
    int resultSum = 0;
    if (until == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errorz("Please provide a number!"));
    } else if (action.equals("factor")) {
      for (int i = 1; i <= until.getUntil(); i++) {
        result *= i;
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoResultElement(result));
    } else if (action.equals("sum")) {
      for (int i = 0; i <= until.getUntil(); i++) {
        resultSum += i;
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoResultElement(resultSum));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity arrayHandler(@RequestBody ArrayHandler arrayHandler) {
    log = new Log("/arrays", "arrayHandler_what=" + arrayHandler.getWhat() + ", arrayHandler_numbers=" + arrayHandler.getNumbers());
    logRepository.save(log);
    int resultSum = 0;
    int resultMultiply = 1;
    List<Integer> resultDouble = new ArrayList<>();
    int doubled;
    if (arrayHandler == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    } else if (arrayHandler.getWhat().equals("sum")) {
      for (int element : arrayHandler.getNumbers()) {
        resultSum += element;
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoResultElement(resultSum));
    } else if (arrayHandler.getWhat().equals("multiply")) {
      for (int element : arrayHandler.getNumbers()) {
        resultMultiply *= element;
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoResultElement(resultMultiply));
    } else if (arrayHandler.getWhat().equals("double")) {
      for (int element : arrayHandler.getNumbers()) {
        doubled = element * 2;
        resultDouble.add(doubled);
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoResultList(resultDouble));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/log")
  public ResponseEntity log() {
    log = new Log("/log", "null");
    logRepository.save(log);
    return ResponseEntity.status(HttpStatus.OK).body(new Entries((List<Log>) logRepository.findAll()));
  }

  @PostMapping("/sith")
  public ResponseEntity sithy(@RequestBody (required = false) Texty texty) {
    if (texty == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Errorz("Feed me some text you have to, padawan young you are. Hmm."));
    } else {
      List<String> randomWords = new ArrayList<>(Arrays.asList("Argh.", "Uhmm.", "Err.", "err.", "Yuhuuu....", "Haahaaaa."));
      String[] splittedText = texty.getText().split("\\.");
      List<String> splittedSentence;
      String sithText = "";
      String helper;
      for (String sentence : splittedText) {
        splittedSentence = Arrays.asList(sentence.split(" "));
        for (int i = 0; i < splittedSentence.size(); i += 2) {
          if (i < splittedSentence.size() - 1) {
            helper = splittedSentence.get(i);
            splittedSentence.set(i, splittedSentence.get(i + 1));
            splittedSentence.set(i + 1, helper);
          }
        }
        for (int i = 0; i < splittedSentence.size(); i++) {
          String newWord;
          if (splittedSentence.get(i).endsWith(".")){
            newWord = splittedSentence.get(i).substring(0,splittedSentence.get(i).length()-2);
            sithText+= newWord;
          }else if(!splittedSentence.get(i).endsWith(".") && i == splittedSentence.size()-1) {
            sithText += splittedSentence.get(i) + ". ";
          }
          else {
            sithText += splittedSentence.get(i) + " ";
          }
        }
        Random random = new Random();
        for (int i = 0; i < (random.nextInt(2) + 1); i++) {
          sithText += (randomWords.get(random.nextInt(randomWords.size() - 1)));
        }
      }
      return ResponseEntity.status(HttpStatus.OK).body(new SithText(sithText));
    }
  }
}
