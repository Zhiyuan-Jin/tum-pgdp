# Sortieren mit Gartenzwergen
Gartuine lieben Gartenzwerge, besonders Gnom-artige. Deshalb hat die Gartuingruppe der örtlichen Pinguinschule auch einen Gartenzwerg Roboter in Gnomform gebaut. 
Jetzt wollen sie dem Roboter beibringen, Blumentöpfe nach Größe zu sortieren. Natürlich wollen sie dafür den namentlich passenden Gnome Sort-Algorithmus verwenden, 
bei dessen implementierung sie deine Hilfe brauchen.

## GnomeSort
Implementiere die Methode gnomeSort, die das übergebene int-Array a mittels GnomeSort sortieren soll. Die sortierte Folge soll wieder in a stehen.
GnomeSort funktioniert wie folgt:
Der Gnom steht vor eine Reihe von Blumentöpfen, die der Größe nach sortiert werden soll. Er startet beim Blumentopf ganz links.
Sollte er beim ersten Blumentopf stehen, oder der aktuelle Blumentopf ist größer (oder gleich groß) als der Blumentopf links daneben, so geht der Gnom einen Blumentopf nach rechts.
Sollte dies nicht der Fall sein, vertauscht der Gnom die beiden Blumentöpfe und geht einen Blumentopf nach links.
Wenn der Gnom mit seinem Schritt nach rechts den letzten Blumentopf hinter sich gelassen hat, dann sind alle Töpfe sortiert und der Algorithmus endet.
