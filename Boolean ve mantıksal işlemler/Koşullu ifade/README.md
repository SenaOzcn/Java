# Koşullu ifade

Koşullu ifade, bir Boole ifadesinin değerine bağlı olarak, programın farklı hesaplamalar gerçekleştirmesine izin veren bir yapıdır. 
```If``` ```true``` ise, program bir hesaplama yapar; aksi halde, program başka bir hesaplama gerçekleştirir. 
Boole ifadelerine ilişkin bazı örnekler: ```a > b```, ```i - j == 1```, vb.

Koşullu ifadenin farklı biçimleri vardır.

## Tek if durumu

Koşullu ifadenin en basit biçimi, anahtar ```if``` sözcükten, parantez içine alınmış bir Boolean ifadesinden ve küme parantezleri içine alınmış bir gövdeden oluşur.
```
if (Boolean ifade) {
    // gövde
}
```
İfade true ise, kod bloğu içindeki ifadeler yürütülür; aksi takdirde program bunları atlar.

Aşağıdaki örneğe bakalım :
```
int yas = ...; // bir değer girildi.
if (yas > 100) {
    System.out.println("Çok deneyimli kişi");
}
```
Bu örnekte, yaş 100'den büyükse, kod "Çok deneyimli kişi" yazdırır, aksi takdirde hiçbir şey yapmaz.

```boolean``` Bazen bir koşuldaki ifadenin tek tip bir değişken olduğu bir durum görürsünüz. 
b == true veya b == false yazmak yerine, Boolean ifadesi olarak bu ```!``` değişkeni kullanın :
```
boolean b = ...; // bu true veya false bir ifadedir.
if (b) { // yada !b
    // gövde
}
```
Koşullu bir ifade, bir programda ifadenin beklendiği herhangi bir yerde kullanılabilir. 
Çok aşamalı kontrolleri gerçekleştirmek için başka bir koşullu ifadenin içine bile yerleştirilebilir.

## if-else-durumları

Alternatif eylemler yapmak için anahtar kelime ve başka bir gövde ile genişletilebilir.
```
if (ifade) {    
    // gövde
} else {
    // gövde
} 
```
Bu durumda, if ifade true ise, ilk kod bloğu yürütülür; aksi takdirde, ikinci kod bloğu yürütülür, ancak ikisi birlikte yürütülmez.

Aşağıdaki örnekte, program (çift veya tek) değerine bağlı olarak farklı metinler verir.

Not: Bir sayı tam olarak 2'ye tam bölünebiliyorsa çift sayıdır; aksi halde tek sayıdır.
```
int sayi = ...; 

if (sayi % 2 == 0) {
    System.out.println("Bu bir çift sayıdır");
} else {    
    System.out.println("Bu bir tek sayıdır");
}
```
Bir sayı yalnızca çift veya tek olabileceğinden, yalnızca bir mesaj görüntülenecektir. 
Girilen sayı 10 ise, program "Bu bir çift sayıdır" çıktısını yazdırır. Değer 11 ise, "Bu bir tek sayıdır" çıktısını yazdırır.

## if-else-if-durumları

Koşullu ifadenin en genel biçimi, birkaç koşuldan oluşur.
```
if (ifade1) {
    // gövde
} else if (ifade2) {
    // gövde 2
// ...
} else if (ifadeN) {
    // gövde N
}
```
Aşağıdaki kod, bütçenize bağlı olarak hangi bilgisayarı satın almanız gerektiğine dair öneriler verir.
```
long liras = ...; // senin bütçen

if (liras < 10_000) {
    System.out.println("Laptop satın alabilirsin.");
} else if (liras < 20_000) {
    System.out.println("Masaüstü bilgisayar alabilirsin.");
} else if (dollars < 1_000_000) {
    System.out.println("Sunucu alabilirsin");
} else {
    System.out.println("Bir veri merkezi veya kuantum bilgisayar satın alabilirsin");
}
```
Bu koşullu ifadenin dört dalı vardır: liras < 10_000, liras < 20_000, liras < 1_000_000 ve liras >= 1_000_000. 

Birden çok koşulu olan bir koşullu ifade, düğümleri boolean ifadelerinden oluşan ve her koşul doğru veya yanlış ile işaretlenen bir karar ağacı oluşturur. 

Koşullar hakkında konuşurken, programcılar genellikle "kontrol akışı ifadeleri" terimini kullanırlar. 
Kontrol akışı, bir programın çeşitli bölümlerinin yürütüldüğü sıradır.
