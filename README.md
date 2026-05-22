ShopFlow
<<<<<<< HEAD
=======
---
>>>>>>> 91c984e (Update README.md)

**ShopFlow — Full-Stack E-Commerce Admin Dashboard**

ShopFlow is a full-stack e-commerce management platform built with React and Spring Boot. It features a dual-dashboard system where admins can manage products and process orders in real time, while customers can browse products, manage their cart, and track their orders live.

---

**ShopFlow** is a full-stack e-commerce platform with real-time order management, built with **React + Vite** on the frontend and **Spring Boot + Spring Security** on the backend.

**Features**

**Admin Portal**
- Add, edit, and manage products with emoji icons, stock levels, and descriptions
- Real-time order notifications — new customer orders appear within 4 seconds
- Update order status (Pending → Processing → Shipped → Delivered)
- Live Feed showing all store activity
- Analytics dashboard with revenue and category charts
- Drag & drop product reordering
<<<<<<< HEAD

**Customer Portal**
- Browse product catalog with search and category filters
- Add to Cart or instant Buy Now on every product
- 3-step checkout — delivery address, payment method (Card / UPI / Cash on Delivery), order review
- My Orders with live status tracking and animated progress bar
- Instant notifications when admin updates order status

**Tech Stack**

| Layer | Technology |
|-------|-----------|
| Frontend | React 18, Vite, Recharts |
| Backend | Spring Boot 3, Spring Security, Spring Session |
| Database | H2 (in-memory) |
| Auth | Session-based (JSESSIONID cookie) |
| Styling | Inline styles, Google Fonts (Syne + DM Sans) |

**Demo Accounts**

| Role | Email | Password |
|------|-------|----------|
| Admin | admin@shopflow.com | admin123 |
| Customer | aisha@gmail.com | pass123 |
| Customer | raj@gmail.com | pass123 |

**Getting Started**
```bash
# Backend — run in VS Code or IntelliJ
cd shopflow-backend/shopflow-backend
./mvnw spring-boot:run

# Frontend
cd shopflow-frontend
npm install
npm run dev

# Open http://localhost:5173
```
=======

**Customer Portal**
- Browse product catalog with search and category filters
- Add to Cart or instant Buy Now on every product
- 3-step checkout — delivery address, payment method (Card / UPI / Cash on Delivery), order review
- My Orders with live status tracking and animated progress bar
- Instant notifications when admin updates order status

**Tech Stack**

| Layer | Technology |
|-------|-----------|
| Frontend | React 18, Vite, Recharts |
| Backend | Spring Boot 3, Spring Security, Spring Session |
| Database | H2 (in-memory) |
| Auth | Session-based (JSESSIONID cookie) |
| Styling | Inline styles, Google Fonts (Syne + DM Sans) |

**Demo Accounts**

| Role | Email | Password |
|------|-------|----------|
| Admin | admin@shopflow.com | admin123 |
| Customer | aisha@gmail.com | pass123 |
| Customer | raj@gmail.com | pass123 |

**Getting Started**
```bash
# Backend — run in VS Code or IntelliJ
cd shopflow-backend/shopflow-backend
./mvnw spring-boot:run

# Frontend
cd shopflow-frontend
npm install
npm run dev

# Open http://localhost:5173
```

---

>>>>>>> 91c984e (Update README.md)
