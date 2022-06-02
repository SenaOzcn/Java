# Çok boyutlu dizi

Dizi aynı türdeki öğeleri saklamamıza izin verir. 

## Bir dizi dizi

İlk önce, çok boyutlu bir dizi ile ne demek istediğimizi anlayalım.

Çok boyutlu bir dizi oluşturmak için bir diziyi başka bir dizinin elemanı olarak düşünmemiz gerekir. Sonunda, çok boyutlu bir dizi elde ederiz.

Çok boyutlu bir dizi, birden fazla boyutu olan şeyleri temsil etmeyi çok kolaylaştırır: örneğin, uzunluk, yükseklik ve genişlik ile 3B nesneler. 
İçinde yaşadığımız evren dört boyutla tanımlanabilir, zaman dördüncü boyuttur, yani 4B'dir. 
5D ve benzeri gibi daha yüksek seviyeleri ilk başta hayal etmek zordur, ancak uygulamaya koyduğunuzda kullanışlı oldukları ve çok da zor olmadıkları ortaya çıkıyor!

Biraz daha gerçekçi örneklere bakalım. Tiyatrodaki bir koltuk 2B diziyle gösterilebilir: 
1. sıra için bir dizin ve 
2. o sıradaki koltuk sayısı için bir dizin. 

Deniz Savaşı gibi haritaları kullanan bir oyun yazmak istiyorsanız, iki boyutlu diziler harita üzerinde koordinatların ayarlanmasında çok yardımcı olacaktır. 
Ayrıca, bazı matematiksel yapılar uygun bir şekilde çok boyutlu diziler olarak temsil edilir.

# 2 boyutlu diziler

Tek boyutlu bir dizi, tek bir öğe dizisi olarak temsil edilebiliyorsa, iki boyutlu bir diziyi temsil etmenin sezgisel bir yolu bir matris veya tablodur. 
Programınızda matrisler veya tablolarla çalışıyorsanız, bunları iki boyutlu diziler şeklinde sunmak mantıklıdır.

3 satır ve 3 sütundan oluşan 2 boyutlu bir dizi:

```
int[][] twoDimArray = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
};
```

Bir tablo olarak hayal edebilirsiniz:


| 0 | 0 | 0 |
|---| ---| --- |
| 0 | 0 | 0 |
| 0 | 0 | 0 |


İşte ilginç bir özellik: iç içe dizilerin mutlaka aynı boyutta olması gerekmez. 
Aşağıdaki örnekte, her yeni gömülü dizinin farklı uzunlukları vardır:

```
int[][] twoDimArray = {
        {0, 0},       // 2 elemanlı
        {1, 2, 3, 4}, // 4 elemanlı
        {3, 3, 3}     // 3 elemanlı
};
```

Aynı 2B dizide farklı sayıda öğeye sahip iç içe diziler oluşturabilirsiniz.

## Öğelere erişme

Bir dizinin bir elemanına nasıl erişebileceğimizi görelim. Fikir, tek boyutlu dizilerle tamamen aynıdır. Ancak şimdi iki dizin yazmamız gerekiyor : 
1. önce ana dizinin öğesinin dizini, 
2. sonra iç içe dizinin dizini.

İlk satırda ve ilk sütunda bulunan bir öğeye erişmemiz gerektiğini varsayalım. Bu özel öğeyi nasıl buluruz? 
Ana dizideki indeksine göre iç içe dizilerden birini seçerek başlayın. İlke, 1D dizisine benzer.

```
int[][] twoDimArray = {
        {3, 4, 5},  // [0]
        {6, 7, 8},  // [1]
};
```

İlk önce ana diziye gidin ve dizin ile iç içe diziyi seçin:

| twoDimArray[0] | twoDimArray[1] |
| --- | --- |
| 3, 4, 5 | 6, 7, 8 |

İkinci olarak, bu iç içe dizide, gerekli öğeyi indexi ile seçin. Bu aynı zamanda basit dizilerdeki gibidir:

| twoDimArray[0][0] | twoDimArray[0][1] | twoDimArray[0][2] |      
| --- | --- | --- |                                                  
| 3 | 4 | 5 |                                                      

| twoDimArray[1][0] | twoDimArray[1][1] | twoDimArray[1][2] |
| --- | --- | --- |  
| 6 | 7 | 8 |

Yeni bir değişken oluşturalım; int number ve içine dizimizin ilk satırının ve ilk sütununun öğesini koyalım:

```
int number = twoDimArray[0][0]; // 3
```

**Tüm dizilerde indekslemenin 0 ile başladığını unutmayın!**

Aşağıdaki kod, iki boyutlu dizinin tüm öğelerini gösterecektir:

```
System.out.println(twoDimArray[0][0]); // 3
System.out.println(twoDimArray[0][1]); // 4
System.out.println(twoDimArray[0][2]); // 5
System.out.println(twoDimArray[1][0]); // 6
System.out.println(twoDimArray[1][1]); // 7
System.out.println(twoDimArray[1][2]); // 8
```

# 2B dizilerle çalışma

