package ua.goit.javaDev8.hw5.dbServices;

import ua.goit.javaDev8.hw5.Database;

public class DatabaseInitService {


    public static void main(String[] args) {
        DatabaseServices dbServices = new DatabaseServices();
        dbServices.initDB();
    }
}
