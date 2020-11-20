package marincheshki.springdatajudge.entities;

import marincheshki.springdatajudge.entities.base.BaseEntity;

public class Submission extends BaseEntity {
    private User user;
    private Strategy strategy;
    private Double performance;
    private Double points;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double getPerformance() {
        return performance;
    }

    public void setPerformance(Double performance) {
        this.performance = performance;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }
}
