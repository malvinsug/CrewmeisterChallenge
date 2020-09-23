# CrewmeisterChallenge
This is the coding challenge from Crewmeister.

[![Build Status](https://travis-ci.org/malvinsug/CrewmeisterChallenge.svg?branch=master)](https://travis-ci.org/malvinsug/CrewmeisterChallenge)

## Depedencies
Inside this project, we will be using OpenJDK 11.

## Task
The challenge is to configure and implement a process for evaluating coding challenges delivered by candidates using 
unit tests and as a bonus task also apply static analysis. The result should then be reported in a google spreadsheet. 
The coding Challenge is to implement a method in a class called 'CrewmeisterChallenge', which is called 
'crewmeisterRevertString'. The method only takes one String parameter and returns a String, which is the input string in 
reverse order. The candidate will create a branch from a template maven project in the master and commit the code to 
that branch. Once the candidate is ready, he creates a pull request. The pull request should then automatically trigger 
the execution of the tests and update the google spreadsheet with the result. 
