# JAVA-Documentation
This has examples and important pointers regarding JAVA basic concepts

- [Abstract Classes and Methods](Abstract-methods/ABSTRACT.md)
- [Interface](Interface/INTERFACE.md)
- [Inheritance](Inheritance/INHERITANCE.md)
- [Annotations](https://data-flair.training/blogs/java-annotations/)
- [Generics]
- [Exceptions Classes]
- [Basic I\O]
- [Concurrency]
- [Regular Expressions]
- [Collections and Maps]

### Other Miscellaneous Pointers:

##### Design Patterns
- [Singleton Pattern](https://springframework.guru/gang-of-four-design-patterns/singleton-design-pattern/)

##### Object

##### Final 

### Useful Links:
- [Java Basic Concepts](https://docs.oracle.com/javase/tutorial/java/index.html)
- [Java Misc Concepts](https://data-flair.training/blogs/java-annotations/)


### Other important terminologies in Java World:

- Servlet: These are java programs that process the request obtained from the web server, process the request, and send the response back to the web server. [Click here for more info](https://www.geeksforgeeks.org/introduction-java-servlets/)

- JSP: (Java server pages)  A JSP page is a text-based document that contains two types of text: static data (which can be expressed in any text-based format such as HTML, WML, and XML) and JSP elements, which determine how the page constructs dynamic content.

- Apache Tomcat: It is a web server and a servlet/JSP container. 

- Difference betweeen Apache and Tomcat: Apache Tomcat is used to deploy your java servlet and JSP. In Java project you can build your war file and drop it in deploy directory of Tomcat. So basically Apache is an http server serving http, while tomcat is servlet and jsp serving java technology.

- Package: It is a mechanism in Java to encapsulate the classes, subpackages and interfaces. If a package name is college.staff.cse, then there are three directories, college, staff and cse such that cse is present in staff and staff is present in college. Also, the directory college is accessible through CLASSPATH variable.This makes sure that the classes are easy to locate. Packages are named in reverse order of domain names, i.e., org.geeksforgeeks.practice. For example, in a college, the recommended convention is college.tech.cse, college.tech.ee, college.art.history, etc.

- Examples of Built-In Packages:
  1) java.lang: Contains language support classes (e.g classed which defines primitive data types, math operations). This package is automatically imported.
  2)  java.io: Contains classed for supporting input / output operations.
  3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date/Time operations.
  4)  java.applet: Contains classes for creating Applets.
  5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
  6)  java.net: Contain classes for supporting networking operations.
  
- User defined package: These are the packages that are defined by the user. First we create a directory myPackage (name should be same as the name of the package). Then create the MyClass inside the directory with the first statement being the package names.

- Classpath: It is an environment variable, which lets know JVM where to find the classes from a package. The directories and jars path is stored in classpath variable. Example: Let’s say the above package resides in the directory dir. The complete path of the Menu class file would be dir/org/company/Menu. We’ll specify only the directory dir in our classpath variable, as rest information regarding the path is provided by the import statements.

- JDK: JDK (Java developmnet kit) is the software development environment used to develop JAVA applications. Along with JRE, it includes Java interpretor, compiler, and other development tools. 

- JRE: Java runtime environment is where your java apps run. It consists of core classes, JVM and support files.

- JVM: Java Virtual Machine is responsible for executing your java program line by line and is also known as interpretor

- Difference between applet and application: applet is a small Java program which is added in the html page and runs on the browser. Application is a stand alone Java program which runs as an application. Both need JVM.

- jar files: The .jar files contain libraries, resources and accessories files like property files. It is basically a zip file.

- war files: The war file contains the web application that can be deployed on any servlet/jsp container. The .war file contains jsp, html, javascript and other files necessary for the development of web applications.




