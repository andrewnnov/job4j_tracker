package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.JavaNameValidator.isNameValid;

public class JavaNameValidatorTest {

    @Test
    public void whenEmptyNameInvalid() {
        //assertThat(isNameValid("")).isFalse();
        assertFalse(isNameValid(""));
    }

    @Test
    public void whenFullLatValid() {
        //assertThat(isNameValid("first")).isTrue();
        assertTrue(isNameValid("first"));
    }

    @Test
    public void whenFullLatAndSomeUpperCaseLettersValid() {
        //assertThat(isNameValid("fIRST")).isTrue();
        assertTrue(isNameValid("fIRST"));
    }

    @Test
    public void whenLatNumberValid() {
        //assertThat(isNameValid("first1")).isTrue();
        assertTrue(isNameValid("first1"));
    }

    @Test
    public void whenLatWithSpecialSymbolUnderValid() {
        //assertThat(isNameValid("first_user")).isTrue();
        assertTrue(isNameValid("first_user"));
    }

    @Test
    public void whenNumberInValid() {
        //assertThat(isNameValid("123")).isFalse();
        assertFalse(isNameValid("123"));
    }

    @Test
    public void whenFirstLatinUpperCaseIsInvalid() {
        //assertThat(isNameValid("First")).isFalse();
        assertFalse(isNameValid("First"));
    }

    @Test
    public void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        //assertThat(isNameValid("fir$t_u$er_1")).isTrue();
        assertTrue(isNameValid("fir$t_u$er_1"));
    }

}