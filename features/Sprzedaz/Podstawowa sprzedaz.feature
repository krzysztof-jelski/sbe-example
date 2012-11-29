Właściwość: Podstawowa sprzedaż

Scenariusz: Kupuję jeden produkt
Zakładając że w bazie w tabeli 'klienci' jest wiersz
  | login | imię       | nazwisko | email           | hasło     |
  | frank | Franciszek | Wokulski | frank@gmail.com | 123haslo! |
I w bazie w tabeli 'produkty' jest wiersz 
  | nazwa           | producent | termin ważności | cena    |
  | Serek Camembert | Turek     | 2012-12-15      | 3,50 zł |
Jeżeli użytkownik kliknie przycisk 'Zaloguj się'
I wpisuje w pole 'Login' tekst 'frank'
I wpisuje w pole 'Hasło' tekst '123haslo!'
I klika przycisk 'Zaloguj się'
Wtedy widzi na stronie tekst 'Witaj Franciszku!'
Jeżeli wpisuje w pole 'Szukaj' tekst 'Camember'
I naciska przycik 'Szukaj'
Wtedy widzi strone 'Wyniki'
I widzi na stronie tekst 'Serek Camembert Turek'
Jeżeli klika na przycisk 'Dodaj' przy produkcie 'Serek Camembert Turek'
Wtedy widzi powiadomienie 'Dodano do koszyka'
Jeżeli klika na przycisk 'Koszyk'
Wtedy widzi stronę 'Koszyk'
I na stronie widzi tabelę 'Produkty w koszyku'
 | nazwa           | cena    | ilość | wartość |
 | Serek Camembert | 3,50 zł | 1     | 3,50 zł |
 |                 |         | razem | 3,50 zł |  
Jeżeli klika przycisk 'Zamawiam'
Wtedy widzis stronę 'Płatności'
Jeżeli wpisuje w pole 'Numer Karty' tekst '12345567780009222'
I wpisuje w pole 'Data ważności karty' teskst '2013/12'
I naciska przycisk 'Złóż zamówienie'
Wtedy widzi stronę 'Dziękujemy za zamówienie'
I na stronie jest tekst 'Wartość zamówienia 3,50 zł'
