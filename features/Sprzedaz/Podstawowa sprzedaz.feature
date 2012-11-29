#language:pl
Właściwość: Podstawowa sprzedaż.

Założenia: 
 Zakładając że użytkownik jest uwierzytelniony

Scenariusz: Kup jeden produkt
Zakładając że w systemie istnieje produkt
  | nazwa           | cena    |
  | Serek Camembert | 3,50 zł |
Jeżeli użytkownik szuka produktu 'Camember'
Wtedy w wynikach wyszukiwania widzi 'Serek Camembert Turek'
Jeżeli dodaje do koszyka 'Serek Camembert Turek'
Wtedy w koszyku jest
 | nazwa           | cena    | ilość | wartość |
 | Serek Camembert | 3,50 zł | 1     | 3,50 zł |
Jeżeli złoży zamówienie
I dokona płatności
Wtedy otrzymuje potwierdzenie złożenia zamówienia
I produkt jest sprzedany

Scenariusz: Sumowanie produktów w koszyku