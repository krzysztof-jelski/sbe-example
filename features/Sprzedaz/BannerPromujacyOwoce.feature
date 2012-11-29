#language:pl
Właściwość: banner promujacy owoce

@key
Scenariusz: Banner na górze strony
Jeżeli wchodzą na stronę główną sklepu
Wtedy widzę banner z owocami na górze strony

Scenariusz: Banner linkuje do katalogu owoców
Zakładając że jestem na stronie głównej
Jeżeli kliknę banner z owocami
Wtedy zobaczę katalog owoców

Scenariusz: nie mam flasha
Zakładając że nie mam wtyczki flash w przeglądarce
Jeżeli wchodzę na stronę główną skepu
Wtedy widzę banner z owocami na górze strony

Szablon scenariusza: banner widoczny w różnych przeglądarkach
Zakładając że używam przeglądarki <przeglądarka>
Jeżeli wchodzę na stronę główną skepu
Wtedy widzę banner z owocami na górze strony
Przykłady:
| przeglądarka |
| firefox      |
| IE6          |
| IE9          |
| chrome       |
| safari       |
| WebKit       |

