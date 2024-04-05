import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.*;


public class MicroProject{

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            displayMenu();
            int choice = getUserChoice(reader);

            switch (choice) {
                case 1: 
                    displayTopic("A Note for the User!",
                                "This Program is made for the Project of Java Programming, this program contains topic of java " +
                                "which we can know about and learn from, sample programs have also been provided for the neccessary!" +
                                "I hope you appreciate our Project!");
                    break;
                    
                case 2:
                    displayTopic("Introduction to Java", 
                                 "Java is a high-level, versatile, and object-oriented programming language. " +
                                 "It was first released by Sun Microsystems in 1995 and has since become one of the most popular programming languages in the world. " +
                                 "Java is known for its platform independence, meaning that Java programs can run on any device with the Java Virtual Machine (JVM) installed. " +
                                 "This makes Java ideal for developing applications for a wide range of platforms, including desktop computers, mobile devices, and web servers. " +
                                 "Java's syntax is similar to C++, making it easy for developers with experience in other languages to learn. " +
                                 "Furthermore, Java's automatic memory management, achieved through garbage collection, simplifies memory management for developers. " +
                                 "Another key feature of Java is its rich standard library, which provides pre-built functionality for common tasks such as file I/O, networking, and GUI development." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "public class HelloWorld {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        System.out.println(\"Hello, World!\");\n" +
                                 "    }\n" +
                                 "}\n");
                    break;


                case 3:
                    displayTopic("History of Java",
                                 "Java, initially named Oak, was developed by James Gosling, Mike Sheridan, and Patrick Naughton at Sun Microsystems in the early 1990s. " +
                                 "It was officially released in 1995 as Java 1.0. The language's design aimed to address the limitations of C++ and provide a platform-independent " +
                                 "solution for application development, particularly for consumer electronics. One of Java's breakthrough features was its 'Write Once, Run Anywhere' (WORA) " +
                                 "capability, allowing Java programs to run on any device with a Java Virtual Machine (JVM). This feature contributed significantly to Java's popularity. " +
                                 "Over the years, Java has evolved through various versions, introducing new features, improvements, and APIs to enhance developer productivity and " +
                                 "application performance. In 2010, Oracle Corporation acquired Sun Microsystems and took over the development and maintenance of Java. Despite changes " +
                                 "in ownership and the evolving technology landscape, Java remains one of the most widely used programming languages, powering a vast array of applications " +
                                 "across diverse domains, including enterprise software, mobile development, web applications, and embedded systems.");
                    break;


                case 4:
                    displayTopic("Features of Java",
                                 "Java is a versatile programming language known for its powerful features, which contribute to its widespread adoption and usage across various domains.\n\n" +
                                 "1. Platform Independence: Java programs are compiled into bytecode, which can be executed on any platform with the Java Virtual Machine (JVM) installed. This 'write once, run anywhere' capability makes Java highly portable.\n\n" +
                                 "2. Object-Oriented Programming (OOP): Java is designed around the OOP paradigm, facilitating modular and reusable code development. Key OOP concepts such as encapsulation, inheritance, and polymorphism are integral to Java.\n\n" +
                                 "3. Strong Type Checking: Java is statically typed, meaning variable types are checked at compile time. This helps catch type-related errors early in the development process, enhancing code reliability and maintainability.\n\n" +
                                 "4. Automatic Memory Management (Garbage Collection): Java employs automatic memory management through garbage collection, relieving developers from manual memory deallocation. This reduces the risk of memory leaks and improves application stability.\n\n" +
                                 "5. Multithreading: Java provides built-in support for multithreading, allowing concurrent execution of tasks. Multithreading enables efficient utilization of system resources and enhances application responsiveness.\n\n" +
                                 "6. Rich Standard Library: Java comes with a comprehensive standard library, known as the Java Development Kit (JDK), which includes a wide range of classes and packages for various tasks such as I/O operations, networking, database connectivity, and more. This rich set of APIs simplifies application development and accelerates time-to-market.\n\n" +
                                 "7. Security: Java places a strong emphasis on security, with features such as bytecode verification, class loaders, and a robust security manager. These mechanisms help protect against various security threats such as unauthorized access, code injection, and denial-of-service attacks.\n\n" +
                                 "8. Community Support: Java boasts a vibrant and active community of developers, contributors, and enthusiasts. This extensive community provides valuable resources, forums, libraries, and frameworks, fostering collaboration and innovation in the Java ecosystem.\n\n" +
                                 "In summary, the combination of its platform independence, OOP principles, type safety, memory management, concurrency support, rich library ecosystem, security features, and thriving community make Java a preferred choice for developing a wide range of applications, from enterprise software to mobile apps and web services.");
                    break;


                case 5:
                    displayTopic("Java Development Kit (JDK)",
                                 "The Java Development Kit (JDK) is a software development kit used for developing Java applications. " +
                                 "It includes everything you need to develop Java applications, including the Java Runtime Environment (JRE), " +
                                 "which is necessary for running Java programs. Here's a breakdown of the components included in the JDK:\n\n" +
                                 "- *Java Runtime Environment (JRE):* This is the environment in which Java programs run. It includes the Java Virtual Machine (JVM) " +
                                 "and core libraries required for executing Java bytecode.\n\n" +
                                 "- *Java Compiler (javac):* The Java compiler translates Java source code into bytecode, which is the intermediate " +
                                 "representation of Java programs that can be executed by the JVM.\n\n" +
                                 "- *Interpreter/Loader (Java):* This component loads and interprets Java bytecode generated by the compiler. It is responsible " +
                                 "for executing Java programs on the JVM.\n\n" +
                                 "- *Archiver (jar):* The Java Archiver tool is used to package Java applications and libraries into JAR (Java ARchive) files. " +
                                 "JAR files are used for distribution and deployment of Java applications.\n\n" +
                                 "- *Documentation Generator (Javadoc):* Javadoc is a tool used to generate API documentation in HTML format from Java source code. " +
                                 "It parses Java source files and generates documentation for classes, interfaces, methods, and other program elements.\n\n" +
                                 "Developers need to install the JDK to compile, debug, and run Java applications. It provides a comprehensive set of tools " +
                                 "for Java development, making it an essential component of Java development environments.");
                    break;


                case 6:
                    displayTopic("Java Virtual Machine (JVM)",
                                 "The Java Virtual Machine (JVM) is an essential component of the Java Runtime Environment (JRE), responsible for executing Java bytecode and providing a platform-independent environment for Java applications to run.\n\n" +
                                 "Key features of the JVM:\n" +
                                 "1. *Bytecode Execution*: The JVM interprets Java bytecode instructions and translates them into native machine code instructions, allowing Java programs to run on any device with a compatible JVM.\n" +
                                 "2. *Platform Independence*: Java programs compiled into bytecode can run on any platform that has a JVM installed, abstracting away hardware and operating system differences.\n" +
                                 "3. *Memory Management*: The JVM manages memory allocation and deallocation, including automatic garbage collection, which frees developers from manual memory management tasks and helps prevent memory leaks.\n" +
                                 "4. *Security*: The JVM provides a secure execution environment by enforcing bytecode verification and runtime access controls, reducing the risk of security vulnerabilities.\n" +
                                 "5. *Performance Optimization*: Modern JVM implementations include dynamic optimizations such as just-in-time (JIT) compilation, which translate frequently executed bytecode into optimized native machine code for improved performance.\n\n" +
                                 "Different implementations of the JVM are available from various vendors, each optimized for specific platforms and performance requirements. Notable JVM implementations include Oracle HotSpot, OpenJ9, and GraalVM.\n\n" +
                                 "Understanding the JVM's architecture and behavior is crucial for Java developers to write efficient and portable code.");
                    break;


                case 7:
                    displayTopic("How to Download Java",
                                 "To download Java, visit the official Oracle website or use an open-source distribution like OpenJDK. " +
                                 "Select the appropriate JDK version for your operating system, download the installer, and follow the installation instructions. " +
                                 "Ensure that you set up the JAVA_HOME environment variable to point to the installation directory after installation.\n\n" +
                                 "To set up the JAVA_HOME environment variable:\n" +
                                 "1. Right-click on 'This PC' (or 'Computer') and select 'Properties'.\n" +
                                 "2. Click on 'Advanced system settings' on the left side.\n" +
                                 "3. In the System Properties window, click on the 'Environment Variables' button.\n" +
                                 "4. In the Environment Variables window, under 'System variables', click 'New'.\n" +
                                 "5. Enter 'JAVA_HOME' as the variable name and the path to your JDK installation directory as the variable value.\n" +
                                 "6. Click 'OK' to save the changes.\n\n" +
                                 "Now, the JAVA_HOME environment variable is set up, allowing other applications to locate the Java installation directory.");
                    break;

                case 8:
                    displayTopic("Variables and Data Types",
                                 "Variables in Java are containers used to store data. " +
                                 "Java supports several primitive data types, including int, double, boolean, and char, as well as reference data types such as String. " +
                                 "Declaring variables in Java involves specifying the data type followed by the variable name, like this: int age; " +
                                 "You can assign values to variables using the assignment operator (=), and variables can be initialized at the time of declaration." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "// Integer variable\n" +
                                 "int age = 25;\n" +
                                 "System.out.println(\"Age: \" + age);\n\n" +
                                 "// Double variable\n" +
                                 "double height = 5.9;\n" +
                                 "System.out.println(\"Height: \" + height + \" feet\");\n\n" +
                                 "// Boolean variable\n" +
                                 "boolean isStudent = true;\n" +
                                 "System.out.println(\"Is a student? \" + isStudent);\n\n" +
                                 "// Character variable\n" +
                                 "char grade = 'A';\n" +
                                 "System.out.println(\"Grade: \" + grade);\n\n" +
                                 "// String variable\n" +
                                 "String name = \"John Doe\";\n" +
                                 "System.out.println(\"Name: \" + name);\n\n" +
                                 "// Multiple variables declaration\n" +
                                 "int x = 10, y = 20, z = 30;\n" +
                                 "System.out.println(\"Sum of x, y, and z: \" + (x + y + z));\n");
                    break;


                case 9:
                    displayTopic("Control Flow Statements", 
                                 "Control flow statements in Java are used to control the flow of execution in a program. " +
                                 "These statements include if-else, switch, and loop statements. " +
                                 "The if-else statement allows you to execute certain code blocks conditionally based on the evaluation of a boolean expression. " +
                                 "Switch statements provide a way to execute different code blocks based on the value of an expression. " +
                                 "Loop statements, such as for, while, and do-while loops, allow you to repeat a block of code multiple times." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "// Example of if-else statement\n" +
                                 "int x = 10;\n" +
                                 "if (x > 0) {\n" +
                                 "    System.out.println(\"x is positive\");\n" +
                                 "} else {\n" +
                                 "    System.out.println(\"x is non-positive\");\n" +
                                 "}\n\n" +
                                 "// Example of switch statement\n" +
                                 "int day = 3;\n" +
                                 "switch (day) {\n" +
                                 "    case 1:\n" +
                                 "        System.out.println(\"Monday\");\n" +
                                 "        break;\n" +
                                 "    case 2:\n" +
                                 "        System.out.println(\"Tuesday\");\n" +
                                 "        break;\n" +
                                 "    // More cases...\n" +
                                 "    default:\n" +
                                 "        System.out.println(\"Invalid day\");\n" +
                                 "}\n\n" +
                                 "// Example of loop statement\n" +
                                 "for (int i = 0; i < 5; i++) {\n" +
                                 "    System.out.println(\"Iteration \" + (i + 1));\n" +
                                 "}\n");
                    break;


                case 10:
                    displayTopic("Object-Oriented Programming (OOP)", 
                                 "Object-oriented programming (OOP) is a programming paradigm based on the concept of objects, which can contain data in the form of fields and code in the form of methods. " +
                                 "Java is a pure object-oriented programming language, which means that all code is written in the context of classes and objects. " +
                                 "Key concepts of OOP in Java include encapsulation, inheritance, polymorphism, and abstraction. " +
                                 "Encapsulation refers to the bundling of data and methods that operate on the data into a single unit, called a class. " +
                                 "Inheritance allows a class to inherit fields and methods from another class. " +
                                 "Polymorphism enables objects to be treated as instances of their parent class, allowing for more flexible and reusable code. " +
                                 "Abstraction refers to the process of hiding the implementation details of a class and only exposing the necessary features." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "// Example of Encapsulation: Creating a class with private fields and public methods\n" +
                                 "class Person {\n" +
                                 "    private String name;\n" +
                                 "    private int age;\n\n" +
                                 "    // Constructor\n" +
                                 "    public Person(String name, int age) {\n" +
                                 "        this.name = name;\n" +
                                 "        this.age = age;\n" +
                                 "    }\n\n" +
                                 "    // Getter and Setter methods\n" +
                                 "    public String getName() {\n" +
                                 "        return name;\n" +
                                 "    }\n\n" +
                                 "    public int getAge() {\n" +
                                 "        return age;\n" +
                                 "    }\n\n" +
                                 "    public void setName(String name) {\n" +
                                 "        this.name = name;\n" +
                                 "    }\n\n" +
                                 "    public void setAge(int age) {\n" +
                                 "        this.age = age;\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "// Example of Inheritance: Creating a subclass that inherits from a superclass\n" +
                                 "class Student extends Person {\n" +
                                 "    private int studentId;\n\n" +
                                 "    // Constructor\n" +
                                 "    public Student(String name, int age, int studentId) {\n" +
                                 "        super(name, age); // Call the constructor of the superclass\n" +
                                 "        this.studentId = studentId;\n" +
                                 "    }\n\n" +
                                 "    // Getter and Setter method for studentId\n" +
                                 "    public int getStudentId() {\n" +
                                 "        return studentId;\n" +
                                 "    }\n\n" +
                                 "    public void setStudentId(int studentId) {\n" +
                                 "        this.studentId = studentId;\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "// Example of Polymorphism: Treating objects of different classes through a common interface\n" +
                                 "interface Animal {\n" +
                                 "    void sound();\n" +
                                 "}\n\n" +
                                 "class Dog implements Animal {\n" +
                                 "    public void sound() {\n" +
                                 "        System.out.println(\"Woof!\");\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "class Cat implements Animal {\n" +
                                 "    public void sound() {\n" +
                                 "        System.out.println(\"Meow!\");\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "public class Main {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        // Example of Abstraction: Creating objects without knowing the implementation details\n" +
                                 "        Animal dog = new Dog();\n" +
                                 "        Animal cat = new Cat();\n\n" +
                                 "        dog.sound(); // Output: Woof!\n" +
                                 "        cat.sound(); // Output: Meow!\n" +
                                 "    }\n" +
                                 "}\n");
                    break;

                case 11:
                    displayTopic("Exception Handling", 
                                 "Exception handling in Java is a mechanism used to handle errors and exceptional situations that occur during program execution. " +
                                 "Exceptions are objects that represent errors, and they can be thrown by the Java runtime system or manually by the programmer. " +
                                 "To handle exceptions, Java provides the try-catch-finally block, which allows you to catch and handle exceptions that occur within a block of code. " +
                                 "The try block contains the code that may throw an exception, and the catch block contains the code to handle the exception. " +
                                 "The finally block is used to execute cleanup code that should always run, regardless of whether an exception occurs or not." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "public class ExceptionHandlingExample {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        try {\n" +
                                 "            // Code that may throw an exception\n" +
                                 "            int result = 10 / 0; // This will throw an ArithmeticException\n" +
                                 "        } catch (ArithmeticException e) {\n" +
                                 "            // Handle the exception\n" +
                                 "            System.out.println(\"An arithmetic exception occurred: \" + e.getMessage());\n" +
                                 "        } finally {\n" +
                                 "            // Cleanup code\n" +
                                 "            System.out.println(\"This is finally block. It always executes.\");\n" +
                                 "        }\n" +
                                 "    }\n" +
                                 "}\n" +
                                 "\n\nIn the provided example:\n" +
                                 "- We attempt to perform a division by zero, which results in an ArithmeticException being thrown.\n" +
                                 "- The catch block catches the exception and handles it by printing a message.\n" +
                                 "- The finally block contains cleanup code that will always execute, regardless of whether an exception occurs or not.");
                    break;


                case 12:
                    displayTopic("Java Collections", 
                                 "Java collections are objects that group multiple elements into a single unit. " +
                                 "The Java Collections Framework provides a set of interfaces and classes for working with collections in Java. " +
                                 "Some of the key collection interfaces in Java include List, Set, and Map. " +
                                 "Lists are ordered collections of elements, where each element has an index. " +
                                 "Sets are collections of unique elements, meaning that no duplicate elements are allowed. " +
                                 "Maps are collections of key-value pairs, where each key is associated with exactly one value. " +
                                 "Common implementations of these interfaces include ArrayList, LinkedList, HashSet, TreeSet, HashMap, and TreeMap." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "// Example of using ArrayList\n" +
                                 "import java.util.ArrayList;\n" +
                                 "import java.util.List;\n\n" +
                                 "public class Main {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        // Creating an ArrayList\n" +
                                 "        List<String> fruits = new ArrayList<>();\n" +
                                 "        // Adding elements\n" +
                                 "        fruits.add(\"Apple\");\n" +
                                 "        fruits.add(\"Banana\");\n" +
                                 "        fruits.add(\"Orange\");\n" +
                                 "        // Accessing elements\n" +
                                 "        System.out.println(\"Fruits: \" + fruits);\n" +
                                 "        // Iterating through elements\n" +
                                 "        for (String fruit : fruits) {\n" +
                                 "            System.out.println(\"Fruit: \" + fruit);\n" +
                                 "        }\n" +
                                 "    }\n" +
                                 "}\n" +
                                 "\nAdditional Information:\n" +
                                 "1. Lists allow duplicate elements and maintain the insertion order.\n" +
                                 "2. Sets do not allow duplicate elements, and their iteration order may vary.\n" +
                                 "3. Maps store key-value pairs and do not allow duplicate keys.\n" +
                                 "4. Each collection interface in Java has various implementations with different characteristics and performance trade-offs.\n");
                    break;


                case 13:
                    displayTopic("String Functions in Java",
                                 "Java provides a rich set of methods and functions to manipulate strings. " +
                                 "Strings in Java are objects of the String class, and developers can perform operations " +
                                 "such as concatenation, substring extraction, length retrieval, and more. String manipulation is a " +
                                 "common task in Java programming, and understanding these functions is essential for effective string handling." +
                                 "\n\nHere are some commonly used methods for string manipulation:\n" +
                                 "- length(): Returns the length of the string.\n" +
                                 "- charAt(index): Returns the character at the specified index.\n" +
                                 "- substring(beginIndex, endIndex): Returns a substring of the original string.\n" +
                                 "- concat(string): Concatenates the specified string to the end of the original string.\n" +
                                 "- toUpperCase(), toLowerCase(): Converts the string to uppercase or lowercase.\n" +
                                 "- trim(): Removes leading and trailing whitespaces from the string." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "String str = \"Hello, world!\";\n" +
                                 "System.out.println(\"Length of the string: \" + str.length());\n" +
                                 "System.out.println(\"Character at index 7: \" + str.charAt(7));\n" +
                                 "System.out.println(\"Substring from index 7 to end: \" + str.substring(7));\n" +
                                 "System.out.println(\"Concatenated with ' Welcome': \" + str.concat(\" Welcome\"));\n" +
                                 "System.out.println(\"Uppercase: \" + str.toUpperCase());\n" +
                                 "System.out.println(\"Lowercase: \" + str.toLowerCase());\n" +
                                 "String paddedString = \"   Hello, world!   \";\n" +
                                 "System.out.println(\"Trimmed string: '\" + paddedString.trim() + \"'\");\n");
                    break;

                case 14:
                    displayTopic("Threading in Java",
                                 "Threading is a fundamental concept in Java that allows multiple threads to run concurrently. " +
                                 "By using threads, developers can create efficient and responsive applications. Java provides " +
                                 "built-in support for threading through the java.lang.Thread class and the java.util.concurrent package. " +
                                 "Developers can synchronize threads, handle communication between them, and manage their lifecycle.\n\n" +
                                 "Threads in Java can be created by extending the Thread class or implementing the Runnable interface. " +
                                 "Using threads, you can perform time-consuming tasks in the background without blocking the main execution thread.\n\n" +
                                 "Java Sample Code:\njava\n" +
                                 "// Example of creating and starting a thread\n" +
                                 "class MyThread extends Thread {\n" +
                                 "    public void run() {\n" +
                                 "        for (int i = 1; i <= 5; i++) {\n" +
                                 "            System.out.println(\"Thread \" + Thread.currentThread().getId() + \": Count \" + i);\n" +
                                 "            try {\n" +
                                 "                Thread.sleep(1000);\n" +
                                 "            } catch (InterruptedException e) {\n" +
                                 "                System.out.println(\"Thread \" + Thread.currentThread().getId() + \" interrupted\");\n" +
                                 "            }\n" +
                                 "        }\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "public class Main {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        MyThread thread1 = new MyThread();\n" +
                                 "        MyThread thread2 = new MyThread();\n" +
                                 "        thread1.start();\n" +
                                 "        thread2.start();\n" +
                                 "    }\n" +
                                 "}\n" +
                                 "This code creates two threads (thread1 and thread2) by extending the Thread class. " +
                                 "Each thread prints numbers from 1 to 5 with a one-second delay between each count.\n");
                    break;


                case 15:
                    displayTopic("Multithreading in Java",
                                 "Multithreading in Java allows concurrent execution of two or more threads, " +
                                 "which are independent units of execution. Java provides built-in support for " +
                                 "multithreading through the java.lang.Thread class. You can create and start " +
                                 "threads either by extending the Thread class or implementing the Runnable interface. " +
                                 "Multithreading is useful for improving the performance and responsiveness of Java applications." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "// Example of creating a thread by extending the Thread class\n" +
                                 "class MyThread extends Thread {\n" +
                                 "    public void run() {\n" +
                                 "        System.out.println(\"MyThread running\");\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "public class Main {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        MyThread thread = new MyThread();\n" +
                                 "        thread.start(); // Start the thread\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "// Example of creating a thread by implementing the Runnable interface\n" +
                                 "class MyRunnable implements Runnable {\n" +
                                 "    public void run() {\n" +
                                 "        System.out.println(\"MyRunnable running\");\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "public class Main {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        Thread thread = new Thread(new MyRunnable());\n" +
                                 "        thread.start(); // Start the thread\n" +
                                 "    }\n" +
                                 "}\n" +
                                 "\n\nIn Java, multithreading is commonly used to perform tasks concurrently, such as handling multiple client requests in server applications or improving the responsiveness of user interfaces by offloading time-consuming tasks to background threads."
                                );
                    break;


                case 16:
                    displayTopic("Java Applet Viewer",
                                 "Java applets are small, dynamic Java programs that can be embedded within HTML pages and run within a web browser. " +
                                 "The Java Applet Viewer is a tool that allows developers to test and run Java applets outside " +
                                 "of a web browser environment. It provides a way to interactively debug and develop Java applets without the " +
                                 "need for a browser plugin, which has become less common in modern browsers. Developers can use the Java Applet Viewer " +
                                 "to simulate the behavior of Java applets, test their functionality, and troubleshoot any issues." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "import java.applet.Applet;\n" +
                                 "import java.awt.Graphics;\n\n" +
                                 "public class HelloWorldApplet extends Applet {\n" +
                                 "    public void paint(Graphics g) {\n" +
                                 "        g.drawString(\"Hello, World!\", 20, 20);\n" +
                                 "    }\n" +
                                 "}\n" +
                                 "\n\nTo run this applet, compile the Java code and create an HTML file containing the following code:\n" +
                                 "html\n" +
                                 "<html>\n" +
                                 "<head>\n" +
                                 "    <title>Java Applet Test</title>\n" +
                                 "</head>\n" +
                                 "<body>\n" +
                                 "    <applet code=\"HelloWorldApplet.class\" width=\"200\" height=\"200\">\n" +
                                 "        Your browser does not support Java applets.\n" +
                                 "    </applet>\n" +
                                 "</body>\n" +
                                 "</html>\n" +
                                 "\nThis HTML file can then be opened in a web browser or executed using the Java Applet Viewer to display the applet output.");
                    break;


                case 17:
                    displayTopic("Inheritance in Java", 
                                 "Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class " +
                                 "to inherit properties and behaviors from another class. In Java, a class can extend another class, " +
                                 "forming an 'is-a' relationship. This promotes code reusability and helps in creating a hierarchy of classes " +
                                 "with shared characteristics. Subclasses inherit all non-private fields and methods from their superclass. " +
                                 "Java supports single inheritance, meaning a class can only extend one superclass, but it supports multilevel " +
                                 "inheritance, where a subclass can further act as a superclass for another subclass." +
                                 "\n\nJava Sample Code:\njava\n" +
                                 "// Example of inheritance in Java\n" +
                                 "class Animal {\n" +
                                 "    void eat() {\n" +
                                 "        System.out.println(\"Animal is eating...\");\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "class Dog extends Animal {\n" +
                                 "    void bark() {\n" +
                                 "        System.out.println(\"Dog is barking...\");\n" +
                                 "    }\n" +
                                 "}\n\n" +
                                 "public class Main {\n" +
                                 "    public static void main(String[] args) {\n" +
                                 "        Dog dog = new Dog();\n" +
                                 "        dog.eat(); // Inherited from Animal\n" +
                                 "        dog.bark();\n" +
                                 "    }\n" +
                                 "}\n");
                    break;

                case 18:
                    try{
                        String name;
                        int rating;
                        System.out.println("Please Enter the user's Name:");
                        name = reader.readLine();
                        System.out.println("Please Enter Your Rating (1-10):");
                        rating = Integer.parseInt(reader.readLine());
                        recordUserRating(name, rating);
                        break;
                    }catch(IOException e){}

                case 19:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 17.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== Let's Learn Java =====");
        System.out.println("1. A note for the User!");
        System.out.println("2. Introduction to Java");
        System.out.println("3. History of Java");
        System.out.println("4. Features of Java");
        System.out.println("5. Java Development Kit (JDK)");
        System.out.println("6. Java Virtual Machine (JVM)");
        System.out.println("7. How to Download Java");
        System.out.println("8. Variables and Data Types");
        System.out.println("9. Control Flow Statements");
        System.out.println("10. Object-Oriented Programming (OOP)");
        System.out.println("11. Exception Handling");
        System.out.println("12. Java Collections");
        System.out.println("13. String Functions in Java");
        System.out.println("14. Threading in Java");
        System.out.println("15. Multithreading in Java");
        System.out.println("16. Java Applet Viewer");
        System.out.println("17. Inheritance in Java");
        System.out.println("18. Please Rate our Program! :)");
        System.out.println("19. Exit!");
        System.out.println("===========================");
    }

    private static int getUserChoice(BufferedReader reader) {
        try {
            System.out.print("Enter your choice (1-19): ");
            String input = reader.readLine();
            while (!isNumeric(input) || Integer.parseInt(input) < 1 || Integer.parseInt(input) > 19) {
                System.out.print("Invalid input. Enter a number between 1 and 19: ");
                input = reader.readLine();
            }
            return Integer.parseInt(input);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    private static void displayTopic(String title, String content) {
        System.out.println("\n===== " + title + " =====");
        System.out.println(content);
    }

     private static void recordUserRating(String name, int rating) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_ratings.txt", true))) {
            writer.newLine();
            writer.write("Name of the User:" + name);
            writer.newLine();
            writer.write("Rating:" + rating);
            writer.newLine();
            System.out.println("Thank you for rating the program!");
        } catch (IOException e) {
            System.out.println("An error occurred while recording your rating.");
            e.printStackTrace();
        }
    }
}


