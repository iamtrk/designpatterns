package com.iamtrk.designpatterns.builder;

public class TestBuilder {

    void createASCIIText(Document doc){
        ASCIITextConverter asciiBuilder = new ASCIITextConverter();
        RTFReader rtfReader = new RTFReader(asciiBuilder);
        rtfReader.parseRTF(doc);
        ASCIIText asciiText = asciiBuilder.getResult();
    }

    public static void main(String[] args) {
            TestBuilder client=new TestBuilder();
            Document doc=new Document();
            client.createASCIIText(doc);
            System.out.println("This is an example of Builder Pattern");
    }
}
