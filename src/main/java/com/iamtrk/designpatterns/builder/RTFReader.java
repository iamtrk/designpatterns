package com.iamtrk.designpatterns.builder;

public class RTFReader {

    private static final char EOF='0'; //Delimitor for End of File
    final char CHAR='c';
    final char PARA='p';
    char t;
    TextConverter builder;
    RTFReader(TextConverter obj){
        builder=obj;
    }
    void parseRTF(Document doc){
        while ((t=doc.getNextToken())!= EOF){
            switch (t){
                case CHAR: builder.convertCharacter(t);
                case PARA: builder.convertParagraph();
            }
        }
    }
}
