#language: pl
Właściwość: Promocje cenowe

Scenariusz: Dodawanie promocji cenowej produktu
  Zakładając że jestem uprawniony do administracji promocjami
  Jeżeli wprowadzam cenę promocyjną dla produktu
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
  Jeżeli definiuję promocję wiązaną: 2 x "jabłko", "gruszka" gratis
  Wtedy produkt "jabłko" jest oznaczony wizualnie jako promocyjny
  I przy produkcie "jabłko" wyświetlane jest odniesienie do produktu "gruszka"