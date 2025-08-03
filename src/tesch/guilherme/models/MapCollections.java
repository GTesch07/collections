package tesch.guilherme.models;

public class MapCollections {
    private String key;
    private int value;

    public MapCollections() {

    }

    public MapCollections(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("""
                Key   = %s
                Value = %s
                """, key, value);
    }
}
