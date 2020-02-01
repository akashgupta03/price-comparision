package utils;

public class Properties {

    private static final PropertiesReader propertiesReader = new PropertiesReader();
    public static final String amazonUrl = propertiesReader.getAmazonUrl();
    public static final String flipkartUrl = propertiesReader.getFlipkartUrl();




}
