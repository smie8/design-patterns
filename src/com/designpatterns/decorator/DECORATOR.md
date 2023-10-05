# Decorator pattern
Dynamically add behavior or responsibilities to objects without altering their code. Flexible alternative to subclassing for extending functionality.  Follows the open-closed principle of object-oriented design.

Negative side is that it can add a lot of small classes to a design and overuse can be complex.

Pros:
- You can extend an object's behavior without making a new subclass.
- You can add or remove responsibilities from an object at runtime.
- You can combine several behaviors by wrapping an object into multiple decorators.
- Single Responsibility Principle - you can divide a monolithic class that implements many possible variants of behavior into several smaller classes.

Cons:
- It's hard to remove a specific wrapper from the wrappers stack.
- It's hard to implement a decorator in such a way that its behavior does not depend on the order in the decorators stack.
- The initial configuration code of layers might look pretty ugly.