package proxy;

public class FarbDrucker implements Drucker{
    @Override
    public void drucken(String dokument) {
        System.out.printf("Dokument %s wird sogar mit Farbe gedruckt. WOW!!!!", dokument);
    }
    @Override
    public void switchTo(String s) {

    }
}