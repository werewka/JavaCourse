package school.lesson3;

public class Lesson3 {
           public static void main(String[] args) {
            Employee[] empCorp = new Employee[5];
            empCorp[0] = new Employee("John Lee", "AQA Engineer", "johnlee@gmail.com", "0679312312",2000,41);
            empCorp[1] = new Employee("Jennifer Whong", "FrontEnd developer", "jennywhong@gmail.com", "0972312314",2500,32);
            empCorp[2] = new Employee("Bree Huang", "System Architect", "breehuang@gmail.com", "0933123515",6000,43);
            empCorp[3] = new Employee("Steve Jibs", "Team Lead", "steve@gmail.com", "0983123167",5000,28);
            empCorp[4] = new Employee("Marry Smith", "HR", "marrysmith@gmail.com", "093123175",3000,21);
            for (Employee employee : empCorp)
                if (employee.getAge()>40)
                    System.out.println(employee);

        }
    }
    class Employee {
        private final String name;
        private final String position;
        private final String email;
        private final String phone;
        private final int salary;
        private final int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }
    }