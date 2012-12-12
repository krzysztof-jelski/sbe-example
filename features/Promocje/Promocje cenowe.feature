#language: pl
Właściwość: Promocje cenowe

Założenia:
  Zakładając że istnieją produkty

Scenariusz: Dodawanie promocji cenowej produktu
  Zakładając że jestem uprawniony do administracji promocjami
  Jeżeli wybieram produkt
  I wprowadzam cenę promocyjną
  Wtedy produkt ma nową cenę
  I produkt oznaczony jest wizualnie jako promocyjny

Scenariusz: Wyświetlanie promocji na stronie głównej
  Zakładając że istnieją produkty promocyjne
  Jeżeli wchodzę na stronę główną
  Wtedy widzę 10 ostatnio dodanych promocji

Scenariusz: Powiadamianie o promocjach
  Zakładając że zgodziłem się na otrzymywanie treści marketingowych
  Jeżeli podałem swój numer telefonu
  Wtedy w każdy piątek otrzymam SMS z informacją o 3 najnowszych promocjach

Scenariusz: Dodawanie promocji wiązanej
  Zakładając że jestem uprawniony do administracji promocjami
  Jeżeli wybieram produkt bazowy
  I wybieram produkt bonusowy
  I podaję próg bonusu
  Wtedy produkt bazowy jest oznaczony wizualnie jako promocyjny
  I przy produkcie bazowym wyświetlane jest odniesienie do produktu bonusowego