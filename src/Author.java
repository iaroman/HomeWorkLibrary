public class Author {
    private String name;
    private String soname;

    public Author(String name, String soname) {
        this.name = name;
        this.soname = soname;
    }

    public String getName() {
        return name;
    }

    public String getSoname() {
        return soname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }
}
