# Nesne Sınıfı

```
java.lang.Object
```

public class **Object**

Nesne sınıfı, sınıf hiyerarşisinin köküdür. Diziler dahil tüm nesneler bu sınıfın yöntemlerini uygular.

### Yöntem Özeti:

| Değiştirici ve Tip | Yöntem ve Açıklama |
| --- | --- |
| protected Object | clone() Bu nesnenin bir kopyasını oluşturur ve döndürür. |
| boolean | equals(Object obj) Başka bir nesnenin, bu nesneye eşit olup olmadığını gösterir. |
| protected void | finalize() Çöp toplama, nesneye daha fazla başvuru olmadığı belirlendiğinde, bir nesnede çöp toplayıcı tarafından çağrılır. |
| Class<?> | getClass() Çalışma zamanı object sınıfını döndürür. |
| int | hashCode() Nesne için bir Hash kod değeri döndürür. |
| void | notify() Bu nesnenin monitöründe bekleyen tek bir iş parçacığını uyandırır. |
| void | notifyAll() Bu nesnenin monitöründe bekleyen tüm iş parçacıklarını uyandırır. |
| String | toString() Nesnenin dize temsilini döndürür. |
| void | wait() Geçerli iş parçacığının, başka bir iş parçacığı bu nesne için notify()yöntemi veya notifyAll() yöntemi çağırana kadar beklemesine neden olur. |
| void | wait(long timeout) Geçerli iş parçacığının, başka bir iş parçacığı bu nesne için notify() yöntemi veya notifyAll() yöntemi çağırana veya belirli bir süre geçene kadar beklemesine neden olur. |
| void | wait(long timeout, int nanos) Geçerli iş parçacığının, başka bir iş parçacığı bu nesne için notify() yöntemi veya notifyAll() yöntemi çağırana kadar veya başka bir iş parçacığı geçerli iş parçacığını kesene kadar veya belirli bir miktarda gerçek zaman geçene kadar beklemesine neden olur. |
