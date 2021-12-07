package com.zuhlke.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/** This class converts the roman numerals into integers. I,II,III,IV,V,VI,VII,VIII,IX,X */
class DemoProjectTest {

  private static DemoProject demoProject;

  @BeforeAll
  static void setUp() {
    demoProject = new DemoProject();
  }

  @Test
  void parseFirstRomanNumber() {
    Assertions.assertEquals(1, demoProject.parseRomanVal("I"));
  }

  @Test
  void parseSecondRomanNumber() {
    Assertions.assertEquals(2, demoProject.parseRomanVal("II"));
  }

  @Test
  void parseThirdRomanNumber() {
    Assertions.assertEquals(3, demoProject.parseRomanVal("III"));
  }

  @Test
  void parseFourthRomanNumber() {
    Assertions.assertEquals(4, demoProject.parseRomanVal("IV"));
  }

  @Test
  void parseFiveRomanNumber() {
    Assertions.assertEquals(5, demoProject.parseRomanVal("V"));
  }

  @Test
  void parseSixRomanNumber() {
    Assertions.assertEquals(6, demoProject.parseRomanVal("VI"));
  }

  @Test
  void parseNineRomanNumber() {
    Assertions.assertEquals(9, demoProject.parseRomanVal("IX"));
  }

  @Test
  void parseTenRomanNumber() {
    Assertions.assertEquals(10, demoProject.parseRomanVal("X"));
  }

  @Test
  void parseTwentyOneRomanNumber() {
    Assertions.assertEquals(21, demoProject.parseRomanVal("XXI"));
  }

  @Test
  void parseSixHundredAndSixtySixRomanNumber() {
    Assertions.assertEquals(666, demoProject.parseRomanVal("DCLXVI"));
  }
}