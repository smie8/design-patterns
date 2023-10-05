# Singleton pattern
Ensure a class has only one instance, and provide a global point of access to it.

Carefully choose an appropriate Singleton implementation for multithreaded applications (e.g. lazy/eager initialization, double-checked locking).

Pros:
- You can be sure class has only a single instance.
- You gain a global access point to that instance.
- Initialized only when it's requested for the first time.