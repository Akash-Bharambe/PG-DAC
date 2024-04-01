# Database Management System

## What is Data?

- Data is a collection of a distinct small unit of information. It can be used in a variety of forms like text, numbers, media, bytes, etc. it can be stored in pieces of paper or electronic memory, etc.
- Word **'Data'** is originated from the word **'datum'** that means **'single piece of information.'** It is plural of the word datum.
- In computing, Data is information that can be translated into a form for efficient movement and processing. Data is interchangeable.

![Screenshot 2024-03-21 161149](https://i.imgur.com/gsiFBMI.png)

## What is Database?

- A database is an organized collection of data, so that it can be easily accessed and managed.
- You can organize data into tables, rows, columns, and index it to make it easier to find relevant information.
- Database handlers create a database in such a way that only one set of software program provides access of data to all the users.
- The main purpose of the database is to operate a large amount of information by storing, retrieving, and managing data.

## What is Database Management System?

- A **Database management system (DBMS)** is system software for creating and managing databases.
- A DBMS makes it possible for end users to create, protect, read, update and delete data in a database.
- The most prevalent type of data management platform, the DBMS essentially serves as an interface between databases and users or application programs, ensuring that data is consistently organized and remains easily accessible.

## What DBMS do?

- The DBMS manages the data; the database engine allows data to be accessed, locked and modified; and the database schema defines the database's logical structure.
- These three foundational elements help provide concurrency,security, data integrity and uniform data administration procedures.
- The DBMS supports many typical database administration tasks, including **change management, performance monitoring and tuning, security, and backup and recovery.**
- Most database management systems are also responsible for automated rollbacks and restarts as well as logging and auditing of activity in databases and the applications that access them.
- The DBMS provides a **centralized view of data** that can be accessed by **multiple users from multiple locations** in a controlled manner.
- A DBMS can limit what data end users see and how they view the data, providing many views of a single database schema.
- End users and software programs are free from having to understand where the data is physically located or on what type of storage medium it resides because the DBMS handles all requests.
- The DBMS can offer both logical and physical data independence to protect users and applications from having to know where data is stored or from being concerned about changes to the physical structure of data.
- So long as programs use the application programming interface (API) for the database that the DBMS provides, developers won't have to modify programs just because changes have been made to the database.

### Storage Engine

- This basic element of a DBMS is **used to store data.** The DBMS must interface with a file system at the operating system (OS) level to store data.
- It can use additional components to store data or interface with the actual data at the file system level.

### Metadata Catlog

- Sometimes called a **system catalog or database dictionary**, a metadata catalog functions as a repository for all the database objects that have been created.
- When databases and other objects are created, the DBMS automatically registers information about them in the metadata catalog.
- The DBMS uses this catalog to verify user requests for data, and users can query the catalog for information about the database structures that exist in the DBMS.
- The metadata catalog can include information about database objects, schemas, programs, security, performance, communication and other environmental details about the databases it manages.

### Database access language

• The DBMS also must provide an API to access the data, typically in the form of a database access language to access and modify data but may also be used to create database objects and secure and authorize access to the data.
• **SQL is an example of a database access language** and encompasses several sets of commands, including **Data Control Language** for authorizing data access, **Data Definition Language** for defining database structures and **Data Manipulation Language** for reading and modifying data.

## DBMS Components

- A DBMS is a sophisticated piece of system software consisting of multiple integrated components that deliver a consistent, managed environment for creating, accessing and modifying data in databases

![Screenshot 2024-03-21 160941](https://i.imgur.com/dUZlOTI.png)

#### Optimization engine

- A DBMS may also provide an optimization engine, which is used to **parse database access language requests** and turn them into actionable commands for accessing and modifying data.

#### Query processor

- After a query is optimized, the DBMS must provide a means for **running the query** and returning the results.

#### Lock manager

- This crucial component of the DBMS **manages concurrent access to the same data.** Locks are required to ensure multiple users aren't trying to modify the same data simultaneously.

#### Log manager

- The DBMS records all changes made to data managed by the DBMS. The **record of changes is known as the log,** and the log manager component of the DBMS is used to **ensure that log records are made efficiently and accurately.**
- The DBMS uses the log manager during shutdown and startup to ensure data integrity, and it interfaces with database utilities to create backups and run recoveries.

#### Data utilities

- A DBMS also provides a set of utilities for managing and controlling database activities.
- Examples of database utilities include reorganization, runstats, backup and copy, recover, integrity check, load data, unload data and repair database.

## DBMS Features

- It uses a digital repository established on a server to store and manage the information.
- It can provide a clear and logical view of the process that manipulates data.
- DBMS contains automatic backup and recovery procedures.
- It contains **ACID** properties which maintain data in a healthy state in case of failure.
- It can reduce the complex relationship between data.
- It is used to support manipulation and processing of data.
- It is used to provide security of data.
- It can view the database from different viewpoints according to the requirements of the user.

![ACID-Properties](https://i.imgur.com/ZRfJJIx.jpeg)

## DBMS Advantanges

- **Controls database redundancy:** It can control data redundancy because it stores all the data in one single database file and that recorded data is placed in the database.
- **Data sharing:** In DBMS, the authorized users of an organization can share the data among multiple users.
- **Easily Maintenance:** It can be easily maintainable due to the centralized nature of the database system.
- **Reduce time:** It reduces development time and maintenance need.
- **Backup:** It provides backup and recovery subsystems which create automatic backup of data from hardware and software failures and restores the data if required.
- **Multiple user interface:** It provides different types of user interfaces like graphical user interfaces, application program interfaces.

## DBMS Disadvantanges

- **Cost of Hardware and Software:** It requires a high speed of data processor and large memory size to run DBMS software.
- **Size:** It occupies a large space of disks and large memory to run them efficiently.
- **Complexity:** Database system creates additional complexity and requirements.
- **Higher impact of failure:** Failure is highly impacted the database because in most of the organization, all the data stored in a single database and if the database is damaged due to electric failure or database corruption then the data may be lost forever.

## DBMS Terminologies

- **Database:** A database is a collection of tables, with related data.
- **Table:** A table is a matrix with data. A table in a database looks like a simple spreadsheet.
- **Column:** One column (data element) contains data of one and the same kind, for example the column postcode.
- **Row:** A row **(= tuple, entry or record)** is a group of related data, for example the data of one subscription.
- **Redundancy:** Storing data twice, redundantly to make the system faster.

- **Primary Key:** A primary key is unique. A key value can not occur twice in one table. With a key, you can only find one row.
- **Foreign Key:** A foreign key is the linking pin between two tables.
- **Compound Key:** A compound key (composite key) is a key that consists of multiple columns, because one column is not sufficiently unique.
- **Index:** An index in a database resembles an index at the back of a book.
- **Referential Integrity:** Referential Integrity makes sure that a foreign key value always points to an existing row.

## Types of Databases

![types-of-databases](https://i.imgur.com/QRO3hpN.png)

### Centralized Database

- It is the type of database that **stores data at a centralized database system.**
- It comforts the users to **access the stored data from different locations** through several applications.
- These applications contain the authentication process to let users access data securely.
- An example of a Centralized database can be Central Library that carries a central database of each library in a college/university.

### Distributed Database

- Unlike a centralized database system, in distributed systems, **data is distributed among different database** systems of an organization.
- These database systems are connected via communication links. Such links help the end-users to access the data easily.
- Examples of the Distributed database are Apache Cassandra, HBase, Ignite, etc.

### Relational Database

- This database is based on the relational data model, which **stores data in the form of rows(tuple) and columns(attributes), and together forms a table(relation).**
- A relational database uses SQL for storing, manipulating, as well as maintaining the data. E.F.Codd invented this database in 1970.
- Each table in the database carries a key that makes the data unique from others.
- Examples of Relational databases are MySQL, Microsoft SQL Server, Oracle, etc.

### NoSQL Database

- **Non-SQL/Not Only SQL** is a type of database that is **used for storing a wide range of data sets.**
- It is not a relational database as it stores data not only in tabular form but in several different ways.
- It came into existence when the demand for building modern applications increased. Thus,
  NoSQL presented a wide variety of database technologies in response to the demands.
- We can further divide a NoSQL database into the following four types

![TypesofNoSQLgraph](https://i.imgur.com/ii6vSeg.jpeg)

### Cloud Database

- A type of database where **data is stored in a virtual environment** and executes over the cloud computing platform.
- It provides users with various cloud computing services (SaaS, PaaS, IaaS, etc.) for accessing the database. There are numerous cloud platforms, but the best options are:
  - Amazon Web Services(AWS)
  - Microsoft Azure
  - Kamatera
  - PhonixNAP
  - ScienceSoft
  - Google Cloud SQL, etc

### Object Oriented Database

- The type of database that **uses the object-based data model approach for storing data** in the database system.
- The data is represented and stored as objects which are similar to the objects used in the object-oriented programming language.

### Hierarchical Database

- It is the type of database that stores data in the form of **parent-children relationship nodes.** Here, it organizes data in a **tree-like structure.**
- Data get stored in the form of records that are connected via links.
- Each child record in the tree will contain only one parent. On the other hand, each parent record can have multiple child records.

## SQL

- SQL (Structured Query Language) is used to perform operations on the records stored in the database, such as updating records, inserting records, deleting records, creating and modifying database tables, views, etc.
- SQL is not a database system, but it is a **query language.**
- Suppose you want to perform the queries of SQL language on the stored data in the database. You are required to install any database management system in your systems, for example, Oracle, MySQL, MongoDB, PostgreSQL, SQL Server, DB2, etc
- SQL stands for **Structured Query language**, pronounced as **“S-Q-L”** or sometimes as **“See-Quel”**... Relational databases like MySQL Database, Oracle, MS SQL Server, Sybase, etc. use ANSI SQL.
- This query language became the standard of ANSI in the year of 1986 and ISO in the year of 1987.
- SQL is the standard language for dealing with **Relational Databases.**
- "A Relational Model of Data for Large Shared Data Banks" was a paper which was published by the great computer scientist "E.F. Codd" in 1970.
- The IBM researchers Raymond Boyce and Donald Chamberlin originally developed the SEQUEL (Structured English Query Language) after learning from the paper given by E.F. Codd.
- They both developed the SQL at the San Jose Research laboratory of IBM Corporation in 1970.

### What is SQL used for?

- It helps users to access data in the **RDBMS** system.
- It helps you to describe the data.
- It allows you to define the data in a database and manipulate that specific data.
- With the help of SQL, you can create and drop databases and tables.
- SQL offers you to use the function in a database, create a view, and stored procedure.
- You can set permissions on tables, procedures, and views.

### SQL: Process

- When we are executing the command of SQL on any Relational database management system, then the system automatically finds the best routine to carry out our request, and the SQL engine determines how to interpret that particular command.
- Structured Query Language contains the following four components in its process:
  - Query Dispatcher
  - Optimization Engines
  - Classic Query Engine
  - SQL Query Engine, etc.

![sql-process](https://i.imgur.com/yfKjel7.png)

### Types of SQL Statements

- SQL commands are instructions. It is used to communicate with the database. It is also used to perform specific tasks, functions, and queries of data.
- SQL can perform various tasks like create a table, add data to tables, drop the table, modify the table, set permission for users.
- Here are five types of widely used SQL queries.
  - Data Definition Language **(DDL)**
  - Data Manipulation Language **(DML)**
  - Data Control Language **(DCL)**
  - Transaction Control Language **(TCL)**
  - Data Query Language **(DQL)**

![sql_commands](https://i.imgur.com/WTh24MG.png)

#### Data Definition Language

- DDL changes the structure of the table like creating a table, deleting a table, altering a table, etc.
- All the command of DDL are auto-committed that means it permanently save all the changes in the database.
- Here are some commands that come under DDL:
  - **CREATE**
    - It is used to create a new table in the database.
  - **DROP**
    - It is used to delete both the structure and record stored in the table.
  - **ALTER**
    - It is used to alter the structure of the database. This change could be either to modify the characteristics of an existing attribute or probably to add a new attribute.
  - **TRUNCATE**
    - It is used to delete all the rows from the table and free the space containing the table.

#### Data Manipulation Language

- DML commands are used to modify the database. It is responsible for all form of changes in the database.
- The command of DML is not auto-committed that means it can't permanently save all the changes in the database. They can be rollback.
- Here are some commands that come under DML:
  - INSERT
  - UPDATE
  - DELETE

#### Data Control Language

- DCL commands are used to grant and take back authority from any database user.
- Here are some commands that come under DCL:
  - Grant
  - Revoke

#### Transaction Control Language

- TCL commands can only use with DML commands like INSERT, DELETE and UPDATE only.
- These operations are automatically committed in the database that's why they cannot be used while creating tables or dropping them.
- Here are some commands that come under TCL:
  - COMMIT
  - ROLLBACK
  - SAVEPOINT

#### Data Query Language

- DQL is used to fetch the data from the
  database.
- It uses only one command:
  - SELECT

## NoSQL

- A NoSQL (originally referring to "non-SQL" or "non-relational") database provides a mechanism for storage and retrieval of data that is **modeled in means other than the tabular relations** used in relational databases.
- Such databases have existed since the late 1960s, but the name "NoSQL" was only coined in the early 21st century, triggered by the needs of Web 2.0 companies.
- NoSQL databases are increasingly **used in big data and real-time web applications.**
- NoSQL systems are also sometimes called **"Not only SQL"** to emphasize that they may support SQL-like query languages or sit alongside SQL databases in polyglot-persistent architectures.
- Motivations for this approach include: **simplicity of design, simpler "horizontal" scaling to clusters of machines** (which is a problem for relational databases), finer control over availability and limiting the object-relational impedance mismatch.
- The data structures used by NoSQL databases (e.g. key–value pair, wide column, graph, or document) are different from those used by default in relational databases, making some operations faster in NoSQL.
- The particular suitability of a given NoSQL database depends on the problem it must solve. Sometimes the data structures used by NoSQL databases are also viewed as **"more flexible"** than relational database tables.

## SQL vs NoSQL

| Feature        | SQL                                                             | NoSQL                                                                              |
| -------------- | --------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| Data Structure | Structured                                                      | Semi-structured / Unstructured                                                     |
| Schema         | Fixed (requires predefined schema)                              | Dynamic (schema-free)                                                              |
| Query Language | SQL (Structured Query Language)                                 | Varies by NoSQL type (e.g., JSON, BSON)                                            |
| Scalability    | Vertically scalable (limited)                                   | Horizontally scalable (easily scalable)                                            |
| Transactions   | ACID (Atomicity, Consistency, Isolation, Durability) properties | Typically BASE (Basically Available, Soft state, Eventually consistent) properties |
| Flexibility    | Less flexible due to fixed schema                               | More flexible due to dynamic schema                                                |
| Examples       | MySQL, PostgreSQL, Oracle                                       | MongoDB, Cassandra, Couchbase                                                      |

## DataBase Types

![657](https://i.imgur.com/EFmdP8k.png)

## MySQL

- MySQL is released under an **open-source** license. So you have nothing to pay to use it.
- MySQL is a very powerful program in its own right. It handles a large subset of the functionality of the most expensive and powerful database packages.
- MySQL uses a standard form of the well-known SQL data language.
- MySQL works on many operating systems and with many languages including Python, PHP, PERL, C, C++, JAVA, etc.
- MySQL works very quickly and works well even with large data sets.
- MySQL is very friendly to PHP, the most appreciated language for web development.
- MySQL supports large databases, up to 50 million rows or more in a table. The default file size limit for a table is 4GB, but you can increase this (if your operating system can handle it) to a theoretical limit of 8 million terabytes (TB).
- MySQL is customizable. The open-source GPL license allows programmers to modify the MySQL software to fit their own specific environments.

### MySQL Clients

- MYSQL Client are **programs for communicating with the server** to manipulate the information in the databases that the server manages.
- Example : mysql is the command line program that acts as a text-based front end for the server.

### MySQL Workbench

- MySQL Workbench is a unified **visual tool** for database architects, developers, and DBAs.
- MySQL Workbench provides data modeling, SQL development, and comprehensive administration tools for server configuration, user administration, backup, and much more.
- MySQL Workbench is available on Windows, Linux and Mac OS X.

### MySQL Shell

- The MySQL Shell is an interactive Javascript, Python, or SQL interface supporting development and administration for the MySQL Server and is a component of the MySQL Server.
- You can use the MySQL Shell to perform data queries and updates as well as various administration operations.

## Data Models

- Data modeling (data modelling) is the process of creating a data model for the data to be stored in a database.
- This data model is a conceptual representation of Data objects, the associations between different data objects, and the rules.
- Data modeling helps in the visual representation of data and enforces business rules, regulatory compliances, and government policies on the data.
- It ensure consistency in naming conventions, default values, semantics, security while ensuring quality of the data.
- The Data Model is defined as an **abstract model** that organizes data description, data semantics, and consistency constraints of data.
- The data model emphasizes on what data is needed and how it should be organized instead of what operations will be performed on data.
- Data Model is like an architect’s building plan, which helps to build conceptual models and set a relationship between data items.
- The two types of Data Modeling Techniques are
  - Entity Relationship (E-R) Model
  - Unified Modelling Language (UML)

### Why Data Model?

- Ensures that all data objects required by the database are accurately represented. Omission of data will lead to creation of faulty reports and produce incorrect results.
- A data model helps design the database at the conceptual, physical and logical levels.
- Data Model structure helps to define the relational tables, primary and foreign keys and stored procedures.
- It provides a clear picture of the base data and can be used by database developers to create a physical database.
- It is also helpful to identify missing and redundant data.
- Though the initial creation of data model is labor and time consuming, in the long run, it makes your IT infrastructure upgrade and maintenance cheaper and faster.

### Types of Models

- **Conceptual Data Model:** This Data Model defines WHAT the system contains. This model is typically created by Business stakeholders and Data Architects. The purpose is to organize, scope and define business concepts and rules.
- **Logical Data Model:** Defines HOW the system should be implemented regardless of the DBMS. This model is typically created by Data Architects and Business Analysts. The purpose is to developed technical map of rules and data structures.
- **Physical Data Model:** This Data Model describes HOW the system will be implemented using a specific DBMS system. This model is typically created by DBA and developers. The purpose is actual implementation of the database.

![Types of Data Model](https://i.imgur.com/KD3M08s.png)

#### Conceptual Data Model

- A Conceptual Data Model is an organized view of database concepts and their relationships. The purpose of creating a conceptual data model is to **establish entities, their attributes, and relationships.**
- In this data modeling level, there is hardly any detail available on the actual database structure.
- The conceptual model is developed independently of hardware specifications like data storage capacity, location or software specifications like DBMS vendor and technology. The focus is to represent data as a user will see it in the “real world"
- The 3 basic tenants of Conceptual Data Model are:
  - **Entity:** A real-world thing
  - **Attribute:** Characteristics or properties of an entity
  - **Relationship:** Dependency or association between two entities
- Data model example:
  - Customer and Product are two entities. Customer number and name are attributes of the Customer entity.
  - Product name and price are attributes of product entity.
  - Sale is the relationship between the customer and product.

![Screenshot 2024-03-22 210927](https://i.imgur.com/xEx1soP.png)

#### Logical Data Model

- The Logical Data Model is used to **define the structure of data elements and to set relationships between them.**
- It adds further information to the conceptual data model elements.
- The advantage of using a Logical data model is to provide a foundation to form the base for the Physical model. However, the modeling structure remains generic.
- At this Data Modeling level, no primary or secondary key is defined.
- You need to verify and adjust the connector details that were set earlier for relationships.

![Screenshot 2024-03-22 210711](https://i.imgur.com/yr7duaH.png)

• Describes data needs for a single project but could integrate with other logical data models based on the scope of the project.
• Designed and developed independently from the DBMS.
• Data attributes will have datatypes with exact precisions and length.
• Normalization processes to the model is applied typically till 3NF.

#### Physical Data Model

- A Physical Data Model describes a **database-specific implementation** of the data model.
- It offers database abstraction and helps generate the schema. This is because of the richness of meta-data offered by a Physical Data Model.
- The physical data model also helps in visualizing database structure by replicating database column keys, constraints, indexes, triggers, and other RDBMS features.
- The physical data model describes data need for a single project or application though it maybe integrated with other physical data models based on project scope.
- Data Model contains **relationships between tables** that which addresses cardinality and nullability of the relationships.
- Developed for a specific version of a DBMS, location, data storage or technology to be used in the project.
- Columns should have exact datatypes, lengths assigned and default values.
- Primary and Foreign keys, views, indexes, access profiles, and authorizations, etc. are defined.

![Screenshot 2024-03-22 211642](https://i.imgur.com/lgUPXmt.png)

## DBMS Design

- Database Design is a collection of processes that facilitate the designing, development, implementation and maintenance of enterprise data management systems.
- Properly designed database are easy to maintain, improves data consistency and are cost effective in terms of disk storage space.
- The database designer decides how the data elements correlate and what data must be stored.
- The main objectives of database design in DBMS are to produce logical and physical designs models of the proposed database system.
- The logical model concentrates on the data requirements and the data to be stored independent of physical considerations. It does not concern itself with how the data will be stored or where it will be stored physically.
- The physical data design model involves translating the logical DB design of the database onto physical media using hardware resources and software systems such as database management systems (DBMS).

![Database Lifecycle](https://i.imgur.com/fiM49Fp.png)

### Database Design Techniques

- Two Types of Database Techniques
  1. Normalization
  2. ER Modeling

#### ER Diagram

- ER Diagram stands for **Entity Relationship Diagram,** also known as **ERD** is a diagram that displays the relationship of entity sets stored in a database.
- In other words, ER diagrams help to explain the logical structure of databases. ER diagrams are created based on three basic concepts: **entities, attributes and relationships.**
- ER Diagrams contain different symbols that use rectangles to represent entities, ovals to define attributes and diamond shapes to represent relationships.

![Screenshot 2024-03-22 213241](https://i.imgur.com/8mVg5Cb.png)

- Helps you to define terms related to entity relationship modeling.
- Provide a preview of how all your tables should connect, what fields are going to be on each table.
- Helps to describe entities, attributes, relationships.
- ER diagrams are translatable into relational tables which allows you to build databases quickly.
- ER diagrams can be used by database designers as a blueprint for implementing data in specific software applications.
- The database designer gains a better understanding of the information to be contained in the database with the help of ER diagram.
- ER Diagram allows you to communicate with the logical structure of the database to users.

##### ER Diagram: Symbols and Notations

- **Rectangles:** This Entity Relationship Diagram symbol represents entity types
- **Ellipses:** Symbol represent attributes
- **Diamonds:** This symbol represents relationship types
- **Lines:** It links attributes to entity types and entity types with other relationship types
- **Primary key:** attributes are underlined
- **Double Ellipses:** Represent multi-valued attributes

![chens-notation-1](https://i.imgur.com/tzYJKbZ.png)

##### Entity

- A real-world thing either living or non-living that is easily recognizable and nonrecognizable. It is anything in the enterprise that is to be represented in our database.
- It may be a physical thing or simply a fact about the enterprise or an event that happens in the real world.
- An entity can be place, person, object, event or a concept, which stores data in the database.
- The characteristics of entities are must have an attribute, and a unique key. Every entity is made up of some ‘attributes’ which represent that entity.

- Examples of entities:
  - **Person:** Employee, Student, Patient
  - **Place:** Store, Building
  - **Object:** Machine, product, and Car
  - **Event:** Sale, Registration, Renewal
  - **Concept:** Account, Course

###### Entity Set

- Student
  - An entity set is a group of similar kind of entities. It may contain entities with attribute sharing similar values.
  - Entities are represented by their properties, which also called attributes. All attributes have their separate values.
  - For example, a student entity may have a name, age, class, as attributes.

![Screenshot 2024-03-23 123649](https://i.imgur.com/12QjCiM.png)

###### Relationships

- Relationship is nothing but an association among
  two or more entities. E.g., Tom works in the
  Chemistry department.
- Entities take part in relationships. We can often
  identify relationships with verbs or verb phrases.

![Screenshot 2024-03-23 123658](https://i.imgur.com/Ubdh7qG.png)

###### Cardinality

- Defines the numerical attributes of the relationship between two entities or entity sets.
- Different types of cardinal relationships are:
  - One-to-One Relationships
  - One-to-Many Relationships
  - Many to One Relationships
  - Many-to-Many Relationships

![relationship-cardinality-notation-l](https://i.imgur.com/e92Qawu.jpeg)

### Codd’s 12 Rules for RDBMS

- Every database has tables, and constraints cannot be referred to as a rational database system. And if any database has only relational data model, it cannot be a Relational Database System (RDBMS).
- So, some rules define a database to be the correct RDBMS. These rules were developed by Dr. Edgar F. Codd (E.F. Codd) in 1985, who has vast research knowledge on the Relational Model of database Systems.
- Codd presents his 13 rules for a database to test the concept of DBMS against his relational model, and if a database follows the rule, it is called a true relational database (RDBMS).

![Codd’s 12 Rules for RDBMS](https://i.imgur.com/Szvv0eQ.jpeg)

#### Rule 0: The Foundation Rule

The database must be in relational form. So that the systemcan handle the database through its relational capabilities.

#### Rule 1: Information Rule

A database contains various information, and thisinformation must be stored in each cell of a table in theform of rows and columns.

#### Rule 2: Guaranteed Access Rule

Every single or precise data (atomic value) may be accessedlogically from a relational database using the combinationof primary key value, table name, and column name.

#### Rule 3: Systematic Treatment of Null Values

This rule defines the systematic treatment of Null values in database records. The null value has various meanings in the database, like missing the data, no value in a cell, inappropriate information, unknown data and the primary key should not be null.

#### Rule 4: Active/Dynamic Online Catalog based on the relational model

It represents the entire logical structure of the descriptive database that must be stored online and is known as a database dictionary. It authorizes users to access the database and implement a similar query language to access the database.

#### Rule 5: Comprehensive Data SubLanguage Rule

– The relational database supports various languages, and if we want to access the database, the language must be the explicit, linear or well-defined syntax, character strings and supports the comprehensive: data definition, view definition, data manipulation, integrity constraints, and limit transaction management operations.
– If the database allows access to the data without any language, it is considered a violation of the database.

#### Rule 6: View Updating Rule

All views table can be theoretically updated and must be practically updated by the database systems.

#### Rule 7: Relational Level Operation (High-Level Insert, Update and delete) Rule

A database system should follow high-level relational operations such as insert, update, and delete in each level or a single row. It also supports union, intersection and minus operation in the database system.

#### Rule 8: Physical Data Independence Rule

All stored data in a database or an application must be physically independent to access the database. Each data should not depend on other data or an application.
If data is updated or the physical structure of the database is changed, it will not show any effect on external applications that are accessing the data from the database.

#### Rule 9: Logical Data Independence Rule

It is similar to physical data independence. It means, if any changes occurred to the logical level (table structures), it should not affect the user's view (application).
For example, suppose a table either split into two tables, or two table joins to create a single table, these changes should not be impacted on the user view application.

#### Rule 10: Integrity Independence Rule

A database must maintain integrity independence when inserting data into table's cells using the SQL query language.
All entered values should not be changed or rely on any external factor or application to maintain integrity.
It is also helpful in making the database-independent for each front-end application.

#### Rule 11: Distribution Independence Rule

The distribution independence rule represents a database that must work properly, even if it is stored in different locations and used by different end-users.
Suppose a user accesses the database through an application; in that case, they should not be aware that another user uses particular data, and the data they always get is only located on one site.
The end users can access the database, and these access data should be independent for every user to perform the SQL queries.

#### Rule 12: Non Subversion Rule

The non-submersion rule defines RDBMS as a SQL language to store and manipulate the data in the database.
If a system has a low-level or separate language other than SQL to access the database system, it should not subvert or bypass integrity to transform data.

## MySQL Data Types

- A Data Type specifies a particular type of data, like integer, floating points, Boolean, etc.
- It also identifies the possible values for that type, the operations that can be performed on that type, and the way the values of that type are stored.
- In MySQL, each database table has many columns and contains specific data types for each column.
- We can determine the data type in MySQL with the following characteristics:
  - The type of values (fixed or variable) it represents.
  - The storage space it takes is based on whether the values are a fixed-length or variable length.
  - Its values can be indexed or not.
  - How MySQL performs a comparison of values of a particular data type.

### Numeric Data Types

- MySQL has all essential SQL numeric data types. These data types can include the exact numeric data types (For example, integer, decimal, numeric, etc.), as well as the approximate numeric data types (For example, float, real, and double precision).
- It also supports BIT datatype to store bit values. In MySQL, numeric data types are categories into two types, either signed or unsigned except for bit data type.

1. TINYINT
   - It is a very small integer that can be signed or unsigned. If signed, the allowable range is from -128 to 127. If unsigned, the allowable range is from 0 to 255. We can specify a width of up to 4 digits. It takes 1 byte for storage.
1. SMALLINT
   - It is a small integer that can be signed or unsigned. If signed, the allowable range is from -32768 to 32767. If unsigned, the allowable range is from 0 to 65535. We can specify a width of up to 5 digits. It requires 2 bytes for storage.
1. MEDIUMINT
   - It is a medium-sized integer that can be signed or unsigned. If signed, the allowable range is from -8388608 to 8388607. If unsigned, the allowable range is from 0 to 16777215. We can specify a width of up to 9 digits. It requires 3 bytes for storage.
1. INT
   - It is a normal-sized integer that can be signed or unsigned. If signed, the allowable range is from -2147483648 to 2147483647. If unsigned, the allowable range is from 0 to 4294967295. We can specify a width of up to 11 digits. It requires 4 bytes for storage.
1. BIGINT
   - It is a large integer that can be signed or unsigned. If signed, the allowable range is from -9223372036854775808 to 9223372036854775807. If unsigned, the allowable range is from 0 to 18446744073709551615. We can specify a width of up to 20 digits. It requires 8 bytes for storage.
1. FLOAT(m,d)
   - It is a floating-point number that cannot be unsigned. You can define the display length (m) and the number of decimals (d). This is not required and will default to 10,2, where 2 is the number of decimals, and 10 is the total number of digits (including decimals). Decimal precision can go to 24 places for a float type. It requires 2 bytes for storage.
1. DOUBLE(m,d)
   - It is a double-precision floating-point number that cannot be unsigned. You can define the display length (m) and the number of decimals (d).
   - This is not required and will default to 16,4, where 4 is the number of decimals. Decimal precision can go to 53 places for a double. Real is a synonym for double. It requires 8 bytes for storage.
1. DECIMAL(m,d)
   - An unpacked floating-point number that cannot be unsigned. In unpacked decimals, each decimal corresponds to one byte. Defining the display length (m) and the number of decimals (d) is required. Numeric is a synonym for decimal.
1. BIT(m)
   - It is used for storing bit values into the table column. Here, M determines the number of bit per value that has a range of 1 to 64.
1. BOOL
   - It is used only for the true and false condition. It considered numeric value 1 as true and 0 as false.
1. BOOLEAN
   - It is Similar to the BOOL.

### Date and Time

- This data type is used to represent temporal values such as date, time, datetime, timestamp, and year.
- Each temporal type contains values, including zero. When we insert the invalid value, MySQL cannot represent it, and then zero value is used.

1. YEAR[(2|4)]
   - Year value as 2 digits or 4 digits. The default is 4 digits. It takes 1 byte for storage.
1. DATE
   - Values range from '1000-01-01' to '9999-12-31'. Displayed as 'yyyy-mm-dd'. It takes 3 bytes for storage.
1. TIME
   - Values range from '-838:59:59' to '838:59:59'. Displayed as 'HH:MM:SS'. It takes 3 bytes plus fractional seconds for storage.
1. DATETIME
   - Values range from '1000-01-01 00:00:00' to '9999-12-31 23:59:59'. Displayed as 'yyyy-mm-dd hh:mm:ss'. It takes 5 bytes plus fractional seconds for storage.
1. TIMESTAMP(m)
   - Values range from '1970-01-01 00:00:01' UTC to '2038-01-19 03:14:07' TC. Displayed as 'YYYY-MMDD HH:MM:SS'. It takes 4 bytes plus fractional seconds for storage.

### String

- The string data type is used to hold plain text and binary data, for example, files, images, etc.
- MySQL can perform searching and comparison of string value based on the pattern matching such as LIKE operator, Regular Expressions, etc.

1. CHAR(size)
   - It can have a maximum size of 255 characters. Here size is the number of characters to store. Fixed-length strings. Space padded on the right to equal size characters.
1. VARCHAR(size)
   - It can have a maximum size of 255 characters. Here size is the number of characters to store. Variable-length string.
1. TINYTEXT(size)
   - It can have a maximum size of 255 characters. Here size is the number of characters to store.
1. TEXT(size)
   - Maximum size of 65,535 characters. Here size is the number of characters to store.
1. MEDIUMTEXT(size)
   - It can have a maximum size of 16,777,215 characters. Here size is the number of characters to store.
1. LONGTEXT(size)
   - It can have a maximum size of 4GB or 4,294,967,295 characters. Here size is the number of characters to store.
1. BINARY(size)
   - It can have a maximum size of 255 characters. Here size is the number of binary characters to store. Fixed-length strings. Space padded on the right to equal size characters.

## How to check constraints on a table

```sql
USE INFORMATION_SCHEMA;
SHOW TABLES;
DESC TABLE_CONSTRAINTS;
SELECT CONSTRAINTS_NAME FROM TABLE_CONSTRAINTS WHERE TABLE_SCHEMA = "<database_name>";
USE <database_name>;
ALTER TABLE <table_name> DROP CONSTRAINT <constraint_name>;
```

**OR**

```sql
mysql> show create table <table_name>;
+---------+--------------------------------------------------------+
| Table   | Create Table                                           |
+---------+--------------------------------------------------------+
| student | CREATE TABLE `student` (
  `roll` int NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `class` varchar(10) DEFAULT NULL,
  `marks` float NOT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`roll`),
  UNIQUE KEY `name` (`name`),
  CONSTRAINT `student_chk_1` CHECK ((`age` > 18))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci |
+---------+--------------------------------------------------------+
```
