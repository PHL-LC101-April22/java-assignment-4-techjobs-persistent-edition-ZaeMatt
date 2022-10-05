package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Object employer;

    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job( Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Object getEmployer() {
        return employer;
    }

    public void setEmployer(Object employer) {
        this.employer = employer;
    }

    public void setSkills(List<Skill> skill) {
        this.skills = skill;
    }

    public List<Skill> getSkills() {
        return skills;
    }


    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }
}