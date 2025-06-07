# Product & Category Management API

This is a Spring Boot REST API for managing **Products** and **Categories** with full CRUD operations and pagination support. Each product belongs to a category, and product details include its respective category information.

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## API Endpoints

### Categories

| Method | Endpoint               | Description               |
|--------|------------------------|---------------------------|
| GET    | `/api/categories`      | Get paginated list of categories (params: `page`, `size`) |
| GET    | `/api/categories/{id}` | Get category by ID        |
| POST   | `/api/categories`      | Create a new category     |
| PUT    | `/api/categories/{id}` | Update category by ID     |
| DELETE | `/api/categories/{id}` | Delete category by ID     |

### Products

| Method | Endpoint             | Description               |
|--------|----------------------|---------------------------|
| GET    | `/api/products`      | Get paginated list of products (params: `page`, `size`) |
| GET    | `/api/products/{id}` | Get product by ID (includes category details) |
| POST   | `/api/products`      | Create a new product      |
| PUT    | `/api/products/{id}` | Update product by ID      |
| DELETE | `/api/products/{id}` | Delete product by ID      |

---
