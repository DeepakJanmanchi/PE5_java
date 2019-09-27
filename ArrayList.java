// Java program to demonstrate working of ArrayList in Java
import java.io.*;
import java.util.*;

class ArrayList
{
    public static void main(String[] args)
            throws IOException
    {
        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<String> arrli = new ArrayList<String>(n);

        // Appending the new element at the end of the list
        arrli.add("Apple");
        arrli.add("Banana");
        arrli.add("Capsicum");
        arrli.add("Donkey");
        arrli.set(2,"Cat");
        System.out.println(arrli);
        arrli.clear();
        System.out.println(arrli);




    }
}
