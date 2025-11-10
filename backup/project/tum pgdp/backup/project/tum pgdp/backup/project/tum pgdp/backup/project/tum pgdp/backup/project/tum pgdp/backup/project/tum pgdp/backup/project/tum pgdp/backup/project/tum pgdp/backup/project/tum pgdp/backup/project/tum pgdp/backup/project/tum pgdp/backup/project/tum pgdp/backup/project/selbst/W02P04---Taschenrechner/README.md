# Taschenrechner
Du sollst einen einfachen, konsolenbasierten Taschenrechner implementieren. Dabei soll der Nutzer zuerst nach der Operation gefragt werden, die durchgeführt werden soll. 
Dazu werden die zur Verfügung stehenden Operationen des Taschenrechners +,-,*,/, % und Programm beenden über Zahlen kodiert. Die Eingabeaufforderung soll wie folgt aussehen:

Wählen Sie eine Operation:
1) `` + ``
2) `` - ``
3) `` * ``
4) `` / ``
5) `` % ``
6) `Programm beenden`

Der Nutzer soll anschließend eine ganze Zahl von 1 bis 6 eingeben, um festzulegen, was getan werden soll. Falls der Nutzer sich für Option 6 entschieden hat, wird das Programm beendet. 
Falls er sich für eine Option von 1 bis 5 entschieden hat, werden die beiden ganzzahligen Operanden mit "Ersten⎵Operanden⎵eingeben:" und "Zweiten⎵Operanden⎵eingeben:" nacheinander vom Nutzer abgefragt. 
Das Programm soll dann das Ergebnis der Operation ausgeben (Hier könnte sich ein switch lohnen). Anschließend geht es von vorne los und es wird wieder nach der nächsten Operation gefragt.

Überprüfe jeweils, ob versucht wird, durch 0 zu teilen bzw. den Rest bzgl. 0 zu berechnen! Gib dann die Meldung "Fehler:⎵Division⎵durch⎵0!" anstelle des Ergebnisses aus. 
Wird bei der Frage nach der auszuführenden Operation eine ganze Zahl kleiner als 1 oder größer als 6 eingegeben, so soll diese Eingabeaufforderung wiederholt werden. 
Verwende für die Berechnungen die entsprechenden Operatoren auf dem Datentyp int. Du musst keine Sonderbehandlung für einen etwaigen arithmetischen Überlauf implementieren.

### Beispiele:
**1. Programm beenden**<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>6

**2. Addition und Subtraktion**<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>1<br>
<Ersten Operanden eingeben:<br>
>65<br>
<Zweiten Operanden eingeben:<br>
>34<br>
<99<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>2<br>
<Ersten Operanden eingeben:<br>
>34<br>
<Zweiten Operanden eingeben:<br>
>-12<br>
<46<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>6<br>

**3. Ungültige Auswahl**<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>7<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>6<br>

**4. Rest**<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>5<br>
<Ersten Operanden eingeben:<br>
>-11<br>
<Zweiten Operanden eingeben:<br>
>3<br>
<-2<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>5<br>
<Ersten Operanden eingeben:<br>
>65<br>
<Zweiten Operanden eingeben:<br>
>0<br>
<Fehler: Division durch 0!<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>6<br>

**5. Division**<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>4<br>
<Ersten Operanden eingeben:<br>
>-34<br>
<Zweiten Operanden eingeben:<br>
>5<br>
<-6<br>
<Wählen Sie eine Operation:<br>
<1) +<br>
<2) -<br>
<3) *<br>
<4) /<br>
<5) %<br>
<6) Programm beenden<br>
>6<br>

Hinweis: Zur besseren Kenntlichmachung ist in den Beispielen Zeilen, die vom Programm ausgegeben werden, je ein "<" vorangestellt. 
Zeilen mit Nutzereingaben ist ein ">" vorangestellt. Diese Zeichen gehören nicht zum Programmablauf.
