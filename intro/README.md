## Java OOP Giriş


```java
public class Selam {
    public String selamSoyle(String kime){
        String selamCumlesi = "Selam " + kime;
        return selamCumlesi;
    }
}
```

- Selam sınıfı şu durumda bir hizmet veriyor. Kime selam söylenmesi gerektiği bilgisi sınıfa verilince
o kişiye selam söylüyor.

```java
public class Selam {

    private String world = "Dünya";

    public String selamSoyle(String kime){
        String selamCumlesi;
        if(kime != ""){
            selamCumlesi = "Selam " + kime;
        }else{
            selamCumlesi = "Selam " + world;
        }
        return selamCumlesi;
    }
}
```

- Yukarıdaki selam sınıfı ise hem bir hizmet veriyor hem de bir bilgi taşıyor. En basit haliyle bilgiyle (information),
davranışı (behaviour) bir araya getirip sınıf olarak ifade etmeye kapsülleme (encapsulation) denir.






























