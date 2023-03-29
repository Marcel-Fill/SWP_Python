package proxy;

public class ProxyDruck implements Drucker {
    private boolean sw = true;
    private Drucker drucker;
    @Override
    public void drucken(String dokument) {
        if (this.sw == true) {
            this.drucker = new NixFarbeDrucker();
        } else {
            this.drucker = new FarbDrucker();

        }
        drucker.drucken(dokument);

    }

    public void switchTo(String dokument) {
        if (this.sw == true) {
            this.drucker = new NixFarbeDrucker();
            this.drucker.drucken(dokument);
            this.sw = false;
        } else {
            this.drucker = new FarbDrucker();
            this.drucker.drucken(dokument);
            this.sw = true;
        }
    }
}
