package day05;

import org.junit.Test;

public class C01_Notasyon {

    // java'daki gibi seleniun'da da belirli islevleri yapan methodlar olusturabiliriz
    // ancak bu methodlar cagrilmadikca CALISMAZLAR..
    public void ilkTestMethodu() {
        System.out.println("Ilk test methodumuz");
    }

    // JUnit ile notasyon kullanarak siradan method'lari test methodu'na donusturebilirz
    // Bir test method'u baginsiz olarak calisabilen test yapmamiza imkan verir
    // @Test notasyonu sayesinde main method mecburiyeti ortadan kalkar. basimsiz olarak calisabilir.
    // @Test notasyonlari test methodlarini kendi kafasindaki siraya gore calistirir

    @Test
    public void notasyonluIlkTestMethodu(){
        System.out.println("notasyonlu ilk test methodumuz");
    }
}
