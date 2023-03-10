import java.util.Objects;

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
    @Override
    public String toString() {
        return name + " " + soname;
    }
    /*
    @Override
    public boolean equals(Object obj) {
        Author author = (Author) obj;
        return (soname == author.soname) && (name == author.name);
    }
    @Override
    public int hashCode() {
        int result = 31 * name.hashCode();
        result += 31 * soname.hashCode();
        return result;
    }
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(soname, author.soname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, soname);
    }
}
