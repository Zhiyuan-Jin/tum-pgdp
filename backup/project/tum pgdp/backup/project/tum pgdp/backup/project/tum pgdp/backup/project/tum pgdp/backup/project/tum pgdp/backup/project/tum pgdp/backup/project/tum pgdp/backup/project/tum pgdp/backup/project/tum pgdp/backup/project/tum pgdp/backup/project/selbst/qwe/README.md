# Funktionen
Fülle in der Klasse Functions die leeren Funktionen nach folgenden Beschreibungen aus!

## Funktionen Hoch Drei 
Ergänze die Funktion cube() so, dass sie die übergebene Zahl hoch 3 nimmt und das Ergebnis zurückgibt. 
Der Aufruf cube(2) soll also beispielsweise 8 zurückgeben, der Aufruf cube(-5) soll -125 zurückgeben.

## Eine ganz Durchschnittliche Funktion
Ergänze die Funktion average() so, dass sie den Durchschnitt der übergebenen drei Zahlen a, b und c berechnet. 
Du darfst dabei davon ausgehen, dass der Durchschnitt immer eine ganze Zahl ist. 
D.h. Tripel, bei denen der Durchschnitt keine ganze Zahl ist wie z.B. a = 1, b = 2 und c = 4 - hier wäre der Durchschnitt 2.33333 ... - werden in unseren Tests nicht übergeben.

## Pythagoreische Tripel 
Ergänze die Funktion isPythagoreanTriple() so, dass diese true genau dann zurückgibt, wenn die übergebenen drei Zahlen ein sogenanntes 'Pythagoreisches Tripel' bilden. 
Ein Tripel (a,b,c) ist dabei genau dann ein 'Pythagoreisches Tripel', wenn $a^2$ + $b^2$ = $c^2$.

Einschränkung: Benutze beim Lösen dieser Teilaufgabe keine arithmetischen Operationen wie +, -, * und /. Nur Vergleiche wie >, < und == sind erlaubt. 
Greife stattdessen auf die bereits im Template implementierten Methoden square() und sumOfSquares() zurück.

Hinweis: Beachte, dass Reihenfolge des Tupels wichtig ist! (3,4,5) ist ein Pythagoreisches Tupel, da $3^2$ + $4^2$ = $5^2$. aber (3,5,4) ist kein Pythagoreisches Tupel, 
da $3^2$ + $5^2$ != $4^2$.
