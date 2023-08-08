package net.media.training.designpattern.composite;

public interface FolderItem {

    public void setParent(Directory parent);

    public String getName();

    public int getSize();

    public Directory getParent();

}
