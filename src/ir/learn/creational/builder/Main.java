package ir.learn.creational.builder;

public class Main {
    public static void main(String[] args) {
        H264PropertiesBuilder h264Pro1pertiesBuilder = new H264PropertiesBuilder();
        h264Pro1pertiesBuilder.keyInt(12).meRange(52).build();

        H264Properties h = new H264PropertiesBuilder().bAdapt(12).build();
    }
}
