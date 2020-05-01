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
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestLandingPage
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Starting ChromeDriver 81.0.4044.69 (6813546031a4bc83f717a2ef7cd4ac6ec1199132-refs/branch-heads/4044@{#776}) on port 1278
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1588328086.733][WARNING]: FromSockAddr failed on netmask
May 01, 2020 12:14:47 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.733 s - in TestLandingPage
[INFO] Running TestFirstServlet
[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 4.917 s <<< FAILURE! - in TestFirstServlet
[ERROR] testTime(TestFirstServlet)  Time elapsed: 4.881 s  <<< FAILURE!
com.codeborne.selenide.ex.ElementShould: 
Element should have text 'Date=Fri Apr 10 10:30:46 UTC 2020' {#date}
Element: '<h3 id="date">Date=Fri May 01 10:14:48 UTC 2020</h3>'
Screenshot: file:/Users/venkateshwaran/eclipse-workspace/Selenide/product.helloworld.testing.selenide/build/reports/tests/1588328092373.0.png
Page source: file:/Users/venkateshwaran/eclipse-workspace/Selenide/product.helloworld.testing.selenide/build/reports/tests/1588328092373.0.html
Timeout: 4 s.
	at TestFirstServlet.testTime(TestFirstServlet.java:21)

[INFO] Running TestStaticPage
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.039 s - in TestStaticPage
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   TestFirstServlet.testTime:21 Element should have text 'Date=Fri Apr 10 10:30:46 UTC 2020' {#date}
Element: '<h3 id="date">Date=Fri May 01 10:14:48 UTC 2020</h3>'
Screenshot: file:/Users/venkateshwaran/eclipse-workspace/Selenide/product.helloworld.testing.selenide/build/reports/tests/1588328092373.0.png
Page source: file:/Users/venkateshwaran/eclipse-workspace/Selenide/product.helloworld.testing.selenide/build/reports/tests/1588328092373.0.html
Timeout: 4 s.
[INFO] 
[ERROR] Tests run: 4, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.305 s
[INFO] Finished at: 2020-05-01T12:14:53+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.0:test (default-test) on project product.helloworld.testing.selenide: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/venkateshwaran/eclipse-workspace/Selenide/product.helloworld.testing.selenide/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date]-jvmRun[N].dump, [date].dumpstream and [date]-jvmRun[N].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

