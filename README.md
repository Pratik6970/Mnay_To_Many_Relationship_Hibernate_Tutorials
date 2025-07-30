📘 Many-to-Many Relationship Example using Hibernate (Java + MySQL)
This project demonstrates how to implement a Many-to-Many relationship in Java using Hibernate ORM and MySQL as the database.

🔍 Overview
This is a basic Hibernate project to show the Many-to-Many relationship between Student and Course entities.

Each student can enroll in multiple courses, and each course can have multiple students.

The association is implemented using JPA annotations and is persisted in a join table (std_cou_456) in the MySQL database.

🏗️ Technologies Used
Java

Hibernate (JPA annotations)

MySQL

Maven (optional)

JDK 8+

🧱 Entity Relationship
🔸 Student Entity
Table: stds_456

Fields: id, name

Has a @ManyToMany relationship with Course

Mapped through the std_cou_456 join table

🔸 Course Entity
Table: Cou_45

Fields: courseId, courseName

Inverse side of the @ManyToMany mapping (using mappedBy)

🔸 Join Table
Name: std_cou_456

Columns: st_id (Student ID), ct_id (Course ID)

Automatically managed by Hibernate

⚙️ What This Project Demonstrates
How to create and configure Hibernate using hibernate.cfg.xml

Defining entity classes with @Entity, @Table, @Id, and @ManyToMany

Establishing bidirectional many-to-many mapping

Persisting objects and their relationships in the database

Automatic creation and population of a join table in MySQL
