# Diziler üzerinde yineleme

Bir dizinin öğeleriyle çalıştığımızda, genellikle bir tür algoritma gerçekleştirmemiz gerekir. 
Örneğin, bunları sıralamamız, maksimum öğeyi bulmamız, yalnızca pozitif sayıları yazdırmamız, sırayı tersine çevirmemiz, 
bir dizi sayının aritmetik ortalamasını hesaplamamız vb. gerekebilir.

## Döngüler kullanarak dizileri işleme

Bir diziyi işlemenin uygun bir yolu, bir döngü kullanarak üzerinde yinelemektir.

Aşağıdaki örnekte, bir diziyi elemanlarının indekslerinin kareleriyle nasıl doldurabileceğimizi görebilirsiniz.

```
int n = 10; 
int[] squares = new int[n];

System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

/* Dizi üzerinde yineleme */
for (int i = 0; i < squares.length; i++) {
    squares[i] = i * i;
}

System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
```

Bu kodda, 10 boyutunda bir dizi oluşturulur ve sıfırlarla doldurulur. Daha sonra dizinin her bir elemanının değeri, elemanın indeksinin karesine ayarlanır. 
Ardından program diziyi köşeli parantez içindeki tüm öğeleri listeleyen dize temsiline dönüştürür ve standart çıktıya yazdırır.

Şimdi öğelerin sırasını kontrol etmek için döngüyü nasıl kullanabileceğimizi görelim.

Aşağıdaki program, verilen dizinin artan düzende sıralanıp sıralanmadığını kontrol eder ve cevap olumluysa "OK", aksi takdirde "BROKEN" yazdırır.

```
int[] numbers = { 1, 2, 3, 4, 5, 10, 6 };

boolean broken = false;

for (int i = 1; i < numbers.length; i++) {
    
    if (numbers[i] < numbers[i - 1]) {
        broken = true; 
        break;
    }
}

if (broken) {
    System.out.println("BROKEN");
} else {
    System.out.println("OK");
}
```

Verilen dizi için program "BROKEN" yazdırır.

*while ve do-while döngüleri dizileri yinelemek için de kabul edilebilir, ancak bunlar daha az yaygın olarak kullanılır.*

## Standart girdiden bir dizi okuma

Bir dizinin tüm öğelerini standart girdiden okumak için bir döngü de kullanabiliriz.

Örneğin, aşağıdaki girdi iki satırdan oluşmaktadır. İlk satır dizinin uzunluğunu, ikinci satır ise tüm öğelerini içerir.

```
5
101 102 504 302 881
```

Bu sayıları, ```Scanner``` kullanarak okuyalım ve ardından okuduğu tüm sayıları çıkaralım.

```
Scanner scanner = new Scanner(System.in);
        
int len = scanner.nextInt(); 
int[] array = new int[len]; 
        
for (int i = 0; i < len; i++) {
    array[i] = scanner.nextInt();
}

System.out.println(Arrays.toString(array));
```

Program çıktıları:

```
[101, 102, 504, 302, 881]
```

## Her döngü için kullanma

Java 5'ten beri, for-each adı verilen özel bir ```for-loop``` biçimi vardır. 
Bir dizinin, bir dizgenin veya bir koleksiyonun her bir elemanını indeksler olmadan yinelemek için kullanılır.

```
for (type var : array) { 
    
}
```

Bileşenleri daha ayrıntılı olarak ele alalım. ```type```; her yinelemede dizinin bir öğesini depolayacak değişken türünü belirtir. 
Genellikle bu tür, dizide depolanan öğelerin türüne eşittir. ```var```; bu değişkenin adıdır. 
Tercih ettiğiniz herhangi bir adı seçebilirsiniz, ancak değişken adlandırma kurallarına bağlı kalmayı unutmayın. 
İlk yinelemede dizinin ilk öğesini depolar, ikinci yinelemede ikinci öğeyi depolar ve bu şekilde devam eder.

Şimdi ```for-each``` döngüsünü kullanarak verilen karakter dizisindeki tekrarlayan 'a' harf sayısını hesaplayalım :

```
char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

int counter = 0;
for (char ch : characters) {
    if (ch == 'a') {
        counter++;
    }
}

System.out.println(counter); // "3"
```

Aynı şeyi ```for``` döngüsü ile de yapabiliriz:

```
char[] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

int counter = 0;
for (int i = 0; i < characters.length; i++) {
    if (characters[i] == 'a') {
        counter++;
    }
}

System.out.println(counter); // "3"
```

For-each döngüsünün bazı sınırlamaları vardır. 
Yinelemeler için kullandığımız değişken dizi öğesinin kendisini değil, yalnızca kopyasını depolar. 
İndeks izimiz olmadığı için indeksine göre bir eleman elde etmek de imkansızdır. 
Son olarak, adından da anlaşılacağı gibi, yineleme başına birden fazla adımlı bir dizide hareket edemeyiz: her öğe üzerinde ayrı ayrı yineleniriz, 
bu yüzden onlarla tek tek çalışırız.

Döngüleri kullanmak, bir dizi öğeyi işlemenin uygun bir yoludur. 
Çeşitli algoritmalar gerçekleştirebilir, bir diziyi yineleyebilir ve bir döngü ile standart girdiden okuma yapabilirsiniz. 
```for-each``` adı verilen bir for-loop biçimi, genellikle bir dizinin, dizenin veya koleksiyonun her bir öğesini öğelerin dizinleri olmadan yinelemek için kullanılır. 
Kullanımında bazı sınırlamalar vardır, ancak kodu daha okunabilir hale getirir.
