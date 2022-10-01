# Selenium-Cucumber-Maven-Framework-TestNG

This BDD Maven automation framework is developed with Cucumber, Selenium and TestNG.

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
