# İkili Aritmetik Operatörler

Java programlama dili, operatörlerin aritmetik işlemleri gerçekleştirmesini sağlar:

- Toplama ```+```
- Çıkarma ```-```
- Çarpma ```*```
- Bölme ```/```
- Kalan ```%```

Operatörler, işlenen olarak iki değer aldıkları için ikili olarak adlandırılır.

Aşağıdaki örnek toplama, çıkarma ve çarpma sonuçlarını yazdırır.

```
System.out.println(13 + 25); // 38
System.out.println(20 + 70); // 90

System.out.println(70 - 30); // 40
System.out.println(30 - 70); // -40

System.out.println(21 * 3);  // 63
System.out.println(20 * 10); // 200
```

```/``` operatörü, iki tam sayının bölümünün tamsayı kısmını döndürür ve herhangi bir kesirli kısım atılır.

```
System.out.println(8 / 3); // 2
System.out.println(41 / 5); // 8
```

```%``` operatörü, Java'da, modül veya kalan operatörüdür. 
İki sayının bölümünden kalanı verir. Temettü bölenden küçük olduğunda, bölümün sıfır olduğuna ve kalanın temettüye eşit olduğuna dikkat edin. 
Modül işlemi konusunda hala tedirginlik duyuyorsanız, [wiki'ye bakın](https://en.wikipedia.org/wiki/Modulo_operation).

```
System.out.println(10 % 3) // 1
System.out.println(12 % 4) // 0
System.out.println(5 % 9) // 5
```
# Karmaşık ifadeler yazma

İşlemler daha karmaşık ifadeler yazmak için birleştirilebilir:
```
System.out.println(1 + 3 * 4 - 2); // 11
```
Hesaplama sırası aritmetik kurallara uygundur. 
Çarpma, toplama ve çıkarma işleminden daha yüksek bir öncelik düzeyine sahiptir, bu nedenle önce işlem ```3 * 4``` hesaplanır.

**Yürütme sırasını belirtmek için aşağıdaki gibi parantez** kullanabiliriz :
```
System.out.println((1 + 3) * (4 - 2)); // 8
```
Aritmetikte olduğu gibi, **parantezler** iç içe olabilir. Bunları netlik için de kullanabilirsiniz.

# Tekli operatörler

Tekli operatör, işlenen olarak tek bir değer alır.
- Tekli **artı** operatörü pozitif bir değeri gösterir. Opsiyonel bir operatördür.
```
System.out.println(+5); // 5
```
- Tekli **eksi** operatörü, bir değeri veya ifadeyi negatife dönüştürür.
```
System.out.println(-8);  // -8
System.out.println(-(100 + 4)); // -104
```

# Öncelik sırası

Parantezler dahil tüm aritmetik operatörlerin bir [öncelik sırası](https://introcs.cs.princeton.edu/java/11precedence/) vardır. 
Aşağıdaki liste, en yüksekten en düşük öncelik düzeyine doğru sıralanmıştır.

- Parantez
- Tekli artı/eksi
- Çarpma, bölme
- Toplama, çıkarma
