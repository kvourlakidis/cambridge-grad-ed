// Question: Which of the following are true? (Choose all that apply)

1. Package private access is more lenient than protected access. // false

2. A public class that has private fields and package private methods is not visible to classes outside the package. // false

public class Class
{
    private int variable;

    void method()
    {
    }
}

3. You can use access modifiers so only some of the classes in a package see a particular package private class. // false

4. You can use access modifiers to allow read access to all methods, but not any instance variables. // true

5. You can use access modifiers to restrict read access to all classes that begin with the word Test. // false
