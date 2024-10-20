# Welcome to my Event Management Application repository: Eventia

## Event Manager App

A Jakarta EE-based web application to create, manage, and join events. Features include user roles, dynamic content with AJAX, and database interaction via JDBC. Designed for seamless event management, this app showcases practical use of JSP, Servlets, and MVC architecture.

## Project Overview

The Event Manager App, named **Eventia**, is designed to provide users with an intuitive platform for creating, managing, and joining events. The application is built using the Jakarta EE framework and integrates several core Java technologies to deliver a comprehensive event management experience. Users can benefit from a role-based access model, rich user interactions through AJAX, and efficient data handling with JDBC.

## Key Features

- **User Authentication and Role Management**: Users can register, log in, and log out of the application. Roles include regular users and administrators. Regular users can view and register for events, while administrators can create, modify, and delete events and manage users.

- **Event Management**: Create, update, and delete events. Users can filter events by criteria such as date, location, and keywords. Registered users can also view all events they are enrolled in.

- **Administrative Panel**: Administrators can manage all events and users, including promoting or demoting user roles and handling event listings.

- **Dynamic UI Updates with AJAX**: AJAX is used to make dynamic updates, such as joining an event or filtering events, without requiring a full page reload.

- **Efficient Data Management with JDBC**: The app connects to a MySQL database using JDBC, ensuring seamless data retrieval, updates, and storage for all user interactions and event details.

## Application Architecture

The Eventia application follows a **Model-View-Controller (MVC)** architecture to ensure a clean separation of concerns and maintainability:

- **Model**: The model layer consists of the database schema and Java classes that represent entities such as Users, Events, and Registrations. These classes manage the data and provide an interface to interact with the database.

- **View**: The view is implemented using JSP (JavaServer Pages), which helps render dynamic content on the user interface. JSTL (JavaServer Pages Standard Tag Library) is used to simplify the display of data and control flow logic in the JSP files.

- **Controller**: The controller logic is handled by Servlets, which receive HTTP requests, process them, and forward the results to the appropriate JSP views. The servlets handle key functions such as user registration, login, event creation, and enrollment.

## Technologies Used

- **Jakarta EE**: Provides the foundation for enterprise-level Java development, including dependency injection, web socket management, and other core features.
- **JSP (JavaServer Pages)**: Used for rendering dynamic web pages and interacting with backend data.
- **Servlets**: Handle the request-response lifecycle and implement business logic for the application.
- **JDBC (Java Database Connectivity)**: Manages interactions with the MySQL database, handling queries, updates, and data storage.
- **AJAX**: Enhances user experience by allowing asynchronous data requests and updates, ensuring a smooth and responsive interface.
- **MySQL**: The relational database that stores user data, events, and registration details.

## Database Schema

The application relies on a MySQL database consisting of three primary tables:

- **Users Table**: Stores user details such as ID, username, email, password, and role (user or admin).
- **Events Table**: Stores information related to events, including event title, description, date, location, and creator ID.
- **Registrations Table**: Manages the many-to-many relationship between users and events.

## Getting Started

### Clone the Repository:

```bash
git clone <repository-url>
```

### Set Up the Database:

- Create a MySQL database named `eventdb`.
- Run the provided SQL scripts to create the necessary tables (users, events, registrations).

### Configure the Project:

- Update the database credentials in the JDBC connection strings in the servlets.
- Import the project into IntelliJ IDEA or your preferred IDE.

### Run the Application:

- Deploy the application on a servlet container such as Apache Tomcat.
- Access the application at `http://localhost:8080/eventia`.

## Future Improvements

- **Email Notifications**: Implement automated email notifications for event reminders and registration confirmations.
- **Real-Time Updates**: Integrate WebSockets for real-time event updates.
- **Enhanced Security**: Improve user authentication and password hashing with modern security algorithms.

## Contributing

Contributions are welcome! Feel free to submit pull requests for bug fixes or new features. Please ensure your code follows the existing coding style and includes appropriate comments.

## License

This project is open-source and available under the CC0-1.0 license.

---

Thank you for checking out **Eventia**! If you have any questions or suggestions, feel free to open an issue or contact me directly.
