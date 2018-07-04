# SampleFramework
This is a simple Google Search project to test the usage of Java, Selenium, Cucumber, Junit,Maven
To run this project:
1. Run command mvn clean test or
2. Open the project in an IDE and Run the test runner file.


Directory Structure:

results – Execution result from cucumber

resources – contains the resources used in this project like drivers

pom.xml – Maven’s pom file that has all the dependencies used in the framework

config.properties – Contains the configurable test data variables used in the project. 


TestRunner.java – Test runner file of cucumber. This specifies the tests to run.

src – Source code

	test/java – all the java implementations

    test/features – contains the cucumber feature files
	
	stepDefinition – Contains the step definitions of all steps in the feature

        GoogleSearchSteps.java – All the step definitions of GoogleSearch feature specified in GoogleSearch.feature.
		
	pageFactory – PageFactory that contains all the pages

        BasePage.java – Super class of all Page classes and has the driver instance and all webdriver extensions

        GoogleSearchPage.java – All the elements of Google Search Page and methods that use these elements
    
    config/LoadConfiguration.java – Methods to read the configurations from config.properties

    base/BaseDriver.java - Contains the functions for web driver creation, quit.


