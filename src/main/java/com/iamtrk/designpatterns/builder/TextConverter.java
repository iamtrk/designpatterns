package com.iamtrk.designpatterns.builder;

/**
 * Abstract builder.
 * **/
public abstract class TextConverter {

    abstract void convertCharacter(char c);
    abstract void convertParagraph();
}
