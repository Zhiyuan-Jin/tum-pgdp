# Switches

In dieser Aufgabe sollen einige Funktionen implementiert werden, die die Nutzung des Java-Schlüsselworts switch einüben sollen. Verwende daher in der gesamten Aufgabe keine Kontrollstrukturen außer switch. 
Insbesondere darfst du also nicht die Schlüsselwörter if, else, for, while, do und den ternären Operator ? : benutzen. Auch Streams gehen am Sinn der Aufgabe vorbei. 
(Ob du dies jedoch tatsächlich tust, werden wir nicht testen. Dies ist schließlich eine P-Aufgabe, die nur zum Üben da ist. Die Tests der Aufgabe überprüfen nur, 
ob deine Methoden das korrekte Input-Output-Verhalten aufweisen.)

### Locations der Hörsaal
public static String locationOfLectureHall(String hall) - gibt einen String zurück, der beschreibt, wo sich der übergebene Hörsaal hall der TUM befindet. 
Wir kennen dabei nur die 7 Hörsäle, in denen die Zentralübungen stattfinden: "MI⎵HS⎵2", "MW0001", "MW2001", "Interims⎵I⎵1", "Interims⎵II⎵2", "Carl-von-Linde", "N1190".

Diese befinden sich an den folgenden 4 möglichen Locations (die Interimshörsäle werden je dem nächstgelegenen Gebäude zugeordnet): "Informatik", "Maschinenwesen", "Chemie", "Innenstadt".

Sollte ein unbekannter Hörsaal übergeben werden, wird "Unbekannter⎵Hörsaal" zurückgegeben.

### Einschlüsse
public static int inclusions(char c) - berechnet für den übergebenen Character, wie viele abgeschlossene Flächen dieser (im Font [Consolas](https://www.fileformat.info/info/unicode/font/consolas/grid.htm)) enthält. 
So enthält das A eine eingeschlossene Fläche, das B zwei und das C keine.
Die Methode soll für alle lateinischen Groß- und Kleinbuchstaben (ohne Varianten wie Ä, Á usw.) und die arabischen Ziffern von 0 bis 9 die korrekte Anzahl an Einschlüssen zurückgeben. 
Für alle weiteren Zeichen soll der Fehlerwert -1 zurückgegeben werden.

### Formatiertes Datum
public static String formatDate(int day, int month, int weekday) - soll das übergebene Datum day.month. und den übergebenen Wochentag weekday (wobei hier 1 für den Montag, 2 für den Dienstag use. steht) 
in folgendem Format zusammenfassen: "<Name des Wochentages>,⎵den<Tag>.⎵<Name des Monats>".
So soll Beispielsweise für die Werte day == 2, month == 11 und weekday == 3 der String "Mittwoch,⎵den⎵2.⎵November" zurückgegeben werden.

Wenn der Monat month oder der Wochentag weekday "out of bounds" sind, soll stattdessen der String "Undefiniertes⎵Datum" zurückgegeben werden.

Hinweis: Es muss nicht überprüft werden, ob day und month zusammen ein valides Datum bilden. Nur, ob month und weekday kleiner 1 bzw. größer 12 bzw. 7 sind.

### Tage im Februar
public static int daysInFebruary(int year) - soll für die übergebene Jahreszahl zurückgeben, wie viele Tage der Februar in diesem Jahr hat. Für die Jahre 2020 und 2400 soll also beispielsweise 29, 
für die Jahre 2021 und 2100 soll 28 zurückgegeben werden.
Für diese Methode ist es nicht "natürlich", (nur) switch als Kontrollstruktur zu verwenden, sie ist aber alleine damit lösbar. Versuche es also der Übung halber dennoch!

### Restliche Tage im Jahr
public static int daysLeftInYearAfter(int day, int month, int year) bekommt ein Datum in Form eines Tages day, Monats month und Jahres year übergeben. 
Es soll die Anzahl an Tagen im Rest des Jahres ausschließlich dem übergebenen Tag berechnet werden. Achte hier insbesondere nochmal darauf, dass du auch keine Schleifen, 
nicht nur keine if-Statements und ? :'s, verwenden sollst.
Als Beispiel sind am 20.12.2021 noch 11 Tage des Jahres übrig, am 02.11.2022 noch 59 Tage und am 01.01.2023 noch 364 Tage.

Im Falle, dass für den Monat month ein ungültiger Wert übergeben wurde, soll stattdessen der Fehlerwert -1 zurückgegeben werden.

Hinweis: Du darfst davon ausgehen, dass wenn der Integer month einen validen Monat beschreibt, der Tag day auch innerhalb der Grenzen des Monats liegt. 
Wir übergeben dir in unseren Tests also nicht den 35.05. oder den 30.02. oder den 29.02.2021, sondern nur gültige Daten. Hier wäre die Überprüfung mit switch allein wohl zu umständlich. 
Nur der Monat month selbst kann auch "out of bounds" (also kleiner 1 oder größer 12) sein. Damit musst du umgehen.

