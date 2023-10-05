# Adapter pattern
Allows you to make two incompatible interfaces work together. 

It's like a translator that helps two entities understand each other.

Pros:
- You can reuse existing classes or components in new contexts, without having to modify their source code. 
- Adapter helps keep code modular and maintainable by isolating the adaptation logic within the adapter. Adheres to the Open-Closed principle (= allows you to add new adapters without modifying existing code).

Cons:
- In some cases adding adapters can increase complexity and overhead, especially when dealing with multiple adapters. 
- Can increase performance overhead.
