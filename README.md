# spring-javamodules

POC repository to see if spring can inject bi-directional dependencies across Java 9 modules. It contains 3 modules: 
- app - the main application gets a Config implementation injected. Implements the Restart interface. Depends on common and config.
- config - a library with a ConfigImpl class, gets a Restart dependency injected. Depends on common.
- common - contains the interfaces that we use for injecting.
