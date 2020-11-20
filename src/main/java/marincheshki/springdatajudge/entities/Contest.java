package marincheshki.springdatajudge.entities;

import marincheshki.springdatajudge.entities.base.BaseEntity;

import java.util.Set;

public class Contest extends BaseEntity {
    private String name;
    private Category category;
    private Set<Problem> problems;
    private Set<User> contestants;
    private Set<MaxResultForContest> maxResultForContests;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Problem> getProblems() {
        return problems;
    }

    public void setProblems(Set<Problem> problems) {
        this.problems = problems;
    }

    public Set<User> getContestants() {
        return contestants;
    }

    public void setContestants(Set<User> contestants) {
        this.contestants = contestants;
    }

    public Set<MaxResultForContest> getMaxResultForContests() {
        return maxResultForContests;
    }

    public void setMaxResultForContests(Set<MaxResultForContest> maxResultForContests) {
        this.maxResultForContests = maxResultForContests;
    }
}
