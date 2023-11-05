# Proxy pattern
Provide a surrogate or placeholder for another object to control access to it. Proxy acts as a local representative to a remote object.

Pros:
- You can control access to the object without clients knowing about it.
- You can manage the lifecycle of the object when clients don't care about it.
- The proxy works even if the service object isn't ready or is not available.
- Open/Closed Principle. You can introduce new proxies without changing the service or clients.

Cons:
- Your code may become more complex.
- Response from the service might get delayed.