package com.bodavivi.groot.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardienController.class)
public class GuardienControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void groot_WithGivenParameter() throws Exception {
    mockMvc.perform(get("/groot")
        .param("message", "Hi"))
        .andExpect(jsonPath("$.received", is("Hi")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")))
        .andExpect(status().isOk());
  }

  @Test
  public void groot_WithNoParameter() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(jsonPath("$.error", is("I am Groot!")))
        .andExpect(status().isIAmATeapot());
  }

  @Test
  public void yondu_WithValidParameters() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100").param("time", "10"))
        .andExpect(jsonPath("$.speed", is(10D)))
        .andExpect(jsonPath("$.distance", is(100D)))
        .andExpect(jsonPath("$.time", is(10D)))
        .andExpect(status().isOk());
  }

  @Test
  public void yondu_WithoutParameters() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void yondu_WithoutDistanceParameter() throws Exception {
    mockMvc.perform(get("/yondu").param("time", "100"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void yondu_WithTimeZero() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100").param("time", "0"))
        .andExpect(status().isBadGateway());
  }

  @Test
  public void rocker() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk());
  }
}