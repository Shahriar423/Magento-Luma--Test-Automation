# Magento(Luma) Test Automation using Selenium with TestNG
This repository contains automated tests for the Magento e-commerce website (https://magento.softwaretestingboard.com/). The project uses Java, Selenium WebDriver, and TestNG to automate key user flows, including product search, user registration, adding products to the cart, and completing the checkout process.
# Project Overview
The goal of this project is to provide a robust, maintainable testing framework for validating the functionality of the Magento website. It serves as a foundation for end-to-end (E2E) testing and can be extended to include additional test scenarios or integrated with CI/CD pipelines.

## Features
- Search Functionality: Tests valid and invalid product search queries.

- User Registration: Validates successful and failed sign-up attempts.

- Login Functionality: Tests valid and invalid login attempts.

- Add to Cart: Verifies adding products to the cart with options (e.g., size, color).

- Checkout Process: Automates guest checkout with shipping details and order confirmation.

- Error Handling: Includes assertions for success messages and error states.

- Modular Design: Uses the Page Object Model (POM) for maintainability and scalability.

## Prerequisites

- Java: JDK 17 or higher.

- Maven: For dependency management.

- Selenium WebDriver: Version 4.30.0 or compatible.

- TestNG: Version 7.10.2 or later.

- WebDriver: Firefox (geckodriver) or Chrome (chromedriver) compatible with the installed browser version.

- IDE: IntelliJ IDEA (recommended) or any Java IDE.

- Internet Connection: Required to access the Magento website.

# Test Cases

## SearchTest

- ValidSearch: Searches for "Jacket" and verifies products are found.
  
- InvalidSearch: Searches for a non-existent product (e.g., "dddddddfcnkrjgweio11") and checks for a "no results" message.

## LoginTest

- ValidLogin: Logs in with valid credentials and verifies the welcome message.

- InvalidLogin: Attempts login with invalid credentials and checks for an error message.

## SignUpTest

- SuccessfulSignUp: Registers a new user with unique email and verifies success.

- FailedSignUpWithExistingEmail: Attempts to register with an existing email and checks for an error.

## CartAndCheckoutTest

- AddToCart: Searches for "Jacket", adds it to the cart, and verifies it’s in the cart.
- 
- Checkout: Adds a product to the cart, proceeds to guest checkout, and verifies order confirmation.

## Known Issues

- ElementClickInterceptedException: Occurs if the "Add to Cart" button is obscured (e.g., by <div class="actions">). Fixed in ProductPage using WebDriverWait and JavaScript click fallback.

- Tests include assertions and error handling.

