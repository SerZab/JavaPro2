package de.telran.javaPro.lesson31_17082023.task5;

public class Package {

    private String from;
    private String to;

    public Package(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return String.format("Посылка {%s -> %s}", from, to);
    }
}
