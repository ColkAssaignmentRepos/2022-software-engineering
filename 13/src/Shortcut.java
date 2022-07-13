import java.util.ArrayList;

public class Shortcut extends File {
    private String path;

    public Shortcut(String n, String e, String p) {
        super(n, e);

        this.path = p;
    }

    @Override
    public String toString() {
        String retval;
        retval = super.toString() + " -> " + this.path;

        return retval;
    }
}
