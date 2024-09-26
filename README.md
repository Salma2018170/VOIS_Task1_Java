# Amazon Automation with Selenium and Java

This repository contains automated test cases for Amazon's website using Selenium and Java. The tests cover searching for products, adding them to the cart, and verifying the cart.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Running the Tests](#running-the-tests)
- [File Descriptions](#file-descriptions)

## Project Overview
This project automates the following scenarios on Amazon:
1. **Scenario 1**: Search for "car accessories", select the first item, add it to the cart, and verify that it appears in the cart.
2. **Scenario 2**: Apply filters for "Headphones" and "Grocery", select a discount, navigate to the fourth page, choose an item, add it to the cart, and verify its presence in the cart.

The tests are designed to run with a browser resolution of 1024x768 pixels and utilize best practice coding standards for maintainability.

## Features
- **Search and Add to Cart**: Automates the process of searching for items and adding them to the cart.
- **Filter and Discount Application**: Handles filtering and applying discounts on items.
- **Page Navigation**: Navigates through pages and selects items.

## Technologies Used
- **Java**: Programming language used for writing test scripts.
- **Selenium WebDriver**: Tool for automating web application testing.
- **TestNG**: Framework for managing and running tests.

## Installation
To run these tests locally, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    cd your-repo-name
    ```

2. **Install dependencies using Maven:**
    ```bash
    mvn install
    ```

3. **Download and set up ChromeDriver:**
    - Download from [ChromeDriver website](https://sites.google.com/a/chromium.org/chromedriver/).
    - Set the path to `chromedriver` in the `System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");` line in the code.

## Usage
1. **Open the project in your preferred IDE** (e.g., IntelliJ IDEA, Eclipse).
2. **Ensure that `chromedriver` is correctly configured** in the project.
3. **Run the test cases** using TestNG.

## Running the Tests
To run the tests:

1. **Via Command Line:**
    ```bash
    mvn test
    ```

2. **Via IDE:**
    - Right-click on the test class `AmazonAutomation` and select **Run 'AmazonAutomation'**.

## File Descriptions
- **AmazonAutomation.java**: Contains the test scenarios for automating tasks on Amazon.
- **pom.xml**: Maven configuration file for managing project dependencies. Below is the content of the `pom.xml` file used in this project:

    ```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/POM/4.0.0">
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.example</groupId>
        <artifactId>amazon-automation</artifactId>
        <version>1.0-SNAPSHOT</version>
        <dependencies>
            <!-- Selenium WebDriver -->
            <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                <artifactId>selenium-java</artifactId>
                <version>4.25.0</version>
            </dependency>
            
            <!-- TestNG -->
            <dependency>
                <groupId>org.testng</groupId>
                <artifactId>testng</artifactId>
                <version>7.10.2</version>
                <scope>test</scope>
            </dependency>
        </dependencies>
    </project>
    ```

- **POM Package**: Under the `main/java` directory, you will find the Page Object Model (POM) package used to manage the web pages. This design pattern helps in creating an abstraction layer for interacting with the web pages.
- **Test Scenarios**: Under the `test/java` directory, you will find the test scenarios that utilize the POM classes to perform automated testing.

