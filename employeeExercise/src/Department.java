public class Department {
    String name;
    int depId;
    String country;
    String city;

    public Department(String name, int depId, String country, String city) {
        this.name = name;
        this.depId = depId;
        this.country = country;
        this.city = city;
    }

    public Department() {
        this("Test", 123, "Neverland", "Gotham");
    }

    public boolean isEquals(Department o) {
        return this.depId == o.depId;
    }
}
