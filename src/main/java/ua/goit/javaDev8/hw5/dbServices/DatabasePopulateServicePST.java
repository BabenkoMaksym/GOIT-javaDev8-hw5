package ua.goit.javaDev8.hw5.dbServices;

import ua.goit.javaDev8.hw5.Database;

public class DatabasePopulateServicePST {
    public static void main(String[] args) {
        DatabaseServices dbServices = new DatabaseServices();
        PopulateValues pv = new PopulateValues();
        dbServices.populateDBTableWorker(pv.createWorkersList());
        dbServices.populateDBTableClient(pv.createClientList());
        dbServices.populateDBTableProject(pv.createProjectsList());
        dbServices.populateDBTableProjectWorker(pv.createProjectWorkerList());
    }


}
