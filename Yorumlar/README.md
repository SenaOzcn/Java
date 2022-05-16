# Yorumlar

Yorumlar, kodu derleme sürecinden çıkarmanıza (devre dışı bırakmanıza) veya bir kod parçasını kendinize veya diğer geliştiricilere açıklamanıza olanak tanır.

Java programlama dili üç tür yorumu destekler.

## Satır Sonu Yorumları

Java derleyicisi ```//```, satırın sonuna kadar herhangi bir metni yok sayar.

```
class Program {
    public static void main(String[] args) {
        // Bu satırı yoksay
        // System.out.println("Hello, World");
        // It prints the string "Hello, Java"
        System.out.println("Hello, Java"); // Buraya herhangi bir yorum yazabilirsin.
    }
}
```

## Çok Satırlı Yorumlar

Derleyici ```/*``` ve ```*/``` arasındaki metni yok sayar. Çoklu ve tek satırlık yorumlar olarak kullanılabilir.

```
class Program {
    public static void main(String[] args) {
        /* Tek satırlık yorum */
        /*  Çok 
        satırlı 
        yorum*/
  }
}
```

## Java Dokümantasyon Yorumları

```/**``` ve ```*/``` arasındaki herhangi bir metni yok sayar.

Bu tür yorumlar, **javadoc** aracını kullanarak kaynak kodunuzla ilgili belgeleri otomatik olarak oluşturmak için kullanılabilir. 
Genellikle, bu yorumlar sınıfların, arabirimlerin, yöntemlerin vb. bildirimlerinin üzerine yerleştirilir. 
```@param``` veya ```@return``` gibi bazı özel etiketler genellikle kontrol etmek için kullanılır.
