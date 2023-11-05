public class Client {
    private String name;
    private boolean hasHaircut;

    private boolean hasManicure;

    public void setName(String name) {
        this.name = name;
    }

    public void setHasHaircut(boolean hasHaircut) {
        this.hasHaircut = hasHaircut;
    }

    public void setHasManicure(boolean hasManicure) {
        this.hasManicure = hasManicure;
    }

    public Client(String name) {
        this.name = name;
        this.hasHaircut = false;
        this.hasManicure = false;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", hasHaircut=" + hasHaircut +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isHasHaircut() {
        return hasHaircut;
    }
}
