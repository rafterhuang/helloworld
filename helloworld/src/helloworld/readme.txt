20190115:
There are three distinct meanings for the final keyword in Java.

    A final class cannot be extended.

    A final method cannot be overridden.

    A final variable cannot be assigned to after it has been initialized.


1.Local Variables
2.Instance Variables: Instance variables are non-static variables and are declared in a class 
outside any method, constructor or block. As instance variables are declared in a class, these 
variables are created when an object of the class is created and destroyed when the object is 
destroyed.
3.Static Variables: To access static variables, we need not to create any object of that class, 
we can simply access the variable as: class_name.variable_name. Each object has its own copy of 
variable, but static variable can only have one copy.

Modifier      Package  Subclass  World
public          Yes      Yes     Yes
protected       Yes      Yes     No
Default (no
modifier)       Yes       No     No
private         No        No     No

Loop Variables (Block Scope)
A variable declared inside pair of brackets ¡°{¡± and ¡°}¡± in a method has scope withing the brackets only.
        { 
            // The variable x has scope within 
            // brackets 
            int x = 10; 
            System.out.println(x); 
        } 

