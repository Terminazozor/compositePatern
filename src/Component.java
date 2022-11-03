import java.util.List;

public interface Component {
    int getSize();
    List<Component> getChild();
    int getNumber();
    int getNumberR();
    void delComponent(String name);
    void addComponent(Component c);
    void copy(Component c);
    String toStroing();
    Component find(String nom);
}
