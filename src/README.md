# Placement Eligibility Decision Engine

A Core Java project that checks whether a candidate is eligible for a selected job[cite: 14].

## Features
* Runtime candidate input[cite: 14]
* Runtime candidate skills[cite: 14]
* Runtime job input[cite: 14]
* Multiple jobs using arrays[cite: 14]
* Runtime job selection[cite: 14]
* Percentage eligibility[cite: 14]
* Backlog eligibility[cite: 14]
* Graduation year eligibility[cite: 14]
* Skill eligibility[cite: 14]
* Final detailed eligibility result[cite: 14]

## OOP Concepts Used
* Encapsulation[cite: 14]
* Abstraction[cite: 14]
* Inheritance[cite: 14]
* Method Overriding[cite: 14]
* Polymorphism[cite: 14]
* HAS-A Relationship[cite: 14]

## Project Structure
* `Main.java` - controls application flow[cite: 14]
* `Candidate.java` - stores candidate data and skills[cite: 14]
* `Job.java` - stores job requirements and required skills[cite: 14]
* `EligibilityRule.java` - abstract parent for all eligibility rules[cite: 14]
* `PercentageRule.java` - checks percentage[cite: 14]
* `BacklogRule.java` - checks backlogs[cite: 14]
* `GraduationYearRule.java` - checks graduation year[cite: 14]
* `SkillRule.java` - checks required skills[cite: 14]
* `EligibilityChecker.java` - executes all rules[cite: 14]