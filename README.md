# Software Architecture Design Patterns :white_check_mark:
[1] Software Architecture Design Patterns according to [Partha Kuchana's book](https://github.com/lsofiadb/Software-Architecture-Design-Patterns/blob/main/Book/Partha%20Kuchana%20-%20Software%20Architecture%20Design%20Patterns%20in%20Java%20(2004).pdf).  

There are multiple design patterns that allow the handling of common problems in software development.

## Objective :telescope:

Build and comprehend design pattern implementations in Java

## *Creational Patterns* :construction:
### [Singleton](https://github.com/lsofiadb/Software-Architecture-Design-Patterns/tree/main/SingletonWithGUI) :one:
<p>Provides a controlled object creation mechanism to ensure that only one instance of a given class exists [1].</p>
<div  align="center">
<img  width="600px" src="https://github.com/lsofiadb/Software-Architecture-Design-Patterns/blob/main/Images/Singleton.jpg">
</div>

### [Factory Method](https://github.com/lsofiadb/Software-Architecture-Design-Patterns/tree/main/FactoryMethodWithGUI) :factory:
<p text-align="justify">When a client object does not know which class to instantiate, it can make use of the factory method to create an instance of an appropriate class from a class hierarchy or a family of related classes. The factory method may be designed as part of the client itself or in a separate class.
The class that contains the factory method or any of its subclasses decides on which class to select and how to instantiate it [1].</p>
<div  align="center">
<img  width="600px" src="https://github.com/lsofiadb/Software-Architecture-Design-Patterns/blob/main/Images/factoryMethod.jpg">
</div>

### [Abstract Factory](https://github.com/lsofiadb/Software-Architecture-Design-Patterns/tree/main/AbstractFactory) :department_store::european_post_office::city_sunrise:
<p>Abstract Factory is used to create groups of related objects while hiding the actual concrete classes. This is useful for plugging in a different group of objects to alter the behavior of the system. For each group or family, a concrete factory is implemented that manages the creation of the objects and the interdependencies and consistency requirements between them. Each concrete factory implements the interface of the abstract factory [1].  </p>
<div  align="center">
<img  width="600px" src="https://github.com/lsofiadb/Software-Architecture-Design-Patterns/blob/main/Images/abstractFactory.jpg">
</div>
