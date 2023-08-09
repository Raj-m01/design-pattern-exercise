package net.media.training.designpattern.composite;

public interface Component {
    void setParent(Directory parent);
    String getName();
    int getSize();
    Directory getParent();
    void delete();
    void add(Component component);
    boolean isTraversible();
}