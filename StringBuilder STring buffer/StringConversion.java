public class StringConversion {
    public static void main(String[] args) {
        // String to StringBuffer and StringBuilder
        String str = "Hello, Java!";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);

        // StringBuffer and StringBuilder to String
        String strFromBuffer = stringBuffer.toString();
        String strFromBuilder = stringBuilder.toString();
        System.out.println("String from StringBuffer: " + strFromBuffer);
        System.out.println("String from StringBuilder: " + strFromBuilder);

        // StringBuffer to StringBuilder and vice versa
        StringBuilder convertedBuilder = new StringBuilder(stringBuffer.toString());
        StringBuffer convertedBuffer = new StringBuffer(stringBuilder.toString());
        System.out.println("Converted StringBuilder: " + convertedBuilder);
        System.out.println("Converted StringBuffer: " + convertedBuffer);
    }
}
