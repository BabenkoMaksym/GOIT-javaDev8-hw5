package ua.goit.javaDev8.hw5.dao;

public class ProjectPrice {
    Integer project_id;
    Long projectCost;

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public Long getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(Long projectCost) {
        this.projectCost = projectCost;
    }

    @Override
    public String toString() {
        return "ProjectPrice{" +
                "project_id=" + project_id +
                ", projectCost=" + projectCost +
                '}';
    }
}
