package files.playground.csv.files.Files;

public class City {
    private String name;
    private String state;
    private String ns;

    public City(String name, String state, String ns) {
        this.name = name;
        this.state = state;
        this.ns = ns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", ns='" + ns + '\'' +
                '}';
    }
}
