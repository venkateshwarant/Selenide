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

