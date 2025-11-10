In dieser Aufgabe erstellen wir Wertetabellen für verschiedene Funktionen. Dabei erfassen wir die x-Werte und die zugehörigen y-Werte.

Für die Funktion f(x) = x^2 sieht es etwa so aus:  
| 1   | 1    |  
| 1.5 | 2.25 |  
| 2   | 4    |  
| 2.5 | 5.75 |  
| 3   | 3    |  

Dazu wird zunächst durch Start- und Endwert sowie Schrittgröße ein Bereich für die x-Werte definiert:

0, 10, 1 -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9  
5, 6, 0.3 -> 5.0, 5.3, 5.9  
4, 2, -1 -> 4, 3  
4, 2, 1 -> Nicht valide  

Überlege dir nun welche Kombinationen valide sind.

### 1. isValidRange
Implementiere die Methode isValidRange in der Klasse Main.


Wir möchten nun eine eigene Exception erstellen, die ausgelöst werden kann, wenn ungültige Bereiche definiert werden.
### 2. InvalidRangeException
Erstelle die Klasse InvalidRangeException. Der Konstruktor nimmt drei doubles als Parameter und die protected Felder start, end und step sollen initialisiert werden.

### 3. toString
Implementiere die Methode toStringin der Klasse InvalidRangeException. Sie gibt Invalid⎵range⎵(start,⎵end,⎵step) als String zurück.

### Beispiel
```java System.out.println(new InvalidRangeException(5, 4, 3)); ``` printet `Invalid range (5.0, 4.0, 3.0)`.

### 4. showTable
Implementiere die Methode showTable in der Klasse Main. Diese Methode erhält den Start- bzw. Endwert sowie die Schrittgröße als double-Werte und zusätzlich eine Funktion als Parameter. Die Methode soll für die gegebenen Intervalle überprüfen, ob sie gültig sind. Falls ja, soll die als Parameter übergebene Funktion auf die Werte in diesem Intervall angewendet werden. Überlege dir, wie du ungültige Bereiche behandeln kannst.

Dabei soll dein Output wie folgt aussehen:
### Beispiel:
```java showTable(1, 5, 1, x -> x * x);```  
1.0 1.0  
2.0 4.0   
3.0 9.0    
4.0 16.0  
