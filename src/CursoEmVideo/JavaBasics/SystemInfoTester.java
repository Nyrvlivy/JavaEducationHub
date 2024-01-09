package CursoEmVideo.JavaBasics;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class SystemInfoTester {
    public static void main(String[] args) {
        SystemInfoTester tester = new SystemInfoTester();

        tester.printCurrentDate();
        tester.printSystemLanguage();
        tester.printScreenResolution();
    }

    public void printCurrentDate() {
        Date currentDate = new Date();
        System.out.println("The current system date is: " + currentDate + ".");
    }

    public void printSystemLanguage() {
        Locale currentLocale = Locale.getDefault();
        System.out.println("The current system language is: " + currentLocale.getDisplayLanguage() + ".");
    }

    public void printScreenResolution() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        System.out.println("The current screen resolution is: " + screenSize.width + "x" + screenSize.height + ".");
    }
}
