
package Dz32;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

        private String jdbcURL = "jdbc:mysql://localhost:3306/university_db";
        private String jdbcUsername = "ваш_користувач";
        private String jdbcPassword = "ваш_пароль";

        private static final String INSERT_STUDENT_SQL = "INSERT INTO students (first_name, last_name, age) VALUES (?, ?, ?)";
        private static final String SELECT_STUDENT_SQL = "SELECT * FROM students WHERE id = ?";

        public Student() {}

        protected Connection getConnection() {
            Connection connection = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            } catch (SQLException e) {

            } catch (ClassNotFoundException e) {

            }
            return connection;
        }

        public void insertStudent(Student student) throws SQLException {
            try (Connection connection = getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL)) {
                preparedStatement.setString(1, student.getFirstName());
                preparedStatement.setString(2, student.getLastName());
                preparedStatement.setInt(3, student.getAge());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {

            }
        }

        public Student selectStudent(int studentId) {
            Student student = null;
            try (Connection connection = getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENT_SQL)) {
                preparedStatement.setInt(1, studentId);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    int age = resultSet.getInt("age");
                    student = new Student(firstName, lastName, age);
                }
            } catch (SQLException e) {

            }
            return student;
        }
    }
}
