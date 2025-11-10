In dieser Aufgabe wollen wir Objekte in Dateien speichern und wieder laden.

Es geht natürlich um Objekte der Klasse Penguin, genauer handelt es sich dabei um Records. Gespeichert werden sie mithilfe der Klasse PenguinRepository, die das Interface Repository Penguin implementiert.

### 1. Speichern
Implementiere die Methode save(Penguin p, String filename) in der Klasse PenguinRepository. Sie soll den Namen, Alter und Gewicht vom Penguin jeweils in einer Zeile speichern.

**Beispiel** 
```java Penguin p = new Penguin("Tux", 10, 20.0); PenguinRepository pr = new PenguinRepository(); pr.save(p, "tux.txt"); ```  
tux.txt

Tux  
10  
20.0  

### 2. Laden
Implementiere die Methode load(String filename) in der Klasse PenguinRepository. Sie soll aus einer mit save erzeugten Datei einen Penguin laden.

