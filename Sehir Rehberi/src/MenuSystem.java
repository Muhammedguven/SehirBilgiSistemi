import java.util.Scanner;

public class MenuSystem {
    City city = new City();
    Scanner scanner = new Scanner(System.in);


    public void cityAdd() {

        System.out.println("Şehir Adını Giriniz..");
        city.cities.add(scanner.nextLine());
        System.out.println("Şehir Eklendi, Lütfen nüfusunu giriniz");
        city.population.add((scanner.nextLine()));
        System.out.println("Nüfus Eklendi, Lütfen şehir bilgilerini giriniz");
        city.informations.add(scanner.nextLine());
    }

    public void infoCity(int position) {


        try
        {
            String cityName =  city.cities.get(position);
            String pops =  city.population.get(position);
            String info =  city.informations.get(position);
            if (position >= 0 ){
                System.out.println(cityName);
                System.out.println("********");
                System.out.println(pops);
                System.out.println("********");
                System.out.println(info);
                System.out.println("********");

            }
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Hatalı bir giriş yaptınız.");
        }

    }

    public void listCity() {

        for (int i = 0; i < city.cities.size();i++) {

            System.out.println((i+1) +"-" + city.cities.get(i));

        }
    }
    public  void start(){
        city.cities.add("BURSA");
        city.population.add("2019 itibarıyla 3.056.120 nüfusa sahiptir.");
        city.informations.add("Bursa, Türkiye'nin bir ili ve en kalabalık dördüncü şehri. 2016 Dünya Yaşanabilir Şehirler sıralamasında Dünya'da 28. Türkiye'de 1. sırada yer almaktadır. Marmara Bölgesinin Güney Marmara bölümünde, 40° batı boylam ve 29° kuzey enlem daireleri arasında yer alır.");
        city.cities.add("İSTANBUL");
        city.population.add("Nüfusu 2019 itibarıyla 15,52 milyon kişidir");
        city.informations.add("İstanbul, Marmara Bölgesi’nin 41° K, 29° D koordinatlarında yer alır. Türkiye’nin en gelişmiş ili olan İstanbul, coğrafi konumu ile dünyada her zaman bir adım öne çıkar. Asya ve Avrupa kıtalarının birleştiği noktada yer alması nedeniyle tarih boyunca da birçok devletin ilgisini çekmiştir.");
        city.cities.add("ANKARA");
        city.population.add("Nüfusu 2019 itibarıyla 5.639.076 kişidir.");
        city.informations.add("Ankara, Türkiye'nin başkenti ve en kalabalık ikinci ili.  Bu nüfus; 25 ilçe ve bu ilçelere bağlı 1425 mahallede yaşamaktadır. İl genelinde nüfus yoğunluğu 215'tir.");
        city.cities.add("İZMİR");
        city.population.add("Nüfusu 2019 itibarıyla 4.367.251 kişidir.");
        city.informations.add("İzmir, Türkiye'nin bir ili ve en kalabalık üçüncü şehridir.  Bu nüfus; 30 ilçe ve bu ilçelere bağlı 1.297 mahallede yaşamaktadır. İl genelinde nüfus yoğunluğu 367'dir. Coğrafi olarak Türkiye'nin batısında bulunur ve ilin tamamı Ege Bölgesi'nde yer alır. ");

    }
}