Önceki örneklerde, tüm elemanları numaralandırarak 2B diziler oluşturuyorduk. 
Ancak çok boyutlu bir dizi oluşturmanın en popüler yollarından biri, ```for``` döngüsü kullanmaktır.

2 satır ve 10 sütun ile bir dizi oluşturalım. Her öğeye erişmek için her iki for döngüyü de yinelememiz gerekir. 
İlk for döngüsü iç içe diziyi seçer ve ikinci for döngüsü iç içe dizinin tüm öğelerini yineler.

```
int[][] twoDimArray = new int[2][10];

for (int i = 0; i < twoDimArray.length; i++) {
    for (int j = 0; j < twoDimArray[i].length; j++) {
        twoDimArray[i][j] = 1;
    }
}
```

Tüm iç içe dizileri yazdırabilirsiniz:

```
for (int i = 0; i < twoDimArray.length; i++) {
     System.out.println(Arrays.toString(twoDimArray[i]));
}
```

Çıktı:

```
[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

Ve her elemanı yazdırmak için iki for döngüsüne de ihtiyacımız var. Aşağıdaki örnekte, tüm öğeleri birer birer artırıyoruz ve bunları standart çıktıya yazdırıyoruz:

```
for (int i = 0; i < twoDimArray.length; i++) {
    for (int j = 0; j < twoDimArray[i].length; j++) {
        twoDimArray[i][j]++;
        System.out.print(twoDimArray[i][j] + " ");
    }
    System.out.println();
}
```

Çıktı:

```
2 2 2 2 2 2 2 2 2 2 
2 2 2 2 2 2 2 2 2 2
```

# Çok boyutlu diziler (>2)

Sonunda daha karmaşık kavramlarla uğraşmaya hazırız. İkiden fazla boyutu olan diziler vardır. 

Her şeyden önce, üç boyutlu bir dizi bir küp veya bir kutu olarak temsil edilebilir: tam olarak üç boyutu vardır - uzunluk, genişlik ve yükseklik. 
24 elemanlı üç boyutlu bir diziye bir göz atın:

![gorsel](https://ucarecdn.com/831f0c5e-ef6c-4311-9c49-94b841b7fec7/)

Aşağıdaki pratik durum da üç boyutlu dizileri anlamanıza yardımcı olabilir: çok katlı bir park yerinde arabanın nerede olduğunu bulmanız gerektiğini hayal edin. 
Ardından, üç sayı veya üç koordinat belirlemeniz gerekir: zemin, sıra ve sıradaki yer.

| [0,0,0,0] | [1,1,1,1] | [2,2,2,2] |
|-- |-- |-- |
| [3,3,3,3] | [4,4,4,4] | [5,5,5,5] |

İki boyutlu bir dizinin her öğesinde, iç içe başka bir diziniz vardır.


Aşağıdaki kod, yukarıda az önce gördüğünüz üç boyutlu diziyi oluşturur:
```
int[][][] threeDimArray = new int[2][3][4];

int element = 0;

for (int i = 0; i < threeDimArray.length; i++) {
    for (int j = 0; j < threeDimArray[i].length; j++) {
        for (int k = 0; k < threeDimArray[i][j].length; k++) {
            threeDimArray[i][j][k] = element;
        }
        element++;
    }
}
```

2 satır, 3 sütun, 4 elemanlı ve iç içe dizideki eleman sayısı.

Ve iç içe dizileri yazdıralım:

```
for (int i = 0; i < threeDimArray.length; i++) {
    for (int j = 0; j < threeDimArray[i].length; j++) {
        System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
    }
    System.out.println();
}
```

Çıktı:

```
[0, 0, 0, 0] [1, 1, 1, 1] [2, 2, 2, 2] 
[3, 3, 3, 3] [4, 4, 4, 4] [5, 5, 5, 5]
```

Buna göre, üç boyutlu dizinin bir elemanına atıfta bulunmak için üç indekse ihtiyacımız var:

```
System.out.println(threeDimArray[0][0][0]); // 0
System.out.println(threeDimArray[0][1][0]); // 1
System.out.println(threeDimArray[1][0][1]); // 3
System.out.println(threeDimArray[1][2][3]); // 5
```

Çok boyutlu dizileri doldurmak ve yazdırmak için ```for-each``` döngüsü ve Arrays sınıfının yöntemlerini kullanarak kodunuzu basitleştirebileceğinize dikkat edin.

Ve elbette, benzetme yoluyla başka boyutlarda diziler oluşturabilirsiniz - 4, 5, 6 vb. 
Çok boyutlu bir dizinin bir elemanının, o dizinin boyutları kadar çok indeksi olduğunu unutmayın.

Tekrar özetleyelim:

- çok boyutlu bir dizi aslında bir dizi dizisidir;
- indeksleme 0 ile başlar;
- çok boyutlu bir dizinin bir öğesini bulmak için dizi boyutuna eşit sayıda indekse ihtiyacınız vardır;
- çok boyutlu bir dizide farklı boyutlarda dizileri bir araya getirebiliriz.

