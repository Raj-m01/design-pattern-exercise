package solid.live.dip;

public interface Writer<T> {
    public void write(String text, T writePath);
}
