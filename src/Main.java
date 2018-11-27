import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
     String Eingabe=JOptionPane.showInputDialog("Bitte geben sie etwas ein");
     switch( Eingabe)
     {
         case "20":
             int Zahl=Integer.parseInt(Eingabe);
             int Rechenoperaton= Zahl * 21 ;
             JOptionPane.showMessageDialog(null,Rechenoperaton);
             break;

         case "Peter Pan":
             JOptionPane.showMessageDialog(null,"Bangarang");
             break;

         default: System.err.println("Keiner der geplanten Fälle tritt ein");
     }




    }
}
