# Selenium-Cucumber-Maven-Framework-TestNG

This BDD Maven automation framework is developed with Cucumber, Selenium and TestNG.



Following concepts are implemntated in this framework including jenkins build run of the git hus hosted repo.
•	Build Maven Project with all the framework dependencies
•	Develop End to end Selenium Web Scenarios in the feature file
•	Implement TestNG Runner to run the framework
•	Understand the Single responsibility principle to distribute the implementation into multiple Step definitions.
•	Importance of Dependency injection to share the data between the Steps file
•	Understand the Page object Pattern to drive the locators from page files
•	Implement Factory Design pattern by writing PageObjectManager class to create objects of all PO classes
•	How driver can be configured and distributed across the files in the framework
•	How to run Cucumber Scenarios in Parallel Mode using Cucumber TestNG Runner
•	Build Test utilities for reusable Selenium methods
•	Implement Cucumber Hooks to capture Screenshots on test failures
•	Implement Cucumber Tags to run selected tests in the framework
•	Parameterizing the test data to run the Scenarios with multiple data sets
•	Creating HTML & Extent reports to run Cucumber Selenium tests
•	Running tests in parallel mode and generate Extent reports with screenshots attached for failed Scenarios
•	Run the cucumber tests using Maven & Command line options
•	Integrate the Framework to CI/CD Jenkins and Schedule the Jobs on regular time Interval
•	Create Parameterized Jenkin job to dynamically send the global properties at run time of Job execution



Commands used for test execution of this project via commandline

Refer : https://cucumber.io/docs/cucumber/api/?lang=java#options

mvn test
mvn test -Dcucumber.filter.tags="@PlaceOrder"
mvn test -Dcucumber.filter.tags="@PlaceOrder" -Dbrowser="edge"
mvn test -Dcucumber.features="\Users\User\Desktop\Git Main Repo\BDD\src\test\java\features\Checkout.feature"



Commands used for test execution of this project via jenkins

test
test -Dcucumber.filter.tags="@PlaceOrder"
test -Dcucumber.filter.tags="@PlaceOrder" -Dbrowser="edge"
test -Dcucumber.features="\Users\User\Desktop\Git Main Repo\BDD\src\test\java\features\Checkout.feature"
