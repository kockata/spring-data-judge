package marincheshki.springdatajudge.entities;

import marincheshki.springdatajudge.entities.base.BaseEntity;

import java.util.Set;

public class Problem extends BaseEntity {
    private String name;
    private Contest contest;
    private Set<Submission> submissions;
    private Set<User> users;
    private Set<MaxResultForProblem> maxResultForProblems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    public Set<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Set<Submission> submissions) {
        this.submissions = submissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<MaxResultForProblem> getMaxResultForProblems() {
        return maxResultForProblems;
    }

    public void setMaxResultForProblems(Set<MaxResultForProblem> maxResultForProblems) {
        this.maxResultForProblems = maxResultForProblems;
    }
}
