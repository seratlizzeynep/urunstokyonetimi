package urunstokyonetimi;

public class Urun {

	private String urunAdi;
    private int stokMiktari;

    // Yapıcı metot
    public Urun(String ad, int stok) {
        this.urunAdi = ad;
        this.stokMiktari= stok;
    }

	
	public String getUrunAdi() {
		return urunAdi;
	}


	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}


	public int getStokMiktari() {
		return stokMiktari;
	}


	public void setStokMiktari(int stokMiktari) {
		this.stokMiktari = stokMiktari;
	}


	public void setAd ( String yeniAd) {
        this.urunAdi = yeniAd;
    }

	public void setStok(int yeniStok) {
        this.stokMiktari= yeniStok;
    }

    public void stokEkle(int miktar) {
        stokMiktari =  stokMiktari + miktar;
    }

    public void stokCikar(int miktar) {
        if (miktar <= stokMiktari )
            stokMiktari= stokMiktari-miktar;
     else {
    	 System.out.println("Yetersiz stok");
	}
}
    public void urunBilgileri() {
        System.out.println("Ürün: " + this.urunAdi + "| Stok Miktarı: "+ this.stokMiktari);
        
        }
    }

    
