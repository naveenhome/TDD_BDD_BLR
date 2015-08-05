#encoding: utf-8
Feature: Calculator functions
 In order to get sum or product of the two numbers immediately without having to do it manually
  As an accountant
  I should be able to use Add/Multiply function to add/multiple two numbers

@P1 @FVT
Scenario Outline: Calculator functions
  Given the inputs <input1> and <input2>
  When I select the <operation> as option
  Then the Result field should be <Result>
Examples: 
|input1	|input2	|operation	|Result	|
|"7"	|"8"	|"Add"	|"15"	|
|"4.6"	|"5.7"	|"Add"	|"Please enter integers only"	|
|"abd"	|"%^&"	|"Add"	|"Please enter integers only"	|
|"7"	|"1000"	|"Add"	|"1007"	|
