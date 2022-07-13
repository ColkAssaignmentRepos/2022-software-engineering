import java.util.ArrayList;


public class Class implements Component {
    private String name;
    private ArrayList<Component> children;

    public Class(String n) {
        this.name = n;
        this.children = new ArrayList<Component>();
    }

    public void add(Component n) {
        this.children.add(n);
    }

    public ArrayList<Component> getChildren() {
        return this.children;
    }

    public String toString() {
        return this.name;
    }
}
