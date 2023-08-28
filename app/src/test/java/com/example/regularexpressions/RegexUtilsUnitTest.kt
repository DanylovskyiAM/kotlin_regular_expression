package com.example.regularexpressions

import org.junit.Assert
import org.junit.Test

class RegexUtilsUnitTest {

    @Test
    fun tooShortInput() {
        Assert.assertFalse("Too short input", RegexUtils.checkWithRegex("", 5))
    }

    @Test
    fun tooLongInput() {
        Assert.assertFalse("Too long input", RegexUtils.checkWithRegex("aA1@bB2!", 5))
    }

    @Test
    fun matchingInputLength() {
        Assert.assertTrue("Matching input length", RegexUtils.checkWithRegex("aA1@bB2!", 8))
    }

    @Test
    fun missingUppercase() {
        Assert.assertFalse("Missing uppercase", RegexUtils.checkWithRegex("a1@b2!", 8))
    }

    @Test
    fun missingLowercase() {
        Assert.assertFalse("Missing lowercase", RegexUtils.checkWithRegex("A1@B2!", 8))
    }

    @Test
    fun missingSpecialCharacter() {
        Assert.assertFalse("Missing special character", RegexUtils.checkWithRegex("aA1bB2", 8))
    }

    @Test
    fun missingDigit() {
        Assert.assertFalse("Missing digit", RegexUtils.checkWithRegex("aA!bB@", 8))
    }

    @Test
    fun excessWhitespaceCharactersV1() {
        Assert.assertFalse("Excess whitespace characters", RegexUtils.checkWithRegex("aA! bB@\t", 8))
    }

    @Test
    fun excessWhitespaceCharactersV2() {
        Assert.assertFalse("Excess whitespace characters", RegexUtils.checkWithRegex("\naA!bB@", 8))
    }

}