import java.time.LocalDate;
import java.util.Scanner;

class Employee {
    // Khai báo Enum
    enum Gender {
        NAM, NU
    }
    // TODO: Khai báo các thuộc tính
    private String id;
    private String name;
    private LocalDate birthday;
    private Gender gender;
    private double salary;


    // TODO: Viết hàm khởi tạo
    public Employee(String id, String name, LocalDate birthday, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setGender(Gender gender)   {
        this.gender = gender;
    }
}

public class Main {

    public static Employee findEmployeeById(Employee[] employees, String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // TODO: Khởi tạo danh sách nhân viên
        Employee[] employees = {
            new Employee("NV001", "Nguyen Van A", LocalDate.of(1990, 1, 1), Employee.Gender.NAM, 1000),
            new Employee("NV002", "Nguyen Van B", LocalDate.of(1991, 1, 12), Employee.Gender.NAM, 2000),
            new Employee("NV003", "Nguyen Van C", LocalDate.of(1992, 3, 1), Employee.Gender.NAM, 1001),
            new Employee("NV004", "Nguyen Van D", LocalDate.of(1993, 1, 12), Employee.Gender.NAM, 1500),
            new Employee("NV005", "Nguyen Van E", LocalDate.of(1994, 1, 1), Employee.Gender.NAM, 1060)
        };

        // 1. Tìm nhân viên theo id
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id nhân viên cần tìm: ");
        String id = scanner.nextLine();
        Employee employee = findEmployeeById(employees, id);




        // 2. Tìm nhân viên theo tên



        // 3. Đếm số nhân viên nam, nữ



        // 4. Liệt kê các nhân viên trên 30 tuổi




        // 5. Kiểm tra nhân viên có sinh nhật trong tháng nhập vào


        // 6. In ra top 3 người có lương tháng cao nhất

    }
}