# APCSA-Mock-Exam2-2026

This repo is a small **AP Computer Science A practice/mock exam repository** containing several short Java programming exercises plus a couple of simple test drivers.

## High-level overview

- **Language:** 100% Java
- **Repo type:** small educational / classroom-style practice repo
- **Structure:** flat repo with all `.java` files in the root

## What’s in it

There are **five main exercise areas**:

1. **`FourDigitInteger`**
   - Models a 4-digit integer.
   - Includes methods to check whether the number is:
     - odd
     - a palindrome
     - a perfect square

2. **`FourDigitIntegerTest`**
   - A lightweight custom test runner for `FourDigitInteger`
   - Uses manual assertions instead of JUnit
   - Prints pass/fail results and throws an `AssertionError` if any test fails

3. **`ArrayUtil`**
   - Contains one utility method to reverse an integer array in place

4. **`Matrix` + `MatrixTest`**
   - `Matrix` wraps a 2D int array and supports:
     - reversing each row
     - reversing the whole matrix
   - `MatrixTest` thoroughly tests those behaviors across several matrix shapes

5. **`Sentence`**
   - Basic string-processing exercise
   - Finds blank-space positions, counts words, and splits a sentence into words

6. **`Cruise`**
   - Small class modeling a cruise with passenger count and price
   - Can:
     - update price
     - inspect a response string for the word `"cruise"`
     - calculate revenue with price adjustments based on passenger count

## Overall purpose

**APCSA FRQ review**, especially practice with:

- classes and instance variables
- constructors and methods
- conditionals
- loops
- arrays and 2D arrays
- strings
- simple algorithmic thinking
- writing basic tests

## Bottom line

This is best understood as a **collection of Java APCSA practice problems**, not a single application. It’s useful for **reviewing core Java concepts and small algorithmic exercises** in a classroom or mock-exam setting.
