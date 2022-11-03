import java.util.List;

public class Fichier implements Component{
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<Component> getChild() {
        return null;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getNumberR() {
        return 0;
    }

    @Override
    public void delComponent(String name) {

    }

    @Override
    public void addComponent(Component c) {

    }

    @Override
    public void copy(Component c) {

    }

    @Override
    public String toStroing() {
        return null;
    }

    @Override
    public Component find(String nom) {
        return null;
    }
}
