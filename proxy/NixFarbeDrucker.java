package proxy;

public class NixFarbeDrucker implements Drucker{
    @Override
    public void drucken(String dokument) {
        System.out.printf("Das Dokument %s wird ohne Farbe gedruckt :( \n", dokument);
    }

    @Override
    public void switchTo(String s) {

    }
}