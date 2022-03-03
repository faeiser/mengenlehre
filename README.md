# Datenstrukturen
## Aufgabe: Mengenlehre
Gegeben sind drei Zahlenmengen A, B, C - realisiert als Arrays vom Typ Integer:

    A = { 49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34 }
    B = { 39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49 }
    C = { 41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10 }

Berechne möglichst effizient die Vereinigungsmenge von A ∪ B ∪ C sowie alle möglichen Schnittmengen und Differenzmengen der drei Zahlenmengen. Du kannst davon ausgehen, dass alle Mengen gleich groß sind. Gestalte deine Methoden mit dem fluent-interface Entwurfsmuster (Design Patterns: <https://java-design-patterns.com/patterns/fluentinterface/>). Das heißt, dass alle Methoden zur Berechnung dieser Verknüpfungen den selben return Typ haben sollen wie die Parameter.

    getUnionList(a, getIntersectionList(b,c)); // das sollte funktionieren und heißt A ∪ (B ∩ C)

# Aufgabe: Wörterbuch
Erstelle ein Programm welches ein Wörterbuch zum Übersetzen von Wörtern zwischen Englisch und Deutsch implementiert (bi-direktional). Es soll folgende Funktionalitäten umfassen: - Hinzufügen eines neuen Wort-Paars (Englisch und Deutsch) - Entfernen eines Wort-Paars aus dem Wörterbuch

# Aufgabe: Liste sortieren
Wähle einen der bereits mit Arrays implementierten Sortieralgorithmus und ändere die Implementation derart, dass statt Arrays Listen verwendet werden. Wichtig: Es soll NICHT die eingebaute Sortierfunktion des Listen Interface, sondern euer eigener Algorithmus verwendet werden.
