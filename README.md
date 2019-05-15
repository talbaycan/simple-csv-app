# CSV Reader/Writer App
Amacımız herhangi bir List değişkeni CSV (comma seperated values) olarak bir dosyaya yazmak. Dosyadan da geri okumak. 

* **Proje Adı:** simple-csv-app
* **Package Adı:** com.albaycan.simplecsvapp

### 1. AppRunner.java: 
* **Ekrandan bir tercih alsın.**
    - 1 Write to CSV
    - 2 Read from CSV

* **Write to CSV seçilirse**
     - CSVWriter’ın bir instance’ını oluştursun.
     - CSVWriter’ın instance’ını oluştururken constructor’ına bir filepath geçsin örnek:
             - CSVWriter csvWriter=new CSVWriterImp(“C:\employees.csv”);
     - Bir adet employee list oluştursun şu şekilde
             - List<Employee> employees =new ArrayList<Employee>();
     - Bunun içine 10 adet employee eklesin.
     - employees listesini List<CSVRow> listesine çevirsin. 
     - csvWriter kullanarak dosyaya yazdırsın. 
     - Ekrana “file saved successfully” yazsın
* **Read from CSV seçilirse**
     - CSVReader’ın bir instance’ını oluştursun.
     - CSVReader’ın instance’ını oluştururken constructor’ına bir filepath geçsin örnek:
            - CSVReader csvReader=new CSVReaderImp(“C:\employees.csv”);
     - CSVReader’ın readCSVRows() methodunu çağırsın
     - Eger dosya yoksa hata vermesi lazım. Hatayı ekrana yazsın.
     - Dönen List<CSVRow> listesini List<Employee> tipinde bir listeye çevirsin.
     - Ekrana tablo formatında tüm employee’lerin detaylarını yazsın.

### 2. CSVRow.java

* Basit bir bean class bu.
* Okunan csv satırını tutacak. 
* List<string> records şeklinde sadece tek bir field’ı olacak.
* addRecord(String record) şeklinde bir methodu olacak.
    - Bu method parametre olarak geçilen string recordu records listesine ekleyecek.

### 3. CSVReader.java
Bu bir interface aşağıdaki gibi tek methodu olacak.
- List<CSVRow> readCSVRows();

### 4. CSVReaderImp.java
- CSVReader’ı implemente edecek.
- Constructor’ında okunacak dosyanın string olarak filepath’ini alacak.
- readCSVRows() methodu
     - Filepath’i verilen dosyayı kontrol edecek var mı yok mu diye.
     - Filepath’i verilen dosyayı acacak.
     - Tüm satırları sırayla okuyacak.
     - Her bir satırı virgül olan yerlerden ayıracak ve bir List<String> listesine dönüştürecek. Örneğin:
     - “102,Jack,Alastair,London” stringi virgüllerden ayrıldığında aşağıdaki gibi bir string liste dönüşmeli:
          - 102
          - Jack
          - Alastair
          - London
     - Bunun için String kütüphanesindeki split methodu kullanılabilir. 
     - Her bir satır için bir adet CSVRow instance’ı oluşturacak. 
     - Her bir parçalanmış string için CSVRow instance’ının addRecord(record) methodu çağırılacak.
     - Oluşturulan CSVRow daha sonra bir List<CSVRow> listesine eklenecek. 
     - Dosya okuma bittiğinde dosya kapatılacak.
     - readCSVRows() methodu oluşturduğumuz List<CSVRow> instance’ını döndürecek.

### 5. CSVWriter.java
Bu bir interface. Aşağıdaki gibi bir methodu var.
- writeCSVFile(List<CSVRow> csvRows);

### 6. CSVWriterImp.java
- CSVWriter interface’ini implemente edecek
- Constructor’ında filePath’i alacak.
- writeCSVFile() methodu cağırıldığında 
     - filePath’i verilen dosya var mı diye kontrol edecek varsa onu açacak. 
     - Yoksa eğer dosyayı yaratacak ve dosyayı acacak.
     - Parametre olarak geçilen csvRows listesindeki her bir csvRow’un içindeki her bir record’u virgül olarak birbirine ekleyip tek bir string oluşturacak.
     - Örneğin csvRows içindeki records aşağıdaki gibi bir liste ise
          - 102
          - Jack
          - Alastair
          - London
     - Bu listeyi şu şekilde tek bir string olarak birleştirecek
          - 102,Jack,Alastair,London
     - Bu stringi dosyaya yazacak.
     - Sırasıyla her bir satırı dosyaya yazacak.
     - Dosyayı kapatacak.

### 7. Employee.java
- Basit bir bean olacak aşağıdaki fieldları olacak.
- Id, Name, Surname, Age, City, DOB


### Örnek employees.csv dosyası içeriği

```
102,Jack,Alastair,35,London,13/06/1984
103,Iain,Adams,25,Berlin,13/01/1994
104,Pankaj,Ramej,29,Delhi,10/09/1990
108,Sibel,Özakman,40,Ankara,16/12/1979
```

### Referans
Buraya bir gözatabilirsin

[https://stackabuse.com/reading-and-writing-csvs-in-java/](https://stackabuse.com/reading-and-writing-csvs-in-java/)

3rd party library kullanmayacağız core java yazarak kendi library’imizi yapacağız.
