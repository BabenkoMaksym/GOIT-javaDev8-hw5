package ua.goit.javaDev8.hw5.dbServices;

import ua.goit.javaDev8.hw5.Database;
import ua.goit.javaDev8.hw5.dao.*;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    private final String FIND_LONGEST_PROJECT_PATH = "sql/find_longest_project.sql";
    private final String FIND_MAX_PROJECTS_CLIENT_PATH = "sql/find_max_projects_client.sql";
    private final String FIND_MAX_SALARY_WORKER_PATH = "sql/find_max_salary_worker.sql";
    private final String FIND_YOUNGEST_ELDEST_WORKERS_PATH = "sql/find_youngest_eldest_workers.sql";
    private final String PRINT_PROJECT_PRICES_PATH = "sql/print_project_prices.sql";

    private DatabaseServices dbServices = null;

    public List<LongestProject> findLongestProject() {
        List<LongestProject> longestProjects = new ArrayList<>();
        dbServices = getDbServices();
        try (Connection conn = Database.getConnection(); Statement st = conn.createStatement()) {
            ResultSet resultSet = dbServices.queryDB(FIND_LONGEST_PROJECT_PATH, st);
            while (resultSet.next()) {
                conn.close();
                LongestProject lp = new LongestProject();
                lp.setProjectId(resultSet.getInt("id"));
                lp.setMonthCount(resultSet.getInt("month_count"));
                longestProjects.add(lp);
            }
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return longestProjects;
    }

    public List<MaxProjectsClient> findMaxProjectsClient() {
        List<MaxProjectsClient> maxProjectsClients = new ArrayList<>();
        dbServices = getDbServices();

        try (Connection conn = Database.getConnection(); Statement st = conn.createStatement()) {
            ResultSet resultSet = dbServices.queryDB(FIND_MAX_PROJECTS_CLIENT_PATH, st);
            while (resultSet.next()) {
                MaxProjectsClient mpc = new MaxProjectsClient();
                mpc.setClientName(resultSet.getString("name"));
                mpc.setProjectCount(resultSet.getInt("project_count"));
                maxProjectsClients.add(mpc);
            }
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return maxProjectsClients;
    }

    public List<Worker> findMaxSalaryWorker() {
        List<Worker> workers = new ArrayList<>();
        dbServices = getDbServices();
        try (Connection conn = Database.getConnection(); Statement st = conn.createStatement()) {
            ResultSet resultSet = dbServices.queryDB(FIND_MAX_SALARY_WORKER_PATH, st);
            while (resultSet.next()) {
                Worker worker = new Worker();
                worker.setWorkerID(resultSet.getInt("id"));
                worker.setFirstName(resultSet.getString("first_name"));
                worker.setLastName(resultSet.getString("last_name"));
                worker.setBirthday(resultSet.getDate("birthday").toLocalDate());
                worker.setSkillLevel(resultSet.getString("level"));
                worker.setSalary(resultSet.getInt("salary"));
                workers.add(worker);
            }
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return workers;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorkers() {
        List<YoungestEldestWorker> youngestEldestWorkerList = new ArrayList<>();
        dbServices = getDbServices();
        try (Connection conn = Database.getConnection(); Statement st = conn.createStatement()) {
            ResultSet resultSet = dbServices.queryDB(FIND_YOUNGEST_ELDEST_WORKERS_PATH, st);
            while (resultSet.next()) {
                YoungestEldestWorker yew = new YoungestEldestWorker();
                yew.setType(resultSet.getString("type"));
                yew.setFirstName(resultSet.getString("first_name"));
                yew.setLastName(resultSet.getString("Last_name"));
                yew.setBirthday(resultSet.getDate("birthday").toLocalDate());
                youngestEldestWorkerList.add(yew);
            }
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return youngestEldestWorkerList;
    }

    public List<ProjectPrice> findProjectPrices() {
        List<ProjectPrice> projectPriceList = new ArrayList<>();
        dbServices = getDbServices();
        try (Connection conn = Database.getConnection(); Statement st = conn.createStatement()) {
            ResultSet resultSet = dbServices.queryDB(PRINT_PROJECT_PRICES_PATH, st);
            while (resultSet.next()) {
                ProjectPrice projectPrice = new ProjectPrice();
                projectPrice.setProject_id(resultSet.getInt("project_id"));
                projectPrice.setProjectCost(resultSet.getLong("proj_cost"));
                projectPriceList.add(projectPrice);
            }
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return projectPriceList;
    }

    private DatabaseServices getDbServices() {
        if (dbServices == null) {
            dbServices = new DatabaseServices();
        }
        return dbServices;
    }
}
