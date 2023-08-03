package solid.live.dip;

public class DatabaseWriter implements Writer<MyDatabase>{
    @Override
    public void write(String text, MyDatabase database) {
        database.write(text);
    }
}
