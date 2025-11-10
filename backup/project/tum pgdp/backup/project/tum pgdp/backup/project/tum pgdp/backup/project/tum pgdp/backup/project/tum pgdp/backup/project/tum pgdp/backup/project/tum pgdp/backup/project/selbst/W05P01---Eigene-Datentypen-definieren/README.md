# Eigene Datentypen
In dieser Aufgabe sollst du einige eigene Datentypen nach gegebener Anleitung implementieren. Sie besteht aus drei Teilaufgaben, die je in einem eigenen Package gelöst werden sollen. Die Package-Struktur ist dabei im Template vorgegeben.

Alle Methoden in dieser Aufgabe sollten den Modifier public tragen. Die Attribute sollten keinen (Zugriffs-)Modifier tragen.

### Rationale Zahlen
Im Package pgdp.datatypes.rationals soll eine eigene Repräsentation von Brüchen entstehen: Die Klasse Rational. Erzeuge also eine neue Klasse mit diesem Namen und gib ihr folgende Member:

## Attribute
Ein Bruch wird durch zwei ganze Zahlen beschrieben. Einen Zähler (numerator) und einen Nenner (denominator).

## Konstruktor
Der Konstruktor nimmt Zähler und Nenner als Parameter entgegen und setzt die Attribute entsprechend. Wenn als Nenner 0 übergeben wird, soll auf der Konsole eine Warnung ausgegeben werden, dass das eben erzeugte Objekt nicht genutzt werden sollte. Diese soll lauten: "A⎵Rational-Object⎵with⎵'denominator'⎵zero⎵was⎵created.⎵Do⎵NOT⎵use!" 

## Methoden
Rational soll sechs Methoden zur Verfügung stellen.

- void multiplyBy(Rational other), void divideBy(Rational other), void add(Rational other) und void subtract(Rational other) sollen die grundlegenden arithmetischen Operationen *, /, + und - für Brüche implementieren. Dabei soll das Objekt, auf dem die Methode aufgerufen wird, modifiziert werden. D.h. bei einem Aufruf a.multiplyBy(b) soll danach in a das Produkt a * b stehen. b soll unverändert bleiben; die Methode(n) soll(en) auch keinen Wert zurückgeben.
- double toDouble() konvertiert die durch this dargestellte Zahl in einen double
- String toString() soll den Bruch in einen String konvertieren. Dieser soll die Form "<numerator>⎵/⎵<denominator>" haben.

### Geometrie-Bibliothek
Hier sollst du eine kleine Geometrie-Bibliothek erstellen, die Punkte (Point), Vektoren (Vector), Kreise (Circle) und Rechtecke (Rectangle) darstellen kann.

## Point
Diese Klasse wird durch eine x-Koordinate (x) und eine y-Koordinate (y) dargestellt. Sie unterstützt einen Konstruktor, welcher beides als Parameter übernimmt und in das jeweilige Attribut schreibt. Sie unterstützt des Weiteren zwei Methoden:

- double getDistanceToOrigin() berechnet die Distanz des dargestellten Punktes zum Ursprung (dem Punkt (0,0)).
- Vector getVectorTo(Point other) gibt den Vektor beginnend bei this und endend bei other zurück.

## Vector
Diese Klasse wird ebenso durch eine x-Koordinate (x) und eine y-Koordinate (y) dargestellt. Sie unterstützt ebenso einen Konstruktor, welcher beides als Parameter übernimmt und in das jeweilige Attribut schreibt. Allerdings hat sie nur eine Methode double getLength(), welche die Länge des repräsentierten Vektors zurückgibt.

## Circle
Diese Klasse stellt einen Kreis als Mittelpunkt center und Radius radius dar. Radien sind dabei ganzzahlig, für den Mittelpunkt solltest du dir selbst überlegen, wie man diesen mit allem Bisherigen aus dieser Teilaufgabe darstellen kann. Es gibt einen Konstruktor, der (in dieser Reihenfolge) den Mittelpunkt und den Radius übernimmt und diese in die entsprechenden Attribute schreibt und zwei Methoden double getCircumference() und double getArea().

## Rectangle
Zu guter Letzt soll es noch die Klass Rectangle geben, die ein Rechteck als den unteren linken Punkt desselben (bottomLeftCorner), sowie seine Breite (width) und Höhe (height) speichert. Der Konstruktor übernimmt die drei und setzt sie. Es gibt wieder zwei Methoden int getCircumference() und int getArea(), diesmal mit ganzzahligen Rückgabewerten (!!).

### Terminkalender
Als Letztes für die gesamte Aufgabe wollen wir das Grundgerüst für einen kleinen Terminkalender setzen. Dieser unterstützt eine Darstellung einer Tageszeit (TimeOfDay), eines Datums (Date) und eines bestimmten Termins (Appointment).

## TimeOfDay
Eine TimeOfDay besteht aus Stunde (hour), Minute (minute) und Sekunde (second). Der Konstruktor übernimmt und setzt alles und führt keine weiteren Überprüfungen durch. Eine Methode double hoursUntil(TimeOfDay other) berechnet die genaue Anzahl an Stunden zwischen this und other. Liegt other vor this soll eine negative Stundenzahl zurückgegeben werden. Beispiel: Von 12:15:00 bis 19:45:00 sind es 7.5 Stunden. Von 14:30:00 bis 13:15:00 sind es -1.25 Stunden.

Nun gibt es noch zwei toString()-Methoden. Einmal die "normale" String toString(), die die Uhrzeit als "<hour>:<minute>:<second>" zurückgibt. Dann gibt es noch String toStringTwelveHourClock(), die Uhrzeiten mit "am" und "pm" ausdrückt. Dort ist beispielsweise "15:20:31" dann "3:20:31 pm" und "10:10:10" ist "10:10:10 am".

## Date
Ein Datum wird durch Tag (day), Monat (month) und Jahr (year) dargestellt. Es unterstützt die Methode String toString, die das Datum im regulären Format mit Punkten getrennt ausgibt. Also z.B. 15.11.2022 für den 15. November im Jahr 2022.

Zudem hat Datum eine static-Methode mit dem Kopf public static boolean isValidDate(int day, int month, int year). Diese gibt genau dann true zurück, wenn das übergebene Datum gültig ist. Wenn also dieser Methode der 35. Mai 2022 oder der 29. Februar 2001 oder der -4.13.1981 übergeben wird, gibt sie false zurück.

Der Konstruktor von Date nimmt auch hier wieder die drei Attribute als Parameter entgegen und setzt diese. Wenn die übergebenen Attribute allerdings zusammen kein valides Datum formen, wird auf der Konsole eine Warnung ausgegeben, dass dieses Date-Objekt nicht benutzt werden sollte: "Not⎵a⎵valid⎵date.⎵Do⎵NOT⎵use⎵this⎵object!".

## Appointment
Ein Termin hat ein Datum (date), an dem er stattfindet, eine Start- (start) und Endzeit (end) und eine Beschreibung (description). Der Konstruktor nimmt und setzt alles. Zudem hat Appointment noch eine Methode toString() die einen Termin folgendermaßen als Text zusammenfasst:

- Beschreibung des Termins
- Datum als String
- Startzeit als String
- Dauer des Termins (als double)⎵h

Die Zeilenumbrüche sind dabei genau wie hier gezeigt in den Rückgabe-String zu übernehmen. Ganz am Anfang und ganz am Ende des Rückgabe-Strings sollte kein Zeilenumbruch mehr stehen.
