About this repository
==================
This repository contains suggested solution to the code challenge problem 2 for the API testing framework

What do I need to run these samples?
---
A Java JDK and Maven. That's it.

What API is used for the samples?
---
The weather API shared in the challenge

[Weatherbit-API](https://www.weatherbit.io/api/weather-forecast-16-day). 

Repository Brief
===============

For the purpose of solving this problem, I took the liberty of using Maven task runner as my choice of runner although I haven't quite configured it the way I need to, due to my inexperience. 

A brief breakdown of all the files contained in the solution is as follows: 
---------------------------------------------------------------------------
Config - This package contains basic configuration manager to use in the solution for passing constants and other configs needed by the tests.

Models - Models contain the Model classes or POJOs to de-serailize the JSON response in my tests.

Utils - Contains classes for keeping things like TestParams and reusable methods in a place.

Base - It builds the rest assured request and response specifications

Requests - Keeps http requests made to the server together to fetch responses for the tests.

test.properties - Keeps constants and properties like uris together.


Reporting
==========
Done using allure reporter. 


To Run Solution
===============
1) mvn install
2) mvn clean test allure:report


Report generated under target/site/index.html
