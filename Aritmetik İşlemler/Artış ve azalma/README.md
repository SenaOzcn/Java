# Artış ve azalma

## Java'da ++ ve -- kullanma

Java, bir değişkenin değerini birer birer için artırma ```++``` ve eksiltme ```--``` adlı iki zıt işleme sahiptir.
```
int n = 10;
n++; // 11
n--; // 10
```
Yukarıdaki kod aslında aşağıdaki ile aynıdır.
```
int n = 10;
n += 1; // 11
n -= 1; // 10
```

## Önek ve sonek formları

Hem artırma hem de azaltma operatörlerinin, sonucu geçerli ifadede kullanırken çok önemli olan iki formu vardır:

- **Önek**( ++nveya --n) kullanılmadan önce bir değişkenin değerini artırır/azaltır;
- **Sonek**( n++veya n--), bir değişkenin kullanıldıktan sonra değerini artırır/azaltır.

Aşağıdaki örnekler, her iki artış biçimini de göstermektedir.

**Önek artışı:**
```
int a = 4;
int b = ++a;

System.out.println(a); // 5
System.out.println(b); // 5
```
Bu durumda, önce a'nın değeri artırılmış ve ardından b'ye atanmıştır.

**Sonek artışı:**
```
int a = 4;
int b = a++;

System.out.println(a); // 5
System.out.println(b); // 4
```
Bu hala sizin için yeterince açık değilse, koda bir göz atın:
```
int a = 4;
System.out.println(a++ + a); // 9
```
