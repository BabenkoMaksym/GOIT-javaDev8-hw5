package ua.goit.javaDev8.hw5.dao;

import java.time.LocalDate;

public class Project {
    private int clientId;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Project(int clientId, LocalDate startDate, LocalDate finishDate) {
        this.clientId = clientId;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public int getClient_id() {
        return clientId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }
}
