```markdown
# 🌱 Spring Fundamentals

> A hands-on learning journey through core Spring Framework concepts — from XML-based configuration to annotation-based and Java-based configuration, and eventually Spring MVC/Boot.

Each folder is a self-contained practice project built to **actively test and understand** Spring's Dependency Injection (DI) and IoC container behavior — not just read theory.

---

## 📂 Repository Structure

```
spring-fundamentals/
├── xml-config/           # XML-based configuration practice
├── annotation-config/    # Annotation-based configuration (coming soon)
├── java-config/          # Java-based @Configuration practice (coming soon)
└── README.md
```

---

## 🧩 xml-config/ — Computer Assembly System

A small "Computer Assembly" project designed to exercise nearly **every core XML configuration concept** in one place.

### ✅ Concepts Covered

| Concept | Demonstrated Via |
|---|---|
| Interface-based bean design | `Ram`, `Processor`, `Storage` interfaces |
| Setter Injection | `<property>` |
| Constructor Injection | `<constructor-arg>` |
| Inner Beans | Anonymous `Storage` bean nested inside `Computer` |
| Autowiring (`byName`, `byType`) | Resolving dependencies without explicit `ref` |
| Primary Bean | `primary="true"` to resolve ambiguity |
| Lazy Initialization | `lazy-init="true"` on Storage beans |
| Bean Scopes | `singleton` vs `prototype` comparison |
| Lifecycle Hooks | `init-method` / `destroy-method` |
| Collections | `<list>` for ports |
| `getBean()` variants | By id, by id+type, by type alone |
| Exception Handling | `NoUniqueBeanDefinitionException` and its fixes |

### 🗂️ Project Structure

```
org.amit/
├── ram/          → Ram (interface), DDR3, DDR4
├── processor/    → Processor (interface), Intel, Amd
├── storage/      → Storage (interface), SSD, HDD
├── Computer.java
└── Main.java
beans.xml
```

### 🔍 What Main.java Demonstrates

- Fetching a bean by **type** where multiple candidates exist, resolved via `primary`
- Comparing object references (`==`) to observe **singleton vs prototype** scope
- Observing **eager vs lazy** bean creation via console output timing
- Confirming `init-method` runs at startup and `destroy-method` runs on `context.close()`

### ▶️ How to Run

```
cd xml-config
mvn compile exec:java -Dexec.mainClass="org.amit.Main"
```

*(or run Main.java directly from your IDE)*

---

## 🔜 annotation-config/ (coming soon)

Will reproduce the same Computer Assembly concepts using `@Component`, `@Autowired`, `@Qualifier`, `@Primary`, `@Lazy`, `@Scope`, `@PostConstruct`, `@PreDestroy` — for direct comparison against the XML approach above.

## 🔜 java-config/ (coming soon)

Will reproduce the same concepts using `@Configuration` and `@Bean` methods, loaded via `AnnotationConfigApplicationContext`.

---

## 💡 Why This Repo Exists

Spring's DI concepts — autowiring, bean scopes, lifecycle hooks — are easy to *read about* but easy to *misunderstand* without running them. This repo is a working reference I can revisit anytime to recall exactly **how** a concept behaves, not just what it's called.

---

## 🛠️ Tech Stack

- Java
- Spring Framework (Core / Context)
- Maven
```

