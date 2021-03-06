package org.kie.builder;

public interface Message {
    long getId();

    Level getLevel();

    String getPath();

    int getLine();
    int getColumn();

    String getText();

    public static enum Level {
        ERROR, WARNING, INFO;
    }
}
