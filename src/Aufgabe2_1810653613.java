import javax.swing.*;

public class Aufgabe2_1810653613
{
    public static void main(String[] args)
    {
    printAge(21);
    for(int x=0; x<5;x++)
    {
        printName();
        printAge(21+x);
    }



    for(int i=0; i<5;i+=2)
        /* Wählt man i+=2 so wird i nach durchlauf der schleife +2 gerechnet anstatt wie bei i++ wird i +1 gerechnet
     bei i++ wird bei gleichem Code die Methode 3 mal ausgeführt im gegensatz zu den 2 mal bei i+=2 */
    {
     printName();
    }
    }

    public static void printName()
    {
        System.out.println("Max Joachimstaller");
    }

    public static void printAge(int age)
    {
        System.out.println(age);
    }

}
