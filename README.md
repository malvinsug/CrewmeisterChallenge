# CrewmeisterChallenge
This is the coding challenge from Crewmeister.

[![Build Status](https://travis-ci.org/malvinsug/CrewmeisterChallenge.svg?branch=master)](https://travis-ci.org/malvinsug/CrewmeisterChallenge)

## Depedencies

### Java version
Inside this project, we will be using OpenJDK 11. See https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
to install Java SE Development Kit 11.

### Sonarqube
Once the code is being pushed, we will run static analysis using Sonarqube. It is recommended for the candidates to
install Sonarqube, so that they can run static analysis locally before it is being pushed. The installation guide 
can be found at https://www.sonarqube.org/.

### Nice to know
We will use JUnit4 as a test tool and use Travis-CI as continuous integration service for this coding challenge.

## Task 
The coding Challenge is to implement a method in a class called 'CrewmeisterChallenge', which is called 
'crewmeisterRevertString'. The method only takes one String parameter and returns a String, which is the input string in 
reverse order. The candidate will create a branch from a template maven project in the master and commit the code to 
that branch. Once the candidate is ready, he creates a pull request. The pull request should then automatically trigger 
the execution of the tests and it will give the candidates a report, either it's successful or not (see the badge in
README.md file). 
