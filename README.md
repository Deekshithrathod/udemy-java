# udemy-java

Re-Learning JAVA from this udemy course - https://www.udemy.com/course/java-se-programming

Will be updating my progress here in this READ_ME

Section-1: Java Introduction

- Learnt meanings of JDK, JRE, JVM
- Learnt how to compile & run a java program
- Learnt how to take input from user & print things on terminal & also learning, how to take command line arguments in a
  java program

Section-2: Data Types - Variables, Literals

- Learnt about the primitive data types in JAVA
- Learnt what literals are & how to use
- Learnt methods to convert numbers from int to hex, oct & binary systems

Section-3: IDE setup

- Setup Intellij

Section-4: JVM & JVM architecture

- Learnt how java is platform independent
- Learnt about JVM Architecture : Class Loader, Method Area, Heap, Stack (new stack for each thread), PC Registers,
  Native Method Stack
- Learn about Class loader in detail
    - Class Loader has three major parts: Loading, Linking, Initialisation
        - Loading: Bootstrap class loader, Extension Class loader, Application class loader
            - Application class loader-Loads program
            - Bootstrap class loader: loads all the java libs for program to run (can be found in /program
              Files/java/1.8JDK/jre-1.8/rt.jar)
            - Extension class loader: Loads all the java libs for java run time (can be found in /program
              Files/java/1.8JDK/jre-1.8/lib/ext)
        - Linking: It has three major step verify, prepare, resolve
            - Verify: Verify the byte code for any errors & throws verification error in case of failure
            - Prepare: Allocate memory for static variables
            - Resolve: All the method call are replace by the method addresses from method area in the program
        - Initialization: All static variables & static blocks are executed
- Method Area: A place in memory where all the methods are stored
- Heap: A place where object created are stored
- Stack: May contain multiple stacks, as there could be multiple threads
- PC Register: Each stack would have its own PC register
- Native Method Stack: This is to communicate with other languages like c, c++
- Execution Engine: Garbage Collector, JIT compiler, Interpreter
- JVM converts bytecode to machine code
    - Concepts learnt in this section are: Just-In-Time(JIT compilation), Class Loading, Method Area, Heap, Stack, OOP,
      Garbage Collections..

Section-5: Operators & Expressions

- Operators: +, -, *, /, %
    - Precedence of Operators: *,/,%  > -,+
- Bitwise Operators

| Operation             | Symbol |
|:----------------------|:------:|
| And                   |   &    |
| Or                    |   \    |
| Xor                   |   ^    |
| Not                   |   ~    |
| Left Shift            |   <<   |
| Right Shift           |  \>>   |
| Right Shift un-signed |  \>>>  |

- Bit Masking & Merging
- Widening & Narrowing:
    - Widening: up-casting
    - Narrowing: down-casting

Section-11: Inheritance

- Learnt about `extends` keyword
- Learnt about ways in which polymorphism can be achieved
- Learnt about Method over-riding (to achieve run-time polymorphism)
- Learnt about Method over loading (to achieve compile-time polymorphism)















