<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Management System - JavaFX</title>
</head>
<body>

<h1>Library Management System - JavaFX</h1>

<p>Welcome to the Library Management System! This application is built using JavaFX and is designed to manage the operations of a library, including book inventory management, member registration, and loan tracking. It provides a user-friendly graphical interface to streamline your library's operations.</p>

<h2>Table of Contents</h2>
<ul>
    <li><a href="#features">Features</a></li>
    <li><a href="#technologies-used">Technologies Used</a></li>
    <li><a href="#installation">Installation</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#screenshots">Screenshots</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
</ul>

<h2 id="features">Features</h2>
<ul>
    <li><strong>Book Management:</strong> Add, update, delete, and search for books in the library’s inventory.</li>
    <li><strong>Member Management:</strong> Register new members, update member information, and manage member records.</li>
    <li><strong>Loan Management:</strong> Issue and return books, track due dates, and manage overdue fines.</li>
    <li><strong>User Roles:</strong> Different roles (Admin, Librarian, Member) with specific access rights.</li>
    <li><strong>Reporting:</strong> Generate reports on book inventory, loan history, and member activities.</li>
    <li><strong>Search Functionality:</strong> Powerful search capabilities to find books by title, author, genre, or ISBN.</li>
    <li><strong>User Authentication:</strong> Secure login system for library staff and members.</li>
</ul>

<h2 id="technologies-used">Technologies Used</h2>
<ul>
    <li><strong>Frontend:</strong> JavaFX for the graphical user interface (GUI)</li>
    <li><strong>Backend:</strong> Java</li>
    <li><strong>Database:</strong> MySQL or SQLite (with JDBC for database connectivity)</li>
    <li><strong>Build Tool:</strong> Maven or Gradle</li>
    <li><strong>Version Control:</strong> Git</li>
</ul>

<h2 id="installation">Installation</h2>
<p>To install and run the Library Management System on your local machine, follow these steps:</p>

<ol>
    <li><strong>Clone the repository:</strong>
        <pre><code>git clone https://github.com/your-username/library-management-system-javafx.git</code></pre>
    </li>
    <li><strong>Navigate to the project directory:</strong>
        <pre><code>cd library-management-system-javafx</code></pre>
    </li>
    <li><strong>Configure the database:</strong>
        <p>Ensure MySQL or SQLite is installed on your machine.</p>
        <p>Create a new database for the library system.</p>
        <p>Update the database connection settings in the <code>application.properties</code> or <code>DatabaseConfig.java</code> file.</p>
    </li>
    <li><strong>Build the project:</strong>
        <p>If using Maven:</p>
        <pre><code>mvn clean install</code></pre>
        <p>If using Gradle:</p>
        <pre><code>gradle build</code></pre>
    </li>
    <li><strong>Run the application:</strong>
        <p>If using Maven:</p>
        <pre><code>mvn javafx:run</code></pre>
        <p>If using Gradle:</p>
        <pre><code>gradle run</code></pre>
    </li>
    <li><strong>Access the application:</strong>
        <p>The JavaFX application window will launch, providing access to the Library Management System's features.</p>
    </li>
</ol>

<h2 id="usage">Usage</h2>
<ol>
    <li><strong>Login:</strong> Use your credentials to log in as an Admin, Librarian, or Member.</li>
    <li><strong>Book Management:</strong> Navigate to the Book Management section to add, update, delete, or search for books.</li>
    <li><strong>Member Management:</strong> Register new members, update member details, and manage their records.</li>
    <li><strong>Loan Management:</strong> Issue books to members, track due dates, and manage returns.</li>
    <li><strong>Generate Reports:</strong> Use the reporting tools to generate and export reports on inventory, loans, and members.</li>
</ol>

<h2 id="screenshots">Screenshots</h2>
<p><img src="screenshots/login.png" alt="Login Screen" width="600"><br><em>Login screen for different user roles.</em></p>
<p><img src="screenshots/dashboard.png" alt="Dashboard" width="600"><br><em>Dashboard showing an overview of library activities.</em></p>
<p><img src="screenshots/book-management.png" alt="Book Management" width="600"><br><em>Manage books easily using the GUI.</em></p>

<h2 id="contributing">Contributing</h2>
<p>Contributions are welcome! If you have ideas for improvements or new features, feel free to fork the repository, make changes, and submit a pull request.</p>

<h2 id="license">License</h2>
<p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>

<h2 id="contact">Contact</h2>
<p>If you have any questions, suggestions, or feedback, feel free to reach out:</p>
<ul>
    <li><strong>Author:</strong> Syed Azfar Abbas</li>
    <li><strong>Email:</strong> syedazfar027@gmail.com</li>
    <li><strong>GitHub:</strong> <a href="https://github.com/your-username" target="_blank">syed Azfar Mustafa</a></li>
    <li><strong>LinkedIn:</strong> <a href="https://www.linkedin.com/in/your-profile" target="_blank">syed Azfar Mustafa</a></li>
</ul>

</body>
</html>
