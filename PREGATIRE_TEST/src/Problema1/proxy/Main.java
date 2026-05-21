package Problema1.proxy;

public class Main {
    public static void main(String[] args) {
        PlacaLemn placaStejar = new PlacaLemn("stejar", 10.5f, 4.0f, 150.0f);
        PlacaLemn placaFag = new PlacaLemn("fag", 8.0f, 3.5f, 120.0f);
        PlacaLemn placaPin = new PlacaLemn("pin", 12.0f, 2.5f, 90.0f);

        Hala halaTemperaturaValida = new Hala(22.0f, 10.0f, 1300.0f, 1000.0f);
        Hala halaConsumValid = new Hala(30.0f, 11.0f, 800.0f, 1000.0f);
        Hala halaToateConditiileValide = new Hala(21.0f, 9.0f, 700.0f, 1000.0f);

        IUtilaj utilajDebitare = new Utilaj("Utilaj debitare");

        System.out.println("=== Procesare cu verificare doar pentru temperatura ===");

        ProxyUtilaj proxyTemperatura = new ProxyUtilaj(utilajDebitare);
        proxyTemperatura.adugaVerificare(new VerificareTemperatura(18.0f, 25.0f));
        proxyTemperatura.proceseazaPlaca(placaStejar, halaTemperaturaValida);

        System.out.println("==============================================");

        System.out.println("=== Procesare cu verificare doar pentru consum energetic ===");

        ProxyUtilaj proxyConsum = new ProxyUtilaj(utilajDebitare);
        proxyConsum.adugaVerificare(new VerificareConsumEnergie());
        proxyConsum.proceseazaPlaca(placaFag, halaConsumValid);

        System.out.println("==============================================");

        System.out.println("=== Procesare cu verificarea tuturor conditiilor ===");

        ProxyUtilaj proxyComplet = new ProxyUtilaj(utilajDebitare);
        proxyComplet.adugaVerificare(new VerificareTemperatura(18.0f, 25.0f));
        proxyComplet.adugaVerificare(new VerificareConsumEnergie());
        proxyComplet.proceseazaPlaca(placaPin, halaToateConditiileValide);

    }
}
