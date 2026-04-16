# Password Validation Program (Java)

## Overview

This program is used to check if a password is strong or not. It ask the user to enter password and checks some basic rules. If the password is not correct, it will show what is missing.

## Objectives

* To check minimum length of password
* To make sure password has uppercase letter
* To check if number is present
* To give message if password is wrong

## Features

* Program runs in loop until correct password is entered
* Shows reasons why password is not valid
* Uses simple functions for each checking

## Validation Rules

Password should follow below rules:

* Must be at least 8 characters
* Should contain one uppercase letter
* Should contain one number

## Program Structure

* `isLongEnough()` checks password length
* `hasUppercase()` checks uppercase letter
* `hasNumber()` checks digit
* `checkPassword()` prints error messages
* `main()` handles input and loop

## How It Works

First user enter the password. Then program check all conditions. If password is not valid, it print the reason. Again it ask user to enter password. This continues until password become valid.

## Tools Used

* Java
* Scanner for taking input

## Conclusion

This program shows basic use of loops and functions in Java. It also help to understand how to validate user input in simple way.
