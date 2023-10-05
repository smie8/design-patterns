# Command Pattern

Encapsulates a _request as an object_, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

It helps you turn a request or action into an object, which can be then passed around, stored, and executed at a later time.

Decouples the sender (invoker, action requester) from the receiver (the one performing the action).

Pros:
- Single Responsibility Principle - separates the code that executes the command from the code that knows how to execute the command.
- Open/Closed Principle - you can introduce new commands into the app without breaking existing client code.
- You can implement undo/redo operations.
- You can implement deferred execution of operations.
- You can assemble a set of simple commands into a complex one.

Cons:
- The code may become more complicated since you're introducing a lot of new classes (introducing a new layer between senders and receivers).