package tesch.guilherme.models;

import java.util.Objects;

public class User {
    private int id;
    private String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("""
                {'id': %s
                 'name': %s}
                """, id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (Objects.isNull(obj) || (!(obj instanceof User user)))
            return false;
        return this.id == user.getId() && Objects.equals(user.getName(), this.name);
    }
}
