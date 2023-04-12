package domain.model;

/**
 * @autor raqueldarellimichelon
 * created on 12/04/23 inside the package - domain.model
 **/
public class Department {

    private String Slug;
    private String Name;

    public Department(String slug, String name) {
        Slug = slug;
        Name = name;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}


