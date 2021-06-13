## OOP Java Felsefesi

- Nesne, insan zihninin kendisine yöneldiği özellik ve davranışlara sahip, fiziksel olan ya da olmayan herhangi bir olgudur.

- Yazılımda, her tip nesne için, verisi (variables) ile davranışını (methods) bir paket haline getirip sarmalayan (encapsulation) 
ve adına genelde sınıf (class) denen kalıplar oluşturulur. 

    Sınıf = veri + davranış

- Nesneler, sınıflardan türetilmiş çalışma zamanı yapılarıdır. 

### Java Nesne Merkezlidir

- Javada basit veri tipleri hariç herşey, bütün tipler bir nesnedir. 

- Çok yönlü kapsülleme (encapsulation) ve bilgi saklama (information hidiing) mekanizmaları vardır.

### Java Yorumlanır

- Java hem derlenen (compiled) hem de yorumlanan (interpreted) bir dildir.

- Platformdan bağımsız olabilmesi için Java kaynak kodları doğrudan makina koduna derlenmez.

- Java kaynak kodları (.java dosyaları) java bytecode'una (.class dosyaları) derlenir.

- Bytecode JVM'in komutlarıdır ve çalışma zamanında (runtime) JVM tarafından yorumlanır.

- JVM ise (Java Virtual Machine) C, C++ ile yazılmış, donanım ve işletim sistemi üzerinde çalışan sanal bir platformdur. 

myProgram.java -> compiler (javac) -> myProgram.class (bytecode) -> JVM (JDK içinde geliyor) -> 0101011100

- JVM java dosyalarının paltform bağımsız yorumlanmasını sağlar. Bu da zaten java'nın interpreted bir dil olmasını açıklar.
Javac compiler'ı java dosyalarını direk makine diline çevirmez. (Çevirseydi platform bağımsız olamazdı) Javanın interpreted
bir dil olmasını sağlayan Java Virtual Machine'in  anlayacağı bytecode'lara dönüştürür. Hemen her platform için en az bir JVM
mevcuttur. Derlenmiş java kodlarıyla platform arasında bir katman oluşturur ve aynı bytecode'ların farklı platformlarda değişmeden,
aynı şekilde çalışmasını sağlar.

`.java  ->  compiler (javac)  ->  .class (bytecode)  <br>
    - .class (bytecode) -> Linux interpreter    -> Linux platform <br>
    - .class (bytecode) -> Windows interpreter  -> Windows platform <br>
    - .class (bytecode) -> Android interpreter  -> Android platform` <br>


### Java Çok Kanallıdır

- Kanal (thread) bir işlem/süreç (process) içinde oluşturulan küçük bir işlem veya süreçtir. (Lightweight process)
- Aynı işlem içerisinde çalışan farklı kontrol akışlarına thread denir. 
- Kanallar aynı işlem içinde çalıştıklarından, bir çok işi aynı anda daha hızlı ve etkin olarak yerine getirebilirlier. Böylece daha yetenekli
ve daha hızlı cevap veren yazılımlar geliştirilebilir.

Java Tipleri
1. Standart Java (Standart Edition, SE)
2. Mikro Java (Micro Edition, ME)
3. Kurumsal Java (Enterprise Edition, EE)


### Javanın Tabiatı ve Zorlukları

- Java nesne merkezlidir. Dolayısıyla artık prosedürel değil nesne merkezli düşünmemiz gerekir. 
- Java sürükle-bırak merkezli programlama yaklaşımından ziyade C, C++ geleneğine daha uygun olarak ne yazdığınızı tam olarak bilmenizi ister.
- Java şartname (specification) temellidir. Dolayısıyla şartname ve onu gerçekleştiren farklı ürünlerin olduğunu anlamamız gereklidir. 
- Java yazılım mimarilerine, tasarım şablonlarına (design patterns) önem verir ve onları kullanır.
- * Javada düşünmek ve modellemek yazmaktan daha önemlidir.
- Küçük bir şey yapmak için bile hiç tahmin edemeyeceğiniz kadar düşünmeniz gerekebilir.
- Dolayısıyla hızlıca sürükle-bırak şeklinde geliştirme yerine tasarımı üzerine düşünülmüş, sürükle-bırak kullanılsa bile arka planda ne olup bittiği
iyice bilinen geliştirme modeli daha uygundur.
- Amaç örneğin 2000 satırlık ASP ya da PHP sayfası yerine çoğunlukla satır satır yazılmış ama çok daha modüler ve şablonlara uygun tasarlanmış
50-100 satırlık JSP sayfaları yazmaktır.

### Soyutlama

- Bir şeyin sahip olunan bakış açısı itibariyle, en önemli özelliklerini ön plana çıkarırken, önemli olmayan özelliklerini bastırmak, görmezden gelmektir.
- Önemli olan özellikler (essential properties), genel olarak o şeyi diğer şeylerden (secondary properties) ayırt eden unsurlardır. Ya da ana, asli özelliklerdir.
- Zihnimiz, karşılaştığı her nesneyi tek tek algılamak yerine, nesneleri karakteristik özellikleriyle algılar sonra da ya zihinde var olan kavramsal bir kategoriyle örtüştürür
ya da böyle bir kategori yoksa, bu nesneden yola çıkarak yeni bir kategori oluşturur.
- Soyutlama, sonsuz karmaşıklıktaki gerçekliği basitleştirerek anlama çabasıdır. 
- Model ise soyutlanmış karmaşık gerçekliklerin bir veya birkaçının bir araya getirilip daha sistematik bir yapı haline sokulmasına denir.
- Sınıflandırma: Zihin sonsuz sayıda soyutlama ile uğraşır ve bu soyutlamalarla elde edilen genellemeler birer kategori oluşturur. Soyutlamayı yönlendiren ilgi alanları ya da 
kriterler çerçevesinde kategori oluşturmaya sınıflandırma (classification) denir. Böylece nesneler, olgular, duygular vs. hepsi belli sınıflara ait hale gelirler.
- Sınıflar, kavramsal genellemeleri, nesneler ise sınıfların gerçeklikte var olan örneklerini oluşturur.
- Sınıf, nesnelerin özelliklerini değişik tiplerde değişkenlerle ya da bir başka deyişle veri yapılarıyla (data structures), davranışlarını ise metotlarla (method, function, procedure) ifade eder. Nesnelerin özelliklerinin bütününe durum (state), metotların bütününe de arayüz (interface) denir. 