# Veri Yazdırmak

Java'da standart bir yaklaşım kullanarak, ekrana veri yazdıran birçok program kullanılır.

## println() ve print() kullanarak metin görüntüleme

**Standart çıktı**, bir programın metin olarak bilgi gönderebileceği bir alıcıdır. Tüm yaygın işletim sistemleri tarafından desteklenir. Java ```System.out```, standart çıktıyla çalışmak için özel bir nesne sağlar. Genellikle verileri yazdırmak için kullanacağız.

```println``` yöntemi ise, iletilen dizenin ardından ekranda yeni bir satır **(print-line)** görüntüler. 

Örneğin, aşağıdaki kod parçacığı dört satır yazdırır.
```
System.out.println("Ben");
System.out.println("Java");
System.out.println("Programlama Dilini");
System.out.println("Biliyorum.");
``` 
Alacağınız çıktı aşağıdaki gibi olacaktır.
```
Ben
Java
Programlama Dilini
Biliyorum.
```
Bu yöntem, dize verilmediğinde boş bir satır yazdırmanıza izin verir:
```
System.out.println("Java popüler bir programlama dilidir.");
System.out.println();
System.out.println("Tüm dünyada kullanılır!");
```
Çıktı :
```
Java popüler bir programlama dilidir.

Tüm dünyada kullanılır!
```
```print``` yöntemi, iletilen değeri görüntüler ve imleci ondan sonra yerleştirir. Örneğin, aşağıdaki kod tüm dizeleri tek bir satırda verir.
```
System.out.print("Ben ");
System.out.print("Java ");
System.out.print("programlama dilini ");
System.out.print("biliyorum.");
```
Çıktı :
```
Ben Java programlama dilini biliyorum.
```

*Kelimeler arasındaki boşluklara dikkat edin.*

