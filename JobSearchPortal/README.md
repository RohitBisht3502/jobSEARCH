# <h1 align = "center"> Job Search Portal API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The Restaurant Management Application is a Spring Boot-based web application designed to help manage restaurant information. It allows users to perform various operations related to restaurant management, including adding new restaurants, updating specialties, and deleting restaurants from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Get All JOBS:** `GET /restaurants`
   
   This endpoint retrieves a list of all registered restaurants.

   ```java
   @GetMapping("jobs")
   public List<jobs> getJobs() {
       
   }
   ```

2. **Get JOBS by ID:** `GET /jobs/{id}`

   This endpoint retrieves detailed information about a specific jobs by its ID.

   ```java
   @GetMapping("jobs/{id}")
   public Restaurant getJobs(@PathVariable Integer id) {
      
   }
   ```

3. **Add JOBS:** `POST /restaurant`

   This endpoint adds a new restaurant to the system.

   ```java
   @PostMapping("jobs")
   public String addRestaurant(@Valid @RequestBody Job job) {
    
   }
   ```

4. **Add JOBS:** `POST /jobs`

   This endpoint adds multiple restaurants to the system.

   ```java
   @PostMapping("jobs")
   public String addRestaurants(@Valid @RequestBody List<job> jobs) {
       
   }
   ```

5. **Update JOBS pecialty:** `PUT /jobs/id/{id}/specialty/{specialty}`

   This endpoint updates the specialty of a restaurant by its ID.

   ```java
   @PutMapping("jobs/id/{id}/specialty/{updatedSpeciality}")
   public String updateSpecialty(@PathVariable Integer id, @RequestParam String updadteSpecial) {
       
   }
   ```

6. **Delete Job:** `DELETE /jobs/{id}`

   This endpoint deletes a restaurant by its ID.

   ```java
   @DeleteMapping("jobs/{id}")
   public String deleteJobs(@PathVariable Integer id) {
       
   }
   ```

### Services

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for restaurant management, with fields such as:

urant` objects in various parts of the application. `MySQL` provides dynamic sizing and efficient element retrieval, making it suitable for storing jobs

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [ROHIT SINGH BISHT](rohitbisht3502.com)



