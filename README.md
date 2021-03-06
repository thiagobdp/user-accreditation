# User Accreditation API

## ⚙ Getting Started

Clone this repository in your computer: https://github.com/thiagobdp/user-accreditation

## 💻 Running the project

Start running UserAccreditationApplication.java

In Eclipse IDE right click file UserAccreditationApplication.java -> Run As -> Java Application

## 📄 User Accreditation 

The User Accreditation Rest service receives json data and return success=true and accredited=true/false

## ⭐ Bonus

The API documentation is available with Swagger at URL: http://localhost:8080/swagger-ui.html

A working version of this API is available at the URL below:
* https://thiagobdp-user-accreditation.herokuapp.com/swagger-ui.html

The User Accreditation Informations are saved to H2 Memory Database.

The Rest service receives documents to accreditate an investor. In the first request to a new user_id, the user_id will be saved as accreditated=true with all the documents informed to the service.

In the next requests for an existing user_id, it reverses the previous value of boolean accreditated and updates the database. Also saves the documents to database.

Other Rest Services are available to list Entities "Payload" and "Document".

## 🔬 Running Tests

There are automated tests available for the UserController and all Repositories.

Use Manven Test to run all tests together. In Eclipse IDE, righ click "pom.xml" -> "Run as" -> "Maven test"

Tests will use "test" profile, so it uses a specific DB but also in H2.