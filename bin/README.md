[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
# Gradle Quality Gates Demonstration

This project is built to demonstrate how to enable quality gates when you are using Gradle as your build too for your java project 

#### Below are the Quality gates that are in place 

* CPD 
* PMD
* SPOTBUGS 
* CHECKSTYLE 
* PITEST for MUTATION TESTING

#### To practice

We do have some small Java code with 100% coverage and 100% mutation coverage you can add to it and learn to 
acknowledge reactions from these quality gates. 

#### To On-board

* Copy the folder quality-gates in your gradle project
* Add the line below after group and version declaration in your parent gradle file
    
    `apply from: "${rootDir}/quality-gates/quality-gates.gradle"` 

* You also have to change the `targetClasses` property of PITEST task in quality-gates.gradle file to your class and package name
* BINGO !!!!!!
    
