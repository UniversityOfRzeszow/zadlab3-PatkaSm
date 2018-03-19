/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.*;

/**
 *
 * @author Asia
 */
public class Main {
   
 private static void Zad1( int x, int y) {
     int LzZ,PzZ,PbZ;
     System.out.println("Liczba x w systemie binarnym: " + Integer.toBinaryString(x) );
     LzZ = x << y;
     System.out.println("\n Po przesunięciu w lewo ze znakiem <<: "+ LzZ);
     System.out.println("\n Po przesunięciu w lewo ze znakiem << binarnie : " + Integer.toBinaryString(LzZ));
     PzZ = x >> y;
     System.out.println("Po przesunięciu w prawo: " + PzZ);
     System.out.println("\n Po przesunięciu w prawo ze znakem >> binarnie : " + Integer.toBinaryString(PzZ));
     PbZ = x >>> y;
     System.out.println("Po przesunięciu bez znaku >>>: " + PbZ);
     System.out.println("\n Po przesunięciu w prawo bez znakem >> binarnie : " + Integer.toBinaryString(PbZ));
 }  
 private static void Zad2(){
     System.out.println("NOT neguje wartość, np:");
     boolean x = true;
     boolean y = false;
     boolean z = true;
     System.out.println(" x = "+x);
     System.out.println(" Not x = " + !x);
     System.out.println("XOR zwraca 1, gdy wartości obu zmenych są różne, np: ");
     System.out.println("x = " +x);
     System.out.println("y= " +y);
     System.out.println("z= " +z);
     if(x^y || z^y){
         System.out.println("X Xor Y lub Z Xor y - Zwrócona zostanie 1");
     }
     System.out.println("X Xor Z lub X Xor !Y - Zwrócone zostanie 0");
     
 }
 private static int Iteracyjnie(int x, int y){
    int wynik=1;
    int n=0;
    while(n<y){
        wynik*=x;
        n++;
    }
     return wynik;
     
 }
 private static int Rekurencyjnie(int x, int y){
     int wynik;
     if ( y == 1) 
         return x;
     else wynik = Rekurencyjnie(x, y - 1);
     return x*wynik;
     
 }
 private static double Fibo(int n){
     if ((n==1)||(n==2))
    return 1;
    else
    return Fibo(n-1)+Fibo(n-2);
}
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
    int i,j,n;
   Scanner input = new Scanner(System.in);
   do{
   System.out.println("Wybierz zadanie: 1. Operatory <<, >>, >>>. \n 2. Operacje logiczne NOT i XOR \n 3. Metody - opis i działanie \n 4. Potęgowanie iteracyjne \n 5. Potęgowanie rekurencyjne \n 6. Wyznaczanie podanego wyrazu ciągu Fibonacciego. \n 7. Wyjście z menu");
   n = input.nextInt();
   switch(n){
       case 1: 
           System.out.println("Podaj liczbę oraz przesunięcie: ");
           i = input.nextInt();
           j = input.nextInt();
           Zad1(i,j); break;
       case 2: Zad2(); break;
       case 3:
        System.out.println("char[] toCharArray() Kopiuje łańcuch jako tablicę znaków char ");
    	String pierwszy = "Lubie koty";
        String drugi = "Lubie słonie";
        String trzeci = "lubie koty";
        String czwarty = "Lubie koty";
        String piaty = "      Bardzo Lubie koty          ";
        
        System.out.print("Wartość zwracana: " );
        System.out.println( pierwszy.toCharArray() );
        System.out.println("byte[] getBytes() Metoda zamienia stringa na tablicę bajtów." );
        System.out.println(pierwszy.getBytes());
        System.out.println("boolean equals(String str) porównanie 2 stringów ");
        System.out.println("Czy są takie same: " +  pierwszy.equals(drugi));
        System.out.println("boolean equalsIgnoreCase(String str)Porównanie 2 stringów bez względu na wielkość liter" );
        System.out.println("Czy wysrazy pierwszy i drugi sa takie same: " + pierwszy.equalsIgnoreCase(trzeci));
	System.out.println("int campareTo(String str) Ta metoda porównuje ciąg znakow do innego obiektu.");
        System.out.println("Ilość różniących się znaków" + pierwszy.compareTo( czwarty ) );
        System.out.println("Ilość różniących się znaków: "+ pierwszy.compareTo( trzeci ));
        System.out.println("");
        System.out.println("int compareToIgnoreCase(String str) Porównuje ciąg znaków do innego ciągu znaków bez względu na wielkość liter");
        System.out.println(pierwszy.compareToIgnoreCase(trzeci));
        System.out.println("int indexOf() Wyszukuje określony obiekt i zwraca indeks jego pierwszego wystąpienia");
        System.out.println(pierwszy.indexOf('b'));
        System.out.println("int lastIndexOf()) Wyszukuje określony obiekt i zwraca indeks jego ostatniego wystąpienia");
        System.out.println(drugi.lastIndexOf('e'));
        System.out.println("String substring(int startString) Metoda zwraca część ciągu znaku zaczynającego się od indeksu startString, możemy także określić indeks końcowy stopString. ");
        System.out.println(pierwszy.substring(3));
        System.out.println(pierwszy.substring(1, 4));
        System.out.println("String replace(char orginal, char zamiennik) Metoda zastępuje wszystkie wystąpienia jednego znaku na inny znak i zwraca zmieniony ciąg znaków. ");
        System.out.println(drugi.replace('e', 'd'));
        System.out.println("String trim()  Usuwa początkowe i końcowe białe znaki i zwraca poprawiony ciąg znaków. ");
        System.out.println(piaty.trim());
        System.out.println("String toLowerCase() Zmienia wszystkie duże litery tekstu na małe. ");
        System.out.println(drugi.toLowerCase());
        System.out.println("String toUpperCase() Zmienia wszystkie małe litery tekstu na duże.");
        System.out.println(trzeci.toUpperCase());
        System.out.println("String[] split(String regex, int limit) Metoda split na podstawie wyrażenia regularnego rozbija ciąg znaków na fragmenty, argument: limit ogranicza długość wynikowej tablicy");
        String[] podzielone = piaty.split("Lubie");
        String pierwsze = podzielone[0];
        String drugie = podzielone[1];
        System.out.println("Pierwsza część zdania: " + pierwsze);
        System.out.println("Druga część zdania: " + drugie); break;
       case 4:
           System.out.println("Podaj liczbę: ");
           j = input.nextInt();
           System.out.println("Podaj wykładnk: ");
           i = input.nextInt();
           System.out.println("Wynik potęgowania: " + Iteracyjnie(j,i)); break;
       case 5:
           int wynik;
           System.out.println("Podaj liczbę: ");
           j = input.nextInt();
           System.out.println("Podaj wykładnk: ");
           i = input.nextInt();
           System.out.println("Wynik potęgowania: " + Rekurencyjnie(j,i) ); break;
       case 6: 
           System.out.println("Podaj który wyraz ciągu chcesz uzyskać: ");
           j = input.nextInt();
           System.out.println("Podany wyraz ciągu Fibonacciego wynosi: " + Fibo(j)); break;
       case 7: break;
   }

    }
    while( n != 7);
   }
  
    
}
