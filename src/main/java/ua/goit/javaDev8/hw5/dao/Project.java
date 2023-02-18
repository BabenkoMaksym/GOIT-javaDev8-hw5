package ua.goit.javaDev8.hw5.dao;

import java.time.LocalDate;

public class Project {
    private int client_id;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Project(int projId, LocalDate startDate, LocalDate finishDate) {
        this.client_id = projId;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public int getClient_id() {
        return client_id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }
}
