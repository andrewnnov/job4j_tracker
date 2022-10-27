package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.JavaNameValidator.isNameValid;

public class JavaNameValidatorTest {

    @Test
    public void whenEmptyNameInvalid() {
        assertFalse(isNameValid(""));
    }

    @Test
    public void whenFullLatValid() {
        assertTrue(isNameValid("first"));
    }

    @Test
    public void whenFullLatAndSomeUpperCaseLettersValid() {
        assertTrue(isNameValid("fIRST"));
    }

    @Test
    public void whenLatNumberValid() {
        assertTrue(isNameValid("first1"));
    }

    @Test
    public void whenLatWithSpecialSymbolUnderValid() {
        assertTrue(isNameValid("first_user"));
    }

    @Test
    public void whenNumberInValid() {
        assertFalse(isNameValid("123"));
    }

    @Test
    public void whenFirstLatinUpperCaseIsInvalid() {
        assertFalse(isNameValid("First"));
    }

    @Test
    public void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertTrue(isNameValid("fir$t_u$er_1"));
    }

}