# sante_demo

This repository exists as a small demo project for showing how several ideas can work together in one codebase:

- Domain-Driven Design (DDD)
- Event-Driven Architecture (EDA)
- Clean Architecture
- Functional Programming (FP) style

The goal is not to build a full production system, but to demonstrate how these approaches can be combined in a practical and understandable way.

As a business example, the project uses the idea of a web platform similar to [xelosnebi.ge](https://xelosnebi.ge/). The code in this repository is **not** the code that runs that website. It only uses that kind of product idea as a reference for how such a system could be structured.

This demo focuses on:

- keeping domain logic explicit and isolated
- separating application, domain, and infrastructure concerns
- showing how events can support decoupled workflows
- highlighting some advantages of FP style, such as clearer error handling, composability, and more predictable behavior

In short, this repository stands as an example of how a web project like that could be designed, rather than as the actual implementation of the real site.
