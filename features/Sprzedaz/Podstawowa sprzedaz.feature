#language:pl
Właściwość: Podstawowa sprzedaż.

Założenia: Uwierzytelniony użytkownik
 Zakładając że jestem uwierzytelniony

Scenariusz: Składanie zamówienia
Zakładając że mam produkty w koszyku
Jeżeli złożę zamówienie
I dokonam płatności
Wtedy otrzymuję potwierdzenie złożenia zamówienia
I produkty są sprzedane

Scenariusz: Dodawanie do koszyka
Zakładając że w systemie istnieje produkt 'Serek Camembert'
I koszyk jest pusty
Jeżeli dodaję do koszyka 'Serek Camembert'
Wtedy w koszyku jest tylko 'Serek Camembert'

Scenariusz: Sumowanie produktów w koszyku

