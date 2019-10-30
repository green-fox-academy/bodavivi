package com.bodavivi.helloword;

import com.bodavivi.helloword.models.BlueColor;
import com.bodavivi.helloword.models.MyColor;
import com.bodavivi.helloword.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication implements CommandLineRunner {

  Printer printer;
  MyColor color;


  @Autowired
  public HellowordApplication(Printer printer, @Qualifier("blue") MyColor color){
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {

    SpringApplication.run(HellowordApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("message");
    color.printColor();
  }
}
