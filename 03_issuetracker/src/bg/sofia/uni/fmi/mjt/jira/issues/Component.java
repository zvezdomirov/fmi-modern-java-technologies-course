package bg.sofia.uni.fmi.mjt.jira.issues;

import java.util.Objects;

public class Component {
    private String name;
    private String shortName;

    public Component(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return name.equals(component.name) &&
                shortName.equals(component.shortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortName);
    }
}
