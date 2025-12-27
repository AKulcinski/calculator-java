# Calculator Java – Softverske metrike i statička analiza

## Fork repozitorijuma
Ovaj repozitorijum je forkovan sa sledeće putanje:  
https://github.com/vladimir-dresevic/calculator-java

Rad na zadatku je obavljen nad forkovanom verzijom repozitorijuma.

---

## LOC metrika (Lines of Code)

LOC metrika je izračunata ručno, prema definiciji iz lekcije Softverska metrika.

U obračun su uključene:
- linije koje sadrže izvršni kod

Iz obračuna su isključene:
- prazne linije
- komentari
- linije koje sadrže samo vitičaste zagrade

### LOC po fajlu

- Calculator.java – 153 LOC  
- Start.java – 19 LOC  

### Ukupan LOC projekta

**Ukupan broj linija koda (LOC): 172**

---

## Neformalan pregled koda i statička analiza

Pregled koda je obavljen bez pokretanja programa. Cilj analize je identifikacija potencijalnih problema u čitljivosti, strukturi i kvalitetu koda, kao i uočavanje Code Smell obrazaca.

### Zapažanja

**Calculator.java – linija 6** – Korišćenje statičke promenljive `finalResult` može dovesti do problema u slučaju paralelnog izvršavanja (nedostatak thread-safety).

**Calculator.java – linije 8–27** – Unutrašnja statička klasa `Operations` sadrži samo konstante; mogla bi biti zamenjena `enum` tipom radi bolje organizacije i čitljivosti koda.

**Calculator.java – linija 19** – Metoda `ToString()` ne poštuje Java konvenciju imenovanja metoda (trebalo bi `toString`).

**Calculator.java – linija 31** – Metoda `Run` ne dodaje dodatnu logiku već samo poziva drugu metodu, što predstavlja nepotreban wrapper.

**Calculator.java – linije 35–41** – Ne postoji provera da li je ulazni string `expression` prazan ili `null`, što može dovesti do izuzetaka u izvršavanju.

**Calculator.java – linije 62–78** – Hvatanje generičkog `Exception` umesto specifičnog izuzetka (`NumberFormatException`) nije dobra praksa.

**Calculator.java – linije 96–145** – Metoda `Calculate` je predugačka i sadrži značajnu količinu ponovljenog koda (Code Smell: Long Method, Duplicate Code).

**Start.java – linija 6** – Ime promenljive `Expression` ne poštuje Java konvenciju imenovanja (trebalo bi koristiti `expression`).

**Start.java – linija 9** – Objekat `Scanner` se instancira unutar `while` petlje, što može dovesti do nepotrebnog trošenja resursa.

**Start.java – linija 16** – Objekat `Scanner` se zatvara samo u slučaju unosa `"exit"`, što može dovesti do curenja resursa u drugim scenarijima.

---


