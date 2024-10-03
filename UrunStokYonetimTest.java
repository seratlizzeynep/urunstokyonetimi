package urunstokyonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class UrunStokYonetimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Urun> urunListesi = new ArrayList<>(); 
        boolean programdevam = true;
        while (programdevam) {
        	System.err.println("Ekranimiz sizlere 3 secenek sunmaktadir:");
            System.out.println("1.Secenekle urun ekleyebilirsiniz. ");
            System.out.println("2.Secenekle urun cikarabilirsiniz. ");
            System.out.println("3.Secenekle mevcut bir ürünün adını ve stok miktarını güncelleyebilirsiniz. ");
            System.out.println("Seciminiz nedir? (1/2/3)");
            
            int tercih = scanner.nextInt();
		
      
      switch (tercih) {
	
      case 1:
		System.out.println("Ürün adı giriniz: ");
        scanner.nextLine();  
        String urunAdi = scanner.nextLine();
       
        System.out.println("Stok miktarı: ");
        int stokMiktari = scanner.nextInt();
       
        Urun yeniUrun = new Urun(urunAdi, stokMiktari);
        urunListesi.add(yeniUrun);
        System.out.println("Ürün eklendi.");
        yeniUrun.urunBilgileri();
		
		break;

	case 2 :
		scanner.nextLine();  

        System.out.print("Stoktan çıkarmak istediğiniz ürün adı: ");
        
        String cikarilacakUrun = scanner.nextLine();
        Urun secilenUrun = urunuBul(urunListesi, cikarilacakUrun);

        if (secilenUrun != null) {
            System.out.println("Kaç adet ürün çıkarmak istiyorsunuz? ");
            int miktar = scanner.nextInt();
           
            secilenUrun.stokCikar(miktar);
            secilenUrun.urunBilgileri();
        } else {
            System.out.println("Ürün bulunamadı!");
        }
		break;
	
		
		
	  case 3:
		  scanner.nextLine(); 
        System.out.println("Güncellemek istediğiniz ürünün adını giriniz: ");
        String guncellenecekUrun = scanner.nextLine();
        Urun urun = urunuBul(urunListesi, guncellenecekUrun);

        if (urun != null) {
            System.out.print("Yeni ürün adı (eskisi kalsin istiyorsaniz  enter tusuna basın): ");
            String yeniAd = scanner.nextLine();
           
            if (!yeniAd.isEmpty()) {
                urun.setAd(yeniAd);
            } 

            System.out.println("Yeni stok miktarı: ");
            int yeniStok = scanner.nextInt();
             urun.setStok(yeniStok);
            
            System.out.println("Ürün başarıyla güncellendi!");
             urun.urunBilgileri();
        } else {
            System.out.println("Ürün bulunamadı!");
        }
        break;
	  case 4:
         
          System.out.println("İşleminiz tamamlandi.");
          programdevam = false;
          break;
          
	}
        }
	
	}

	 public static Urun urunuBul(ArrayList<Urun> urunListesi, String ad) {
	        for (Urun urun : urunListesi) {
	            if (urun.getUrunAdi().equalsIgnoreCase(ad)) {
	                return urun;
	            }
	        }
	        return null;
	    }
}
