package ua.goit.javaDev8.hw5;

import ua.goit.javaDev8.hw5.dao.*;
import ua.goit.javaDev8.hw5.dbServices.DatabaseQueryService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<LongestProject> longestProjects = new DatabaseQueryService().findLongestProject();
        longestProjects.forEach(System.out::println);

        List<MaxProjectsClient> maxProjectsClients = new DatabaseQueryService().findMaxProjectsClient();
        maxProjectsClients.forEach(System.out::println);

        List<Worker> maxSalaryWorkers = new DatabaseQueryService().findMaxSalaryWorker();
        maxSalaryWorkers.forEach(System.out::println);

        List<YoungestEldestWorker> youngestEldestWorkerList = new DatabaseQueryService().findYoungestEldestWorkers();
        youngestEldestWorkerList.forEach(System.out::println);

        List<ProjectPrice> projectPriceList = new DatabaseQueryService().findProjectPrices();
        projectPriceList.forEach(System.out::println);

        long resultTime = System.currentTimeMillis() - startTime;
        System.out.println(resultTime);
    }
}