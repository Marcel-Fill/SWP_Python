package proxy;

public class test {
        public static void main(String[] args) {
            Drucker drucker = new ProxyDruck();
            drucker.drucken("test.docx");
            drucker.switchTo("Komplette.docx");
            drucker.switchTo("EYYO.docx");
    
        }
}
