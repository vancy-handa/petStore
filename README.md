# petStore

This repository contains test for PetStore server to find number of pets with status available and name doggie

For reporting, Allure Reports are used.

# To install Allure,
run-  brew install allure

# In order to run the tests- 
run- mvn clean install 

then run-  mvn clean test

# To see a report
run-   allure serve target/allure-results/

It will automatically open http://localhost:{port}/index.html in your browser
