package ua.goit.javaDev8.hw5.dbServices;

import ua.goit.javaDev8.hw5.dao.Project;
import ua.goit.javaDev8.hw5.dao.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PopulateValues {

    public List<List<Integer>> createProjectWorkerList() {
        List<List<Integer>> projWorkerList = new ArrayList<>();
        projWorkerList.add(List.of(1, 1));
        projWorkerList.add(List.of(1, 2));
        projWorkerList.add(List.of(1, 4));
        projWorkerList.add(List.of(1, 5));
        projWorkerList.add(List.of(1, 7));
        projWorkerList.add(List.of(2, 6));
        projWorkerList.add(List.of(2, 3));
        projWorkerList.add(List.of(2, 2));
        projWorkerList.add(List.of(2, 1));
        projWorkerList.add(List.of(3, 1));
        projWorkerList.add(List.of(3, 2));
        projWorkerList.add(List.of(3, 3));
        projWorkerList.add(List.of(3, 4));
        projWorkerList.add(List.of(3, 5));
        projWorkerList.add(List.of(4, 1));
        projWorkerList.add(List.of(4, 3));
        projWorkerList.add(List.of(4, 5));
        projWorkerList.add(List.of(4, 7));
        projWorkerList.add(List.of(5, 5));
        projWorkerList.add(List.of(5, 1));
        projWorkerList.add(List.of(5, 6));
        projWorkerList.add(List.of(5, 7));
        projWorkerList.add(List.of(6, 1));
        projWorkerList.add(List.of(7, 4));
        projWorkerList.add(List.of(7, 2));
        projWorkerList.add(List.of(8, 2));
        projWorkerList.add(List.of(8, 1));
        projWorkerList.add(List.of(8, 6));
        projWorkerList.add(List.of(8, 4));
        projWorkerList.add(List.of(9, 5));
        projWorkerList.add(List.of(9, 1));
        projWorkerList.add(List.of(9, 3));
        projWorkerList.add(List.of(9, 7));
        projWorkerList.add(List.of(9, 2));
        projWorkerList.add(List.of(10, 7));


        return projWorkerList;
    }


    public List<String> createClientList() {
        return List.of(
                "Petro Rocket",
                "Petro Bumper",
                "Valeriy Repin",
                "Olga Komarova",
                "Anna Milevskaya"
        );

    }
    public List<Project> createProjectsList() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, LocalDate.parse("2020-02-01"), LocalDate.parse("2021-02-01")));
        projects.add(new Project(2, LocalDate.parse("2020-02-01"), LocalDate.parse("2022-04-01")));
        projects.add(new Project(2, LocalDate.parse("2020-02-01"), LocalDate.parse("2025-03-01")));
        projects.add(new Project(2, LocalDate.parse("2020-02-01"), LocalDate.parse("2023-11-01")));
        projects.add(new Project(3, LocalDate.parse("2020-02-01"), LocalDate.parse("2022-12-01")));
        projects.add(new Project(4, LocalDate.parse("2020-02-01"), LocalDate.parse("2024-07-01")));
        projects.add(new Project(5, LocalDate.parse("2020-02-01"), LocalDate.parse("2022-08-01")));
        projects.add(new Project(3, LocalDate.parse("2020-02-01"), LocalDate.parse("2021-10-01")));
        projects.add(new Project(1, LocalDate.parse("2020-02-01"), LocalDate.parse("2024-11-01")));
        projects.add(new Project(1, LocalDate.parse("2020-02-01"), LocalDate.parse("2026-07-01")));

        return projects;
    }


    public List<Worker> createWorkersList() {
        List<Worker> workers = new ArrayList<>();

        Worker worker = new Worker();
        worker.setWorkerID(1);
        worker.setFirstName("Maksym");
        worker.setLastName("Babenko");
        worker.setBirthday(LocalDate.parse("1993-12-14"));
        worker.setSkillLevel("Junior");
        worker.setSalary(700);
        workers.add(worker);

        worker = new Worker();
        worker.setWorkerID(2);
        worker.setFirstName("Ilon");
        worker.setLastName("Mask");
        worker.setBirthday(LocalDate.parse("1970-11-05"));
        worker.setSkillLevel("Senior");
        worker.setSalary(70000);
        workers.add(worker);

        worker = new Worker();
        worker.setWorkerID(3);
        worker.setFirstName("Mark");
        worker.setLastName("Ivanov");
        worker.setBirthday(LocalDate.parse("1985-03-29"));
        worker.setSkillLevel("Middle");
        worker.setSalary(2350);
        workers.add(worker);

        worker = new Worker();
        worker.setWorkerID(4);
        worker.setFirstName("Victor");
        worker.setLastName("Pupkin");
        worker.setBirthday(LocalDate.parse("1990-09-03"));
        worker.setSkillLevel("Trainee");
        worker.setSalary(500);
        workers.add(worker);

        worker = new Worker();
        worker.setWorkerID(5);
        worker.setFirstName("Valera");
        worker.setLastName("Ostapchuk");
        worker.setBirthday(LocalDate.parse("1987-11-23"));
        worker.setSkillLevel("Middle");
        worker.setSalary(3000);
        workers.add(worker);

        worker = new Worker();
        worker.setWorkerID(6);
        worker.setFirstName("Anna");
        worker.setLastName("Tokareva");
        worker.setBirthday(LocalDate.parse("1991-02-23"));
        worker.setSkillLevel("Senior");
        worker.setSalary(5200);
        workers.add(worker);

        worker = new Worker();
        worker.setWorkerID(7);
        worker.setFirstName("Mary");
        worker.setLastName("Boyko");
        worker.setBirthday(LocalDate.parse("1998-07-18"));
        worker.setSkillLevel("Junior");
        worker.setSalary(800);
        workers.add(worker);


        return workers;

    }
}
