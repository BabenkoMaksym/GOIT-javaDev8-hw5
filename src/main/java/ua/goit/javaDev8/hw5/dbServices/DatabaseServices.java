package ua.goit.javaDev8.hw5.dbServices;

import ua.goit.javaDev8.hw5.Database;
import ua.goit.javaDev8.hw5.dao.Project;
import ua.goit.javaDev8.hw5.dao.Worker;

import java.io.*;
import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseServices {

    Connection conn;
    StringBuilder sql;
    Statement st;
    PreparedStatement pst;

    public DatabaseServices() {
        conn = Database.getConnection();
        sql = new StringBuilder();
        st = null;
    }

    public void initDB() {
        String defaultFilePath = "sql/init_db.sql";
        initDB(defaultFilePath);
    }

    public void populateDB() {
        String defaultFilePath = "sql/populate_db.sql";
        populateDB(defaultFilePath);
    }

    public void initDB(String filePath) {
        try {
            st = conn.createStatement();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
            while (true) {
                String s = reader.readLine();
                if (s != null) {
                    sql.append(s);
                    if (s.contains(";")) {
                        st.execute(sql.toString().trim());
                        sql.setLength(0);
                    }
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateDB(String filePath) {
        try {
            st = conn.createStatement();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
            while (true) {
                String s = reader.readLine();
                if (s != null) {
                    sql.append(s);
                } else {
                    int executeResult = st.executeUpdate(sql.toString().trim());
                    System.out.println(executeResult);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet queryDB(String sqlStrPath) {
        ResultSet resultSet = null;
        try {
            st = conn.createStatement();
            BufferedReader reader = new BufferedReader(new FileReader(new File(sqlStrPath)));
            String sqlStr = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            resultSet = st.executeQuery(sqlStr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void populateDBTableWorker(List<Worker> workers) {
        String sql ="INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES (?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            for (Worker worker : workers) {
                pst.setString(1, worker.getFirstName());
                pst.setString(2, worker.getLastName());
                pst.setDate(3, Date.valueOf(worker.getBirthday()));
                pst.setString(4, worker.getSkillLevel());
                pst.setInt(5, worker.getSalary());
                pst.addBatch();
            }
            pst.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void populateDBTableClient (List<String> clientNames) {
        String sql = "INSERT into public.client (client_name) values (?)";
        try {
            pst = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            try {
                for (String name : clientNames) {
                    pst.setString(1, name);
                    pst.executeBatch();
                }
            }  catch(Exception ex) {
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void populateDBTableProject (List<Project> projects) {
        String sql = "insert into public.project (client_id, start_date, finish_date) values (?, ?, ?)";

        try {
            pst = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            try {
                for (Project proj : projects) {
                    pst.setInt(1, proj.getProjId());
                    pst.setDate(2, Date.valueOf(proj.getStartDate()));
                    pst.setDate(2, Date.valueOf(proj.getFinishDate()));
                    pst.executeBatch();
                }
            }  catch(Exception ex) {
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void populateDBTableProjectWorker(List<List<Integer>> projWorkerList) {
        String sql = "insert into public.project_worker (project_id, worker_id) values (?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            try {
                for (List<Integer> projWork: projWorkerList) {
                    pst.setInt(1, projWork.get(0));
                    pst.setInt(2, projWork.get(1));

                    pst.executeBatch();
                }
            }  catch(Exception ex) {
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
