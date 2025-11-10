# Grundlegende Array-Methoden  
In dieser Aufgabe sollen einige Funktionen auf Arrays implementiert werden. Verwende dabei keine Methoden aus der Java-Bibliothek (außer der folgenden). 
Nutze zur Ausgabe die Methode System.out.print(). Gebe also keine Newlines aus. Implementiere die folgenden Methoden:

### Ausgeben  
public static void print(int[] a) - gibt das Array auf der Konsole aus. Das Array soll mit einer öffnenden geschweiften Klammer beginnen und mit einer schließenden geschweiften Klammer enden. Die einzelnen Elemente des Arrays sollen durch ein Komma und ein Leerzeichen getrennt sein.
Beispiel: print(new int[] {1, 2, 3, 4, 5}) liefert auf der Konsole die Ausgabe "{1,⎵2,⎵3,⎵4,⎵5}".

### Minimum und Maximum   
public static void minAndMax(int[] a) - gibt das Minimum und Maximum des Arrays auf der Konsole aus. Das Array soll in der Methode nur einmal durchlaufen werden. (Dies wird in den Unit-Tests nicht überprüft!)  
Beispiel: minAndMax(new int[] {1, 10, 25, -13, 1000}) liefert auf der Konsole die Ausgabe "Minimum⎵=⎵-13,⎵Maximum⎵=⎵1000".

### Aufsteigende Sortiertheit  
public static boolean isOrderedAscendingly(int[] a) - überprüft, ob das übergebene Array aufsteigend sortiert ist. Mehrere aufeinanderfolgende gleiche Einträge sind dabei in Ordnung. Folgende Arrays gelten beispielsweise als aufsteigend sortiert:  
{1, 2, 3, 4, 5}  
{-1, -1, 3, 4, 4, 5, 5, 5, 19}  
{1, 1, 1, 1, 1}  
{}

Folgende Arrays gelten als nicht aufsteigend sortiert:  
{1, 2, -3, 4, 5}  
{1, 2, 3, 2, 3, 4}  
{1, 1, 1, 1, 2, 1, 1}  

Es soll genau dann true zurückgegeben werden, wenn das übergebene Array aufsteigend sortiert ist und genau dann false, wenn nicht.

### Invertieren  
public static void invert(int[] a) - invertiert die Elemente von a, sodass sie in umgekehrter Reihenfolge sind. Da kein Rückgabewert erwartet wird, muss das ganze in-place, also im Array selber passieren. 
Beispiel: invert(new int[] {0, 1, 2, 3}) invertiert das Array zu {3, 2, 1, 0}.

### Größenänderung  
public static int[] resize(int[] a, int length) - gibt ein neues Array zurück, welches Platz für genau length Elemente hat und die Elemente vom Array a in der gleichen Reihenfolge und so viele wie möglich enthält. Sollte das zurückgegebene Feld größer sein als das übergebene, sollen die zusätzlichen Positionen den Wert 0 haben. Sollte length <= 0 sein, so soll ein leeres Array zurückgegeben werden.  
Beispiel: resize(new int[] {1, 2, 3}, 2) liefert ein Array {1, 2} und resize(new int[] {1, 2, 3}, 5) liefert ein Array {1, 2, 3, 0, 0}.

### Nur die Geraden
public static int[] filterEvenNumbersFrom(int[] a) - soll ein neues Array erzeugen und zurückgeben, welches nur die geradzahligen Einträge von a enthält. Diese sollen aber alle (also auch Duplikate) und in der gleichen Reihenfolge vorhanden sein. Die Länge des Ausgabe-Arrays muss natürlich entsprechend angepasst werden. Hier ein Paar Beispiele:  

Aus {1, 2, 2, 1, 3, 4, 5, 6} soll {2, 2, 4, 6} werden.  
Aus {-2, -4, 0, 1, -1, 3, 5, 4} soll {-2, -4, 0, 4} werden.  
Aus {1, 3, 5, 7, 9} soll {} werden.  
