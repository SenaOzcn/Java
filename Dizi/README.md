# Dizi

Aynı türden birden çok nesneyi işlemeniz gerektiğinde, bunları bir diziye kaydedebilir ve ardından tek bir birim olarak birlikte işleyebilirsiniz. 
Çalışma zamanı sırasında programın kaç tane nesne işleyeceğini bilmiyorsanız, bu çok uygun bir yaklaşımdır.

Bir diziyi aynı türdeki öğelerin bir koleksiyonu olarak düşünebilirsiniz. Tüm elemanlar sırayla bellekte saklanır.

Bir koleksiyondaki tüm öğeler aynı ad altında saklanır. Depolanacak olası öğe sayısı, dizi oluşturulduğunda belirlenir ve değiştirilemez. 
Ancak saklanan bir öğe herhangi bir zamanda değiştirilebilir.

# Java'da diziler

Aşağıdaki resim beş kayan noktalı sayı dizisini göstermektedir. Her öğenin erişilmesi gereken bir tamsayı dizini (0-4) vardır.

![gorsel](https://ucarecdn.com/9e6fb36e-293b-4fce-99e5-430e520d0783/)

İlk elemanın indeksi 0 ve son elemanın indeksi dizi boyutu – 1'e eşittir.

Java'da bir dizi aşağıdaki önemli özelliklere sahiptir:

- dizi bir başvuru türüdür;
- tüm dizi öğeleri sırayla bellekte saklanır;
- dizinin her elemanına kendi sayısal indeksi ile erişilir, ilk eleman 0 indeksine sahiptir ;
- son öğeye, dizi boyutuna eşit olan dizin tarafından erişilir – 1 ;
- herhangi bir türdeki öğeleri depolamak için bir dizi oluşturmak mümkündür.

## Bildirim, somutlaştırma, başlatma

Öğelerle dolu bir dizi oluşturmak için şunları yapmalıyız:

- dizi türünde bir değişken bildir (bildirim);
- dizi nesnesinin bir örneğini oluşturun (örnek ) ;
- diziyi bazı değerlerle başlatın (başlatma).

Bir değişken tanımladığımızda onun tipini ve ismini tanımlarız. Örnekleme, bu nesne için bellek ayrıldığında gerçekleşir. 
Dizi nesnesini başlatmak, dizi nesnesinin belirli değerlerini programımızın belleğine koymamız anlamına gelir.

Bir diziyi bildirmek için dizideki öğelerin türünden sonra iki özel karakter [ ] kullanmalıyız:

```
int[] array;
```

Ayrıca dizi değişkeninin adından sonra da kullanılabilir:

```
int array[];
```

İlk bildirim biçimini kullanacağız çünkü Java yazarken en çok bu biçim kullanılır.

## Belirtilen öğelerle bir dizi oluşturma

Java, belirtilen öğelerle bir dizi oluşturmanın birkaç yolunu sunar.

Bir diziyi başlatmanın en basit yolu, tüm öğelerini numaralandırmaktır:

```
int[] numbers = { 1, 2, 3, 4 }; // 1, 2, 3, 4
```

Başka bir yol, değişkenleri kullanarak bir diziyi başlatmaktır:

```
int a = 1, b = 2, c = 3, d = 4;
int[] numbers = { a, b, c, d }; // 1, 2, 3, 4
```

Bu durumda, dizi oluşturma anında tüm öğelere sahip olmalıyız.

## "New" anahtar sözcüğünü kullanarak bir dizi oluşturma

Bir dizi oluşturmanın en genel yolu özel anahtar sözcüğü ```new``` kullanmak ve gerekli sayıda öğeyi belirtmektir:

```
int n = ...; 
int[] numbers = new int[n];
```

Bu form, programa başlamadan önce eleman sayısı bilindiğinde kullanışlıdır. [n] veya [5] gibi belirtilen uzunlukta dizi nesnesinin bir örneğini oluşturduğumuzda 
ve öğelerini açıkça numaralandırmadığımızda, dizi, türünün varsayılan değerleriyle başlatılır.

Şimdi, dizinin n tane elemanı var. Her öğe sıfıra eşittir (int türünün varsayılan değeri). Ardından, öğelerin açık bir başlatmasını yapmalıyız.

Bir Integer dizisinin boyutu MAX_VALUE'den büyük olamaz. Aslında, bu değerden biraz daha küçüktür.
Bildirimi ve somutlaştırmayı iki satırda ayırmak mümkündür:

```
int[] numbers;
numbers = new int[n];
```

Ayrıca, ```new``` anahtar sözcüğü yazabilir ve bir dizinin tüm öğelerini sıralayabiliriz:

```
float[] floatNumbers;
floatNumbers = new float[] { 1.02f, 0.03f, 4f };
```

Varsayılan olarak, ilkel türden bir dizi varsayılan değerle başlatılır. 
Ardından değerleri açıkça doldurmanız veya yardımcı program sınıfı dizileri kullanmanız gerekir. 
Tüm bir diziyi veya bir kısmını bazı değerlerle doldurmak için uygun bir yol sağlar:

```
int size = 10;
char[] characters = new char[size];

Arrays.fill(characters, 0, size / 2, 'A'); 
Arrays.fill(characters, size / 2, size, 'B');

System.out.println(Arrays.toString(characters)); // [A, A, A, A, A, B, B, B, B, B]
```

## Bir dizinin uzunluğu

Mevcut bir dizinin uzunluğunu elde etmek için ```arrayName.length``` özelliğine erişin. İşte bir örnek:

```
int[] array = { 1, 2, 3, 4 };
        
int length = array.length; 
        
System.out.println(length); // 4
```

## Elemanlara erişim

Bir dizinin elemanlarının değerleri değiştirilebilir. Dizinin bir değerini ayarlamak veya ondan bir değer almak için dizini kullanabilirsiniz.

```
array[index] = val;
```

```
val = array[index];
```

Bir dizinin indexleri 0'dan - 1 dahil sayılara sahiptir.

Bir örnek:

```
int[] numbers = new int[3]; // numbers: [0, 0, 0]
numbers[0] = 1; // numbers: [1, 0, 0]
numbers[1] = 2; // numbers: [1, 2, 0]
numbers[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]
```

Bu kod aşağıdaki gibi çalışır:

1. İlk satırda, içinde üç eleman bulunan tamsayılar dizisi oluşturulur. int türü için varsayılan değer olan 0 ile başlatılır.
2. İkinci satırda, dizinin ilk eleman indeksi ile "1" değeri atanır (unutmayın, ilk elemanın indeksi 0'dır).
3. Üçüncü satırda "2" değeri dizinin ikinci öğesine dizinine göre atanır (sayılar[1] ikinci öğedir).
4. Son satırda, ilk iki elemanın toplamı, indeks ile üçüncü elemana atanır.

Örneğin, ele alınan numbers dizinin dördüncü öğesini (3.index) almaya çalışalım.

```
int elem = numbers[3];
```

program ArrayIndexOutOfBoundsException'a atar.

Bir dizinin elemanlarını indekslerken dikkatli olun.

Bir dizi, aynı türdeki öğelerin bir koleksiyonudur. 
Öğeleri sırayla bellekte saklamaya ve hepsini tek bir birim olarak işlemeye izin verir. 
Bu konuda, bir diziyi nasıl bildireceğinizi, başlatacağınızı ve başlatacağınızı ve ayrıca belirtilen öğelerle bir dizi oluşturmayı öğrendik. 
```new``` anahtar kelimeyi kullanarak bir diziyi nasıl oluşturacağımızı, bir dizinin uzunluğunu nasıl elde edeceğimizi ve 
değerlerini değiştirmek için öğelerine nasıl erişeceğimizi de gösterdik.
