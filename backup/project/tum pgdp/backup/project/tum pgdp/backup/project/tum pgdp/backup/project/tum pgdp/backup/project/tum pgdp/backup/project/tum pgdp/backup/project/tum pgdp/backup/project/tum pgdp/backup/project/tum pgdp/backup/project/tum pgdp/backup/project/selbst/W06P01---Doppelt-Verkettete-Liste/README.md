# Doppelt Verkettete Liste

Doppelt verkettete Integer-Listen bestehen aus einer Kette von Elementen. Im Gegensatz zur einfach verketteten Liste von letzter Woche hat jedes Element neben der Referenz auf den Nachfolger (next) zusätzlich eine Referenz auf den Vorgänger (prev) (und natürlich den im Element gespeicherten int). Das letzte Element hat null als Nachfolger, das erste null als Vorgänger.

# Klassen, Attribute und Methoden
Zuerst muss du die benötigten Klassen mit ihren Attriubten implementieren. Anschließend bietet es sich an, schonmal alle geforderten (leere) Methoden in die Klassen zu schreiben.  

- ### Klasse `DoublyLinkedListElement`
Erstellen eine Klasse DoublyLinkedListElement, welche ein Listenelement repräsentiert.
Implementiere einen passenden Konstruktor, der die Attribute private info, public next und public prev initialisiert.

- ### Klasse `DoublyLinkedList`
Implementiere eine Klasse DoublyLinkedList, welche eine Folge von Listenelementen repräsentiert. Dazu verfügt sie über eine Referenz auf das erste (head) und letzte (tail) Element der Liste. Die Listenelemente sollen nach außen hin nicht sichtbar sein!

# Methoden Implementierungen
Alle Methoden sollen in der Klasse DoublyLinkedList implementiert werden und public sein. Du darfst der Klasse dafür private Hilfsmethoden hinzufügen. Ebenso darfst du die Klasse DoublyLinkedListElement um weitere Methoden (public und private) erweitern.
- ### append
Implementiere die Methode void append(int), die ein neues Listenelement mit der übergebenen Zahl als info am Ende der aktuellen Liste anfügt.

- ### size
Implementiere die Methode int size(), die die Anzahl der Elemente der Liste zurückgibt. Da diese Methode häufiger gebraucht wird, sollte sie das Ergebnis zurückliefern, ohne alle Elemente durchzuzählen. Es ist also ratsam, sich dieses auch als privates Attribut der Liste zu merken.


Hinweis für get und remove: Man verwendet Listen gerade dann, wenn ein Zugriff über einen Index selten nötig ist, da Arrays für diese Art von Zugriff weitaus effizienter sind. Überlege dir eine sinnvolle Reaktion, falls die übergebene Position ungültig ist. Vermeide unkontrollierte Abstürze!

- ### get
Implementiere die Methode int get(int), die den info-Wert des Elements an der übergebenen Position (natürlich 0-indexiert) zurückgibt. 

- ### remove
Implementiere die Methode void remove(int), die das Element an der übergebenen Position aus der Liste entfernt. Nach dem Entfernen muss die Listeneigenschaft wiederhergestellt sein.

- ### toString
Implementiere die Methode String toString(), die alle Elemente der Liste getrennt durch ein Komma ',' als String zurückgibt, also z.B. "1,2,3".
Hinweis: Konkatenation von Strings mit + ist sehr ineffizient, wenn man (wie bei dieser Liste) möglicherweise sehr viele Strings konkateniert. Für solche Zwecke dient die Klasse StringBuilder mit den Methoden append (fügt etwas an die momentan gespeicherte Zeichenkette an) und toString() (Wandelt die gespeicherte Zeichenkette in einen String um). Nutze für diese Aufgabe einen StringBuilder!

- ### appendList
Implementiere die Methode void appendList(DoublyLinkedList), die die Elemente der übergebenen Listen in gleicher Reihenfolge an die aktuelle Liste anhängt. Dabei sollen die Elemente der anderen Liste weiterverwendet werden und keine neuen Elemente angelegt werden.

- ### isEqual
Implementiere die Methode boolean isEqual(DoublyLinkedList). Zwei Listen gelten als gleich, wenn ihre Elemente die gleichen Werte in der gleichen Reihenfolge beinhalten.

- ### sum
Implementiere die Methode int sum(), die die Summe aller Listenelemente zurückgibt.

- ### copy
Implementiere die Methode DoublyLinkedList copy(), die die Liste kopiert und die Kopie zurückgibt.
