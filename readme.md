# Electric Bill Generator

A simple web application built using **Spring Boot** that allows users to generate their electric bills based on the units of electricity consumed. The application uses **JSP** for views, **MySQL** for database management, and **Bootstrap** for a responsive user interface design.

## Features

- **Bill Generation**: Allows users to input the number of units consumed and generates a bill based on a fixed rate.
- **User Management**: Stores user details such as name, email, and password (expandable for authentication and role-based access).
- **Data Persistence**: Bills and user data are saved in a **MySQL** database.
- **Responsive Design**: The user interface is designed to be responsive and works across different screen sizes using **Bootstrap**.

## Technologies Used

- **Spring Boot**: Framework for building the backend and REST APIs.
- **JSP (JavaServer Pages)**: Used for creating dynamic web pages.
- **Servlets**: For managing HTTP requests and responses.
- **MySQL**: Relational database to store user and bill data.
- **Bootstrap**: Frontend framework for responsive design.
- **Maven**: Project management and build automation tool.

## Prerequisites

Before running this project, make sure you have the following installed:

- **Java 11 or later** (for Spring Boot)
- **MySQL** (for the database)
- **Maven** (for dependency management)
- An **IDE** such as IntelliJ IDEA or Eclipse (for building and running the application)

## Setup Instructions

### 1. Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/electric-bill-generator.git
