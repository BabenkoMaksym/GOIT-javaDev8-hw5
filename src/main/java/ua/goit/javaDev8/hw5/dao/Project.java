package ua.goit.javaDev8.hw5.dao;

import java.time.LocalDate;

public class Project {
    public int projId;
    public LocalDate startDate;
    public LocalDate finishDate;

    public Project(int projId, LocalDate startDate, LocalDate finishDate) {
        this.projId = projId;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public int getProjId() {
        return projId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }
}
