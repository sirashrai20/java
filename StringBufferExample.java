class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Great");

        stringBuffer.append(" Day");
        System.out.println(stringBuffer);

        stringBuffer.insert(5, " Night");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.delete(0, 4);
        System.out.println(stringBuffer);

        stringBuffer.setLength(3);
        System.out.println(stringBuffer);

        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
    }
}
