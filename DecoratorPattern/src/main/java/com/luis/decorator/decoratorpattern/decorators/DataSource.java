package com.luis.decorator.decoratorpattern.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
