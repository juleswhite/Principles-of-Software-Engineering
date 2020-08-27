# Clone and Create Your Own Copy of the Provided Git Repository

Clone this Git repository and add your name to the top of either this or the root README.md file in the repository (either one is fine). After cloning this repository, import the sample-app underneath the code folder into Eclipse or IntelliJ. When you are done, submit the contents of your README.md file. 

# Add Dependencies to a Gradle Build

Find the latest version of the Google Guava library and add it to the sample app's build.gradle file. (if using Eclipse) When you are done, save the file and right-click on the project -> Gradle -> Refresh Gradle Project. (if using IntelliJ) When you are done, save the file and Build->Build Project. To check if you did this correctly, try adding an import for one of the Guava collections types to the DemoApplication class and make sure that you do not recieve a compile error. When you are done, submit your build.gradle file as your answer.

# Create a Test with Scaffolding

Create a simple unit test for your GeoHash implementation. You can use the sample code in the bottom of its main method if you need inspiration for tests. Submit your test.

# White Box Test for the Provided Code

How would you apply white box testing to your GeoDB implementation?

# Create a Black Box Test for the Provided Code

How would you apply black box testing to your GeoDB implementation?

# Integrate Performance Metrics Into an Application

How would you test the performance of your GeoDB implementation? What do you think would be the top performance bottleneck?

# Refactor the Provided Code

Knowing what you know now about the assignment requirements, how would you refactor your code to improve it? 

# Create an Example Class that Motivates the Need for Mocking

Write a short explanation of where and why you would use test doubles in your assignment implementation.

# Create an Integration Test with Mockito for the Provided Application

How would you write an integration test for the assignment code up to this point? Where would you use mocking and why? 

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
  
Turn in your controller. 

# Build an Integration Test for an Enterprise Application

How would you use Spring in your application up to this point? How would you create an integration test for your application using Spring?
