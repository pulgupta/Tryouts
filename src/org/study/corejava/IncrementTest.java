package org.study.corejava;

public class IncrementTest {
    public static void main(String args[]) 
    {
        int array_variable [] = new int[10];
        //The execution of the for loop works in a particular way
        //Check condition
        //if success execute the body else terminate
        //increment the counter
    for (int i = 0; i < 10; ++i) {
            array_variable[i] = i;
            System.out.print(array_variable[i] + " ");
            //i++;
        }
    } 
}
