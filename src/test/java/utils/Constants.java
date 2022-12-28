package utils;

public class Constants {

    public static final String CONFIGURATION_FILEPATH=
            System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    public static final int EXPLICIT_WAIT = 20;
    public static final int IMPLICIT_WAIT = 10;
    public static final String TESTDATA_FILEPATH =
            System.getProperty("user.dir")+"/src/test/resources/testdata/batch14excel.xlsx"; //replace with real file name

    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir")+"/screenshots/";

    public static final String CONTRACT_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/testdata/gistfile1.txt";
}
