import Scanners.Scanner;
import Scanners.UltrasoundScanner;

public class ScannersStatus {

    private UltrasoundScanner ultrasoundScanner;
    private Scanner scanner;

    public String ifUltrasoundOn(){
        return ultrasoundScanner.getStatus();
    }

    public String ifScannerOn(){
        return scanner.getStatus();
    }

}
