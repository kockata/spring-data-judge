package marincheshki.springdatajudge.entities;

import marincheshki.springdatajudge.entities.base.BaseEntity;

import java.util.Set;

public class Category extends BaseEntity {
    private String name;
    private Category parentCategory;
    private Set<Category> categories;
    private Set<Contest> contests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Contest> getContests() {
        return contests;
    }

    public void setContests(Set<Contest> contests) {
        this.contests = contests;
    }
}
