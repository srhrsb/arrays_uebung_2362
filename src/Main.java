import java.io.IO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //ToDo: Geben Sie alle Werte von Numbers aus, ausser
        //  den 2. Wert
        int[] numbers = {3,4,5,6};

        for (int i=0; i < numbers.length; i++){
            if(i!=1){
               IO.println(numbers[i]);
            }
        }

        //ToDo: Weisen Sie jedem index mit dem Wert 4 , den
        //  neuen Wert 3 zu, d.h. das Array soll verändert werden
        //  nicht nur die Ausgabe

        int[] numbers2 = {3,4,5,6};

        for (int i=0; i < numbers2.length; i++){
            if(numbers2[i] == 4){
                numbers2[i] = 3;
            }
        }

        //ToDo: Alle Werte von numbers2 via for-Schleife
        //  ausgeben
        for (int i=0; i < numbers2.length; i++){
            IO.println(numbers2[i]);
        }

        //ToDo: Legen Sie ein Array names mit 3 Namen an.
        //  Durchlaufen Sie names und ändern Sie alle Namen
        //  in Großschreibweise ( Tipp: toUpperCase() )

        String[] names = {"Uwe", "Ines", "Svenja"};

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }

        for (int i=0; i < names.length; i++){
            IO.println(names[i]);
        }
    }
}