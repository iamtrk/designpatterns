package com.iamtrk.designpatterns.builder;

public class ASCIITextConverter extends TextConverter {
    ASCIIText asciiTextObj;

    @Override
    void convertCharacter(char c) {
        char asciiChar = new Character(c).charValue();
        asciiTextObj.append(c);

    }

    @Override
    void convertParagraph() {

    }

    ASCIIText getResult() {
        return asciiTextObj;
    }
}
