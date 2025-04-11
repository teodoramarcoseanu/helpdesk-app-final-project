# helpdesk-app-final-project
A web-based helpdesk/ticketing system built with **Java Spring Boot**, **Thymeleaf**, **Spring Security**, **Spring Data JPA**, **MySQL**, and **IntelliJ IDEA**.
## 🚀 Features

- 🎫 Create, view, edit, and delete support tickets
- 🔎 Live Search Bar using **JavaScript**
- 📄 Ticket details with edit and update capabilities
- 📊 Clean and responsive UI styled with **Thymeleaf** and CSS
- 🧪 Spring Boot DevTools for hot reload

---

## 🛠️ Technologies Used

| Technology      | Purpose                                |
|-----------------|----------------------------------------|
| Spring Boot     | Backend framework                      |
| Thymeleaf       | Templating engine for frontend         |
| Spring Data JPA | Database interaction                   |
| MySQL           | Database                               |
| HTML/CSS        | Frontend UI                            |
| JavaScript      | Live search functionality              |
| IntelliJ IDEA   | IDE for development                    |

---


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

---

## 🧪 How to Run

1. **Clone the repository:**

```bash
git clone https://github.com/your-username/helpdesk-app.git
cd helpdesk-app
```

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

## 🔍 Filtering & Search
 
- JavaScript-based live search by title/description
---

## 📝 Future Improvements
- ✅ Au
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
