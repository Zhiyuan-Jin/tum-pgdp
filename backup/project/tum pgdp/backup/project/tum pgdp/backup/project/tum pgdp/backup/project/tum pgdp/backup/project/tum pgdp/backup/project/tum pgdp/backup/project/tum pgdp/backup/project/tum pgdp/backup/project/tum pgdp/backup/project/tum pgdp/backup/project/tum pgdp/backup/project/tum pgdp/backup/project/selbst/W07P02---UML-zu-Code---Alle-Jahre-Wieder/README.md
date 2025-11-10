# Alle Jahre Wieder

Prismen oder Zylinder sind geometrische Körper, die durch Parallelverschiebung ihrer Grundfläche im Raum entstehen.

Prismen sind durch ihre Höhe und ihre jeweilige Grundfläche bestimmt. Als Grundflächen in Frage kommen (zum Beispiel):
- regelmäßige n-Ecke, bestimmt durch die Anzahl der Ecken und die Seitenlänge
- Kreise, bestimmt durch ihren Radius
- Rechtecke, bestimmt durch Breite und Höhe

An Operationen muss eine Grundfläche die Berechnung von Umfang und Flächeninhalt zur Verfügung stellen, ein Prisma die Berechnung von Oberfläche und Volumen. Das alles wird in folgendem UML-Diagramm zusammengefasst (Getter und Setter wurden der Übersichtlichkeit halber weggelassen, füge sie nach Bedarf hinzu):
(Siehe Bild)

Dabei soll die Methode toSquare() ein Quadrat gleicher Seitenlänge zurückgeben, falls die Fläche ein Quadrat ist und null, falls die Fläche kein Quadrat ist. Dies ist relevant für die Klasse Rectangle, da diese implizit ein Quadrat darstellen kann, wenn Breite und Höhe gleich sind.

In dieser Aufgabe soll eine Klassenhierarchie für diese geometrischen Körper in Java implementiert werden.

Gehen Sie wie folgt vor:
- Implementiere alle angegebenen Klassen und Methoden außer Prism! Überschreibe die Methoden von BaseArea in den jeweiligen Unterklassen! Vergiss nicht, geeignete Getter und Setter hinzuzufügen!
- Implementiere zuletzt die Klasse Prism!
 
Hinweis 1: Die Fläche eines regelmäßigen n-Ecks mit Seitenlänge a ist (n * a^2) / (4 * tan(n/Math.PI)).  
Hinweis 2: Die Konstante Math.PI und die Methode Math.tan (Siehe Math) sind möglicherweise hilfreich. 
