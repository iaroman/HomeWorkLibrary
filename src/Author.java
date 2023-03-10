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
    @Override
    public boolean equals(Object obj) {
        Author author = (Author) obj;
        if (name != author.name) return false;
        if (soname != author.soname) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 31 * name.hashCode();
        result += 31 * soname.hashCode();
        return result;
    }
}
