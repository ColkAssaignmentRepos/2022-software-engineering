import java.util.ArrayList;


public class Interface extends Class {
    private ArrayList<Component> children;

    public Interface(String n) {
        super(n);

        this.children = new ArrayList<Component>();
    }

    public void add(Component n) {
        this.children.add(n);
    }

    public ArrayList<Component> getChildren() {
        return this.children;
    }

    public String toString() {
        return "<<interface>>" + " " + this.name;
    }
}
