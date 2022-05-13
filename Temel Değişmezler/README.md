# Temel Değişmezler

Karmaşıklığına bakılmaksızın, bir program her zaman sayılar, dizeler ve diğer değerler üzerinde işlemler gerçekleştirir. **Bu değerlere değişmez değerler** denir.
Java'da pek çok farklı türde hazır bilgi vardır, ancak bu konuda sadece birkaçına odaklanacağız: günlük yaşamda en sık karşımıza çıkanlar gibi.

## Tamsayılar

Geçerli tamsayılar örneği aşağıdaki gibidir;
```
0, 1, 2, 10, 11, 100
```

Bir tamsayı değeri çok sayıda rakam içeriyorsa, daha okunaklı olabilmesi için sayıyı bloklara bölmek için alt çizgiler ekleyebilirsiniz: ``` 1_000_000```

## Karakterler

Tek bir karakter bir rakamı, bir harfi veya başka bir sembolü temsil edebilir. Bir karakter kullanmak için tek tırnak kullanırız: ``` 'A', 'B', 'C', 'x', 'y', 'z', '0', '1', '2', '3' ```

Karakter değişmezleri, rakamları ``` '0','9' ```, boşukları ``` ' ' ```, diğer karakterleri veya sembolleri ``` '$' ``` temsil edebilir.

Bir karakter, yalnızca tek bir sembolü temsil eder. İki veya daha fazla rakam veya harf içeremez.

## Dizeler

Bir dize, herhangi bir bireysel karakter dizisidir. Dizeler, bir reklam metni, bir web sayfasının adresi veya bir sitede oturum açma gibi metin bilgilerini temsil eder.

Bir dize yazmak için çift tırnak ``` "" ``` kullanırız.

Karıştırılmaması gerekenler:
- ```123``` bir tamsayıdır, ```"123"```bir dizedir.
- ```'A'``` bir karakterdir, ```"A"```bir dizedir.
- ``` '1' ```bir karakterdir, ```1```bir tamsayıdır.
