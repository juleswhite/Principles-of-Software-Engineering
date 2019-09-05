# Clone and Create Your Own Copy of the Provided Git Repository

Clone this Git repository and add your name to the top of the README.md file. After cloning this repository, import the sample-app underneath the code folder into Eclipse. When you are done, submit the contents of your README.md file. 

# Add Dependencies to a Gradle Build

Find the latest version of the Google Guava library and add it to the sample app's build.gradle file. When you are done, save the file and right-click on the project -> Gradle -> Refresh Gradle Project. To check if you did this correctly, try adding an import for one of the Guava collections types to the DemoApplication class and make sure that you do not recieve a compile error. When you are done, submit your build.gradle file as your answer.

# Create a Test with Scaffolding

Modify the URLRepositoryInMemoryTest in the sample app to add code to set up several URLs in a URLRepositoryInMemory object. Create at least one test method that uses the URLRepositoryInMemory object. When you are done, submit your URLRepositoryInMemoryTest.

# Create a White Box Test for the Provided Code

Modify the IDEncodingSystemBase62WhiteBoxTest in the sample app to add at least two test methods that demonstrate white box testing of the IDEncodingSystemBase62. Your test methods should use internal knowledge of the implementation in choosing the values / structure of the tests. Please make sure and add comments explaining what internal knowledge is used to design the tests. When you are done, submit the IDEncodingSystemBase62WhiteBoxTest.

# Create a Black Box Test for the Provided Code

Modify the IDEncodingSystemBase62BlackBoxTest in the sample app to add at least two test methods that test the IDEncodingSystemBase62 using only the information that is available in the IDEncodingSystem interface. When you are done, submit the IDEncodingSystemBase62BlackBoxTest.

# Integrate Performance Metrics Into an Application

Create a JUnit test class in the sample app that implements a performance test of the IDEncodingSystemBase62 to see how well it performs when encoding and decoding a lot of IDs. Submit your JUnit test class as your solution.

# Refactor the Provided Code

First, make sure that you have a variety of good tests of your IDEncodingSystemBase62. Once you have these tests in place, refactor the IDEncodingSystemBase62 in the sample app to make at least one part of it more efficient. For example, you could refactor the class to eliminate the alphabet.indexOf(...) call. Use your performance benchmark your code before and after refactoring. When you are done, submit your refactored IDEncodingSystemBase62.

# Create an Example Class that Motivates the Need for Mocking

Write a short explanation of why test doubles would be used to the URLShortenerController in the sample app. What would be the pros / cons of using test doubles versus just writing a system integration test for this class.

# Create an Integration Test with Mockito for the Provided Application

Create a test for the URLShortenerController in the sample app that uses Mockito to provide mocks for the URLRepository and EncodingSystem. Add at least two test methods that check the behavior of the URLShortenerController and its interaction with the mocks. Submit your JUnit test class as your solution.

# Create a Simple Application that Uses the Java Spring Framework

Use the Spring Initializr (https://start.spring.io/) to create the skeleton for a Spring application that uses Gradle and includes the "Spring Web Starter" dependency. Modify the Spring application to include a "HelloController" that works as follows:

1. Requests to "/hello/ping" respond with the JSON message: 
```
{"msg":"pong"}
```
2. Requests to "/hello/greet?name=<some name>" respond with the JSON message:
```
{"msg":"Welcome <some name>"}
```

# Build an Integration Test for an Enterprise Application

Modify the provided integration test skeleton in the sample app to test the URLShortenerController's functionality. Submit the modified JUnit test class as your solution.
