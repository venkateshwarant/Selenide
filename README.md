# Selenide Tutorial

Getting started with Selenide testing framework

## General overview

This tutorial shows how to run user acceptance tests against our web based [hello world application](https://github.com/acapozucca/helloworld) using Selenide. 

The test cases in this tutorial will be similar to our test cases in [Cucumber Tutorial](https://github.com/venkateshwarant/Cucumber_Tutorial) and [TestNG Tutorial](https://github.com/acapozucca/TestNG).

**NOTE**:
To run these tests, it is required to setup our product beforehand, if not done yet please follow the above link to get it configured.
### Software

1. The Web-based Hello World case study
* Instructions to install here: https://github.com/acapozucca/helloworld/blob/master/product.helloworld/README.md
* You need to complete (at least) until the step 3 (included) of the section 
"Check local testing environment setup", and
(at least) until step 3 (included) of the section
"Run the application"

2. **Maven** (v 3.6.2, or higher)
* Instructions to install here: https://maven.apache.org/download.cgi
* Check installation with the command `mvn --version`

3. **Git** (version 2.21.1)
* Instructions to install here: https://help.ubuntu.com/lts/serverguide/git.html
* Check installation with the command `git --version`

4. **Selenide** (version 5.11.1)
* Instructions to install here: https://selenide.org/quick-start.html
* maven dependency to add selenide to our project is
```
<dependency>
    <groupId>com.codeborne</groupId>
    <artifactId>selenide</artifactId>
    <version>5.11.1</version>
    <scope>test</scope>
</dependency>
```
6. **Eclipse IDE**
* You can use any IDE, but here we use Eclipse as it is opensource.

## Opening a URL
* Unlike selenium, in selenide we need not configure the webdriver path. Its just enough to add the dependency and it takes care of all the selenium default configurations.

* To open a URL, we need to run the below code
```
open(url)
```

and ofcourse we need to import 
```
import static com.codeborne.selenide.Selenide.*;
```

## Running test cases
* To run the test case, just right click inside class and run as JUnit test case.

## Running test cases using maven
* To run test cases using maven, run the follwing command
```
mvn clean test
```

You will see the outputs similar to the below, which reflects whether the tests are running or not.
```
[INFO] 
[ERROR] Tests run: 4, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.305 s
[INFO] Finished at: 2020-05-01T12:14:53+02:00
[INFO] ------------------------------------------------------------------------
```

Here note that the build fails because we have a failing test method- testTime in TestFirstServlet, if you comment this method and run the test case, you can see that the build succeeds.

Additionally, selenide automatically takes the screenshot of the browser page when the test case fails and attaches inside the report.

## Selenide report
* selenide automatically packs the test reports and screenshots in the folder /build/reports/tests/

## Final remarks
These guidelines explain how to use Selenide:

* How to write basic selenide UAT
* How to run selenide tests in IDE and maven

