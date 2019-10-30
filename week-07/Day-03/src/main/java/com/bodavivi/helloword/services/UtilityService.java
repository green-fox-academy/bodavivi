package com.bodavivi.helloword.services;

// # Useful Utilities

// Create a controller with a few endpoints where the user can use the useful utilities.

// ## First steps
// - Have a main page at `/useful`
// - This should contain links to all available utilities detailed below

// Use this `UtilityService` as a dependency for your controller.

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

// ## Colored Background
// - Have an endpoint `/useful/colored`
//     - should display an empty page with a random color background

// ## Email validator
// - Endpoint at `/useful/email` with a queryparam
// - Have a link at the main page to an example: `/useful/email?email=is@this.valid`
// - Create a `validateEmail` method in the `UtilityService`
//     - check if the string contains a `@` and a `.`
// - Display the following to the user
//     - `is@this.valid is a valid email address` in green
//     - `not_valid_email.com is not a valid email address` in red

// ## Caesar encoder/decoder
// _Caesar coding is just shifting every character in the text with a specific number of amount in the alphabet, coded `example` with `1` is `fybnqmf`._
// - Endpoints for encoding and decoding with a `text` and `number` query param
// - Link at the main page for both
// - Service method:

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}

// - For encoding use the `number` value, for decoding use the `-number` value
