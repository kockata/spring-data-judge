package marincheshki.springdatajudge.entities;

import marincheshki.springdatajudge.entities.base.BaseEntity;

import java.util.Set;

public class Strategy extends BaseEntity {
    private String name;
    private Set<Contest> contest;

}
