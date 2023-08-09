package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements Component {
    private final String name;
    private final List<Component> components;
    private Directory parent;

    public String getName() {
        return name;
    }
    
    public Directory(String name, List<Component> components) {
        this.name = name;
        this.components = components;

        for (Component component : components) {
            component.setParent(this);
        }
    }

    public int getSize() {
        int sum = 0;

        for (Component component : components) {
            sum += component.getSize();
        }

        return sum;
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }
    
    public void delete() {
        while(components.size() > 0) {
            Component component = components.get(0);
            component.delete();
        }

        getParent().removeEntry(this);
    }

    public void removeEntry(Component component) {
        components.remove(component);
    }

    public void add(Component component) {
        components.add(component);
    }

    private boolean fileExists(String name) {
        for (Component component : components) {
            if (!isTraversible() && component.getName().equals(name)) {
                return true;
            }
            if(isTraversible() && component.fileExists(name)) {
                return true;
            }
        }

        return false;
    }

    private boolean directoryExists(String name) {
        if (getName().equals(name))
            return true;
        
        for (Component component : components) {
            if(isTraversible()) {
                if(component.getName().equals(name))
                    return true;
                else
                    return component.directoryExists();
            }
        }
        
        return false;
    }

    public List<Component> getComponents() {
        return components;
    }

    private isTraversible() {
        return true;
    }

    public Directory getParent() {
        return parent;
    }
}
