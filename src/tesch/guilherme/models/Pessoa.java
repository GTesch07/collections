package tesch.guilherme.models;

import java.util.Objects;

public class Pessoa {
    private Long id;

    private String name;

    public Pessoa() {

    }

    public Pessoa(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{'id': " + id + ", 'name': '" + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pessoa))
            return false;
        Pessoa user = (Pessoa) o;
        return id.equals(user.id) && name.equals(user.name);
    }

    @Override // Utilizado para saber se o elemento já está presente na lista
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
