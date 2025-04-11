# helpdesk-app-final-project
A web-based helpdesk/ticketing system built with **Java Spring Boot**, **Thymeleaf**, **Spring Data JPA**, **MySQL**, and **IntelliJ IDEA**.
## 🚀 Features

🧾 Helpdesk Support Application - Summary
✅ Project Purpose
This is a Helpdesk Ticketing System designed to allow users to:

Submit support tickets.

View and manage their tickets.



## 🛠️🧰 Tech Stack
Backend: Java, Spring Boot

Frontend: Thymeleaf (HTML, CSS, Bootstrap-style design)

Database: MySQL (with Spring Data JPA & JDBC)

IDE: IntelliJ IDEA

Build Tool: Maven

Version Control: Git




---![dependencz11](https://github.com/user-attachments/assets/d49e7278-36bf-4bff-a5b3-8c3aa1c21814)


## 📁 Project Structure

```
src/
├── controller/
│   └── TicketController.java
├── model/
│   └── Ticket.java
├── repository/
│   └── TicketRepository.java
├── service/
│   └── TicketService.java
├── security/
│   └── WebSecurityConfig.java
├── templates/
│   ├── home.html
│   ├── tickets.html
│   ├── ticket_details.html
│   ├── ticket_edit.html
│   ├── login.html
│   └── error.html
└── static/
    └── style.css
```
/create-ticket: Users can create a new ticket with title and description


![main page create ticket](https://github.com/user-attachments/assets/1904d794-2385-4f95-96f2-e3f3d422e56b)

Newly created tickets are stored with status Open
Ticket Listing
/tickets: Lists all tickets for the user

![list of the tickets](https://github.com/user-attachments/assets/7fbf4b3a-25c3-47d5-b174-953c4ea0cc5d)


Ticket Details
/ticket/{id}: Shows full ticket info (title, description, status)

![update and edit ticket](https://github.com/user-attachments/assets/c004ffb2-3dda-4f87-bcf2-4072bf1c88c1)

Ticket Update
/ticket/{id}/edit: Edit title, description, and status

![update and edit ticket](https://github.com/user-attachments/assets/861f43e3-d816-4c01-bd7d-d34b76dbd529)

/ticket/{id}/update-status: Update status only



HTML Pages (Thymeleaf)
create-ticket.html: Combined form for creating tickets and viewing your own

tickets.html: Lists all tickets (used by support agents/admins)

ticketDetails.html: View ticket details

editTicket.html: Edit existing ticket

error.html: Customized error page with green-style design and a button linking to /create-ticket


---

## 🧪 How to Run



2. **Configure your database in `application.properties`:**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/helpdesk
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. **Run the application:**

```bash
./mvnw spring-boot:run
```

4. **Access the app:**

```http://localhost:8080/create-ticket

```http://localhost:8080/tickets

---http://localhost:8080/error

🔁 URL Mapping Overview
Action	Method	URL	View/Page
View + create tickets	GET	/create-ticket	create-ticket.html
Submit ticket	POST	/create-ticket	redirect to /tickets
List all tickets	GET	/tickets	tickets.html
View ticket detail	GET	/ticket/{id}	ticketDetails.html
Edit ticket form	GET	/ticket/{id}/edit	editTicket.html
Submit edit	POST	/ticket/{id}/edit	redirect to details
Update status	POST	/ticket/{id}/update-status	redirect to details
Error page	-	/error	error.html


## 🔍 Filtering & Search
 
- JavaScript-based live search by title/description
---

## 📝 Future Improvements
- ✅  User Authentication
- ✅ Email notifications on ticket updates
- ✅ File attachment support
- ✅ Pagination & sorting
- ✅ Ticket priority and category
- ✅ Agent assignment via drag-and-drop or modal

---

## 👥 Contributors

- [Alexandra Grosu ] — Developer & Designer  


---

## 📜 License

This project is licensed under the MIT License.
