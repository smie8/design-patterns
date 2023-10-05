# Strategy Pattern
Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

By employing the Strategy Pattern, you're separating the "what" (the algorithm) from the "how" (the implementation details). This promotes clean code, modular design, and maintainability, making your software more adaptable to changes and new requirements.

Pros:
- You can vary the algorithm or the implementation of an algorithm at runtime.
- You can isolate the implementation details of an algorithm from the code that uses it.
- You can replace inheritance with composition.
- Open/Closed Principle - new strategies can be added easily without modifying the context.

Cons: 
- Clients need to know the differences between strategies to select the right one.
- If your programming language has functional type support, you can use anonymous functions instead of classes to implement the strategies, which can save some code.