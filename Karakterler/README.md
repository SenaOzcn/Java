# Karakterler

```char``` türü, harfleri(hem büyük hem de küçük harf), rakamları ve diğer sembolleri temsil etmek için kullanılır. 
Her karakter sadece tek tırnak ```''``` içine alınmış bir semboldür.
```
char kucukHarf = 'a';
char buyukHarf = 'Q';
char numara = '1';
char bosluk = ' ';
char dolar = '$';
```
Bu tür, tüm dillerdeki tüm karakterleri ve ayrıca bazı özel ve bilgisayar sembollerini temsil edebilir. 
**Unicode** (UTF-16) formatına karşılık gelir. 
Unicode, her karakter için benzersiz bir numara atayan bir bilgisayar kodlama metodolojisidir. 
Hangi dilde veya bilgisayar platformunda olduğu önemli değil. 
Bu, küresel, ağ bağlantılı bir dünyada ve birden çok dili ve özel karakterleri barındırması gereken bilgisayar sistemleri için önemlidir. 
Unicode, bunların hepsini tek bir standartta birleştirir.

## Karakterleri kodlarla başlatma

[Unicode tablosundaki](https://unicode-table.com/en/) onaltılık kodu kullanılarak bir karakter de oluşturulabilir. Kod, ```\u``` ile başlar.
```
char ch = '\u0040'; // '@'
System.out.println(ch); // @
```
Bu tür bir kodu temsil etmek için bir dizi karakter kullanmamıza rağmen, kod tam olarak bir karakteri temsil eder.

```char``` türünün kodlanmış minimum değeri, ```'\u0000'``` ve maksimum değeri, ```'\uffff'``` olarak kodlanmıştır.

Pozitif bir tamsayı ile bir karakter başlatmak da mümkündür.
```
char ch = 64;
System.out.println(ch); // @
```
```64``` sayısı **Unicode** ```'\u0040'``` koduna karşılık gelir.

Herhangi bir ```char``` değişken, 0 ila 65535 aralığında işaretsiz bir tamsayı değeri olarak kabul edilebilir.

## Sonraki karakterleri alma

Unicode sırasına göre, bir sonraki ve bir önceki karakteri almak için, tam sayıların eklenmesi (+) ve çıkarılması (-) için iki operatör vardır.
```
char ch = 'b';
ch += 1; // 'c'
ch -= 2; // 'a'
```
İki karakter eklemek veya çıkarmak da mümkündür.
```
char ch = 'b';
ch += 'a';
ch -= 'b';
System.out.println(ch); // 'a'
```
Arttırma (++) ve eksiltme (--) operatörlerini önek ve sonek formlarında kullanmak mümkündür.
```
char ch = 'A';
ch += 10;
System.out.println(ch);   // 'K'
System.out.println(++ch); // 'L'
System.out.println(++ch); // 'M'
System.out.println(--ch); // 'L'
```

## Kaçış dizileri

Kaçış veya kontrol dizileri olarak bilinen ters eğik ```\``` çizgi ile başlayan bazı özel karakterler vardır. 

- '\n' yeni satır karakteridir;
- '\t' sekme karakteridir;
- '\r' satır başı karakteridir;
- '\\' ters eğik çizgi karakterinin kendisidir;
- '\'' tek tırnak işaretidir;
- '\"' çift tırnak işaretidir.

İşte birkaç örnek:
```
System.out.print('\t'); // tab
System.out.print('a');  // 'a'
System.out.print('\n'); // yeni satır
System.out.print('c');  // 'c'
```
Yukarıdaki kodların çıktı bu şekilde olur :
```
  a
c
```
