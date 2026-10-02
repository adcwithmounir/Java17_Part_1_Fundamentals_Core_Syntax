<div align="center">

# ☕ Java SE 17 — Part 1: Java Fundamentals / Core Syntax

### Learn Java from zero & prepare for the OCP 1Z0-829 certification

**Source code for the video course by _ADC with Mounir_**

[![Java](https://img.shields.io/badge/Java-SE%2017-58A6FF?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![YouTube](https://img.shields.io/badge/Watch%20on-YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://tinyurl.com/java17fundamental)

</div>

---

## 📖 About this repository

This repository contains **all the code examples** shown in **Part 1 — Java Fundamentals / Core Syntax** of the *Java SE 17 Full Course* on the **ADC with Mounir** YouTube channel.

Every folder matches one video. Open the folder, follow along with the video, run the code, break it, fix it — that is the fastest way to really learn Java.

All examples are built around a **streaming-platform project** (`Movie`, `Series`, `Episode`, `User`, `Subscription`, `StreamingPlatform`, `ContentType`…) instead of abstract `Foo` / `Bar` examples, so every concept has a real, meaningful context.

---

## 🎯 Who is this for?

| | Profile | How to use this repo |
|---|---|---|
| 🟢 | **Complete beginners** — never written a line of Java | Follow the folders in order, one video at a time |
| 🔵 | **Developers switching to Java** | Jump to the topics you need |
| 🟠 | **OCP 1Z0-829 candidates** | Focus on the 🎓 exam traps and practice questions in each video |

---

## 🗂️ Course content

| # | Folder | Video topic | What you'll learn | Status |
|:-:|---|---|---|:-:|
| 1 | [`Part_1_1_Java_Fundamentals_Core_Syntax`](./Part_1_1_Java_Fundamentals_Core_Syntax) | **How Java Works Under the Hood** | JDK, JVM, bytecode, `javac` & `java`, from JRE to JDK | ✅ |
| 2 | [`Part_1_2_Java_Fundamentals_Core_Syntax`](./Part_1_2_Java_Fundamentals_Core_Syntax) | **Your First Java Class** | Fields, methods, comments, classes & source files | ✅ |
| 3 | [`Part_1_3_Java_Fundamentals_Core_Syntax`](./Part_1_3_Java_Fundamentals_Core_Syntax) | **The Entry Point: Writing `main()`** | The `main()` signature, valid variations, command-line arguments | ✅ |
| 4 | [`Part_1_4_Java_Fundamentals_Core_Syntax`](./Part_1_4_Java_Fundamentals_Core_Syntax) | **Organizing Code with Packages & Imports** | Packages, imports, wildcards, naming conflicts, compiling packaged code, classpath & JARs | ✅ |
| 5 | [`Part_1_5_Java_Fundamentals_Core_Syntax`](./Part_1_5_Java_Fundamentals_Core_Syntax) | **Bringing Your Class to Life** | Constructors, reading & writing fields, instance initializers, order of initialization | ✅ |
| 6 | [`Part_1_6_Java_Fundamentals_Core_Syntax`](./Part_1_6_Java_Fundamentals_Core_Syntax) | **Primitives, References & Data Types** | The 8 primitives, literals & underscores, number bases, reference types, wrappers, text blocks | ✅ |
| 7 | NO LABS (see the video) | **Declaring Variables** | Identifier rules, naming conventions, multiple declarations | ✅ |
| 8 | [`Part_1_8_Java_Fundamentals_Core_Syntax`](./Part_1_8_Java_Fundamentals_Core_Syntax) | **Giving Variables Their First Value** | Local vs instance vs class variables, default values, `final`, `var` | ✅ |
| 9 | [`Part_1_9_Java_Fundamentals_Core_Syntax`](./Part_1_9_Java_Fundamentals_Core_Syntax) | **Managing Variable Scope** | Block scope, tracing scope, local / instance / class lifetimes | ✅ |
| 10 | NO LABS (see the video) | **Destroying Objects & Memory Management** | The heap, references vs objects, garbage collection eligibility | ✅ |
| 11 | NO LABS (see the video) | **Chapter Review & Practice Questions** | Summary, exam essentials and OCP-style practice questions | ✅ |

> ✅ Available · 🔜 Coming soon — the repo is updated as new videos are released.

---

## 🎓 OCP 1Z0-829 objectives covered

- **Handling date, time, text, numeric and boolean values**
  - Use primitives and wrapper classes, including Math API, parentheses, type promotion and casting
- **Utilizing Java object-oriented approach**
  - Declare and instantiate Java objects, including nested class objects, and explain the object life cycle (creation, reassigning references, garbage collection)
  - Understand variable scopes, use local variable type inference, apply encapsulation, and make objects immutable

---

## 🛠️ Prerequisites

- **JDK 17** installed ([Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17))
- A code editor — the course uses **VS Code** with the *Extension Pack for Java*, but any IDE works (IntelliJ IDEA, Eclipse…)

Check your installation:

```bash
javac -version   # should print 17.x
java  -version   # should print 17.x
```

---

## 🚀 Getting started

```bash
# 1. Clone the repository
git clone https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax.git
cd Java17_Part_1_Fundamentals_Core_Syntax

# 2. Open the folder of the video you are watching
cd Part_1_1_Java_Fundamentals_Core_Syntax
```

Each folder is independent. You can open it directly in VS Code, or compile and run from the terminal:

```bash
# Compile a class
javac Movie.java

# Run it (no .class extension!)
java Movie

# Java 11+ shortcut for single-file programs
java Movie.java
```

> 💡 **Tip:** The course deliberately uses the command line in the early videos. Knowing what your IDE does behind the scenes is exactly what the OCP exam tests.

---

## 📺 Watch the course

| Resource | Link |
|---|---|
| 📃 Full Part 1 playlist | [tinyurl.com/java17fundamental](https://tinyurl.com/java17fundamental) |
| 💻 Source code (this repo) | [github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax](https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax) |

---

## 🧭 Course roadmap

This repository is **Part 1** of a complete Java SE 17 course. Each part has its own repository.

| Part | Topic | Status |
|:-:|---|:-:|
| **1** | **Java Fundamentals / Core Syntax** | 🟢 In progress |
| 2 | Expressions & Computations | 🔜 |
| 3 | Control Flow & Conditionals | 🔜 |
| 4 | Essential Java Libraries | 🔜 |
| 5 | Functions & Parameters | 🔜 |
| 6 | Object-Oriented Basics | 🔜 |
| 7 | Interfaces & Abstract Types | 🔜 |
| 8 | Functional Programming | 🔜 |
| 9 | Data Structures & Type Safety | 🔜 |
| 10 | Data Processing Pipelines | 🔜 |
| 11 | Error Handling & i18n | 🔜 |
| 12 | Java Module System (JPMS) | 🔜 |
| 13 | Multithreading & Parallelism | 🔜 |
| 14 | File & Stream Operations | 🔜 |
| 15 | Database Connectivity | 🔜 |

---

## 📚 Recommended reading

This course is inspired by, and complements, the official study guide:

> **OCP Oracle Certified Professional Java SE 17 Developer Study Guide: Exam 1Z0-829**
> Scott Selikoff & Jeanne Boyarsky — Sybex

The course does not replace the book. All code, explanations and practice questions in this repository are original.

---

## 🤝 Contributing

Found a typo, a bug, or have an idea for a better example?
Feel free to [open an issue](https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax/issues) or submit a pull request. Questions about the videos are welcome in the YouTube comments too.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE) — use the code freely to learn and practice.

---

<div align="center">

**⭐ If this repository helps you learn Java, give it a star — it helps other learners find it!**

Made with ☕ by **ADC with Mounir**

</div>
