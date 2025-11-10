# Heads and Tails
Unsere erfolgreiche Zusammenarbeit mit den Forschungs-Pinguinen hat dazu geführt, dass die Pinguine eine Zweigstelle PUM (die Pingu-Universität München) eröffnet haben. Durch die Kooperation mit der TUM entdecken sie nun immer mehr Teilgebiete der Informatik. Die kürzlich gegründete Fakultät für Pingu Algorithms and Datastructures möchte zur Eröffnungszeremonie die erste Implementierung einer Liste präsentieren. Du hilfst ihnen bei der Entwicklung!

## Element
Wie du weißt, kann man sich eine Liste wie eine Kette vorstellen. Viele Implementierungen nutzen dafür Arrays. Wir wollen jedoch unser Wissen zur OOP nutzen. Daher Modellieren wir unsere Liste durch einzelne Elemente (einzelnes Ketten-Segment) und bilden eine Kette durch das aneinander hängen der einzelnen Elemente. Jedes Element speichert dabei einen entsprechenden ganzzahligen Wert der Liste im privaten Attribut value und seinen Nachfolger im privaten Attribut next. Implementiere nun die beiden fehlenden Konstruktoren der inneren Klasse List.Element.

### 1. Element - Konstruktor 1  
Konstruktor 1: Der erste Konstruktor initialisiert ein Element ohne Nachfolger. Er bekommt ausschließlich eine Ganzzahl übergeben. Diese soll als value des Elements gespeichert werden. Da kein Nachfolger bekannt ist, muss die Referenz next auf null gesetzt werden.

### 2. Element - Konstruktor 2  
Der zweite Konstruktor initialisiert ein Element dessen Nachfolger bekannt ist. Er bekommt eine Ganzzahl und die Referenz zu seinem Nachfolger übergeben. value und next müssen dementsprechend passend zugewiesen werden.

## List
Da lose Elemente für andere Entwickler nicht benutzerfreundlich sind, versteckt die Implementierung die Klasse Element im inneren. Ein Nutzer kann so auf der Liste einfach Operationen ausführen, ohne dass ihm oder ihr bewusst sein muss, wie genau du diese komplexe Datenstruktur implementiert hast. Zusätzlich kannst du auch im nachhinein Änderungen vornehmen, ohne dass ein anderer Entwickler davon beeinflusst wird, solange das Verhalten identisch bleibt. Unsere List hat drei private Objektattribute: size welches immer die aktuelle Länge der Liste speichert, head als Referenz zum ersten Element der Liste und tail als Referenz zum letzten Element der Liste. Ist die Liste leer zeigen die Referenzen auf null. Implementiere nun die fehlenden Code-stellen in der Klasse List.

### 3. List - Konstruktor  
Konstruktor: Der Konstruktor von List erstellt eine Leere liste. Eins fällt dir bestimmt jetzt schon auf: Obwohl im Template kein einziges Statement im Konstruktor steht, schlägt der entsprechende Test nicht fehl? Woran liegt das? Diskutiere dies mit deinen Kommilitonen/innen und dem Tutor.

### 4. isEmpty  
isEmpty soll zurückgeben, ob die Liste aktuell leer ist. Wenn ja gibt sie den Boolean true zurück, ansonsten false.

### 5. clear  
clear soll die Liste unabhängig von den aktuell gespeicherten Daten leeren. D.h. nach einem Aufruf von clear soll die Datenstruktur danach alle Eigenschaften einer leeren Liste erfüllen. Achte dabei auf die zuvor beschriebenen Kriterien.

### 6. add 1  
add(int element) soll den übergebenen int an das Ende der Liste anhängen. Hier siehst du auch wieso die Referenz tail so hilfreich ist. Eine Diskussion mit deinen Nachbarn oder dem Tutor ist hier bestimmt sinnvoll. Überlegt euch welche Nachteile eine Implementierung ohne tail hätte.

### 7. add 2  
add(int index, int element) fügt ein neues Element mit dem Wert element an der Stelle index ein. Unsere Liste beginnt dabei bei Index 0, d.h. möchte man eine Zahl ganz am Anfang der Liste einfügen nutzt man den Index 0, um eine Zahl nach der ersten Zahl einzufügen, nutzt man Index 1, ... . Eine Zahl ganz an das Ende der Liste anzuhängen ist auch erlaubt (Welcher Index wird hierfür benutzt?). War das Einfügen der neuen Zahl erfolgreich, gibt die Methode true zurück, andernfalls false.

### 8. get  
Mit get soll der Wert des durch den index spezifizierten Elements zurückgegeben werden. Existiert solch ein Element nicht, geben wird der Defaul-Wert -2147483648 zurück. Weiterhin beginnt unsere Liste mit dem Index 0.

### 9. remove  
Um auch Einträge aus der Liste entfernen zu können implementieren wir zuletzt die Methode remove. Diese soll das Element an der Stelle index aus der Datenstruktur entfernen. Weiterhin beginnt unsere Liste mit dem Index 0. Negative Eingaben für index sollen kein Element entfernen.

Viel Erfolg!
