import java.util.ArrayList;

public class GenericRepositoryDemo {

    static class Repository<T> {
        private ArrayList<T> items = new ArrayList<>();

        public void add(T item) {
            items.add(item);
        }

        public T get(int index) {
            if (index >= 0 && index < items.size()) {
                return items.get(index);
            }

            return null;
        }

        public int size() {
            return items.size();
        }

        public void displayAll() {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }

    static class Student {
        private String studentId;
        private String name;

        public Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        @Override
        public String toString() {
            return studentId + " - " + name;
        }
    }

    public static void main(String[] args) {
        Repository<Student> studentRepository = new Repository<>();

        studentRepository.add(new Student("STU1001", "Alex Tan"));
        studentRepository.add(new Student("STU1002", "Mei Ling"));
        studentRepository.add(new Student("STU1003", "Ravi Kumar"));

        System.out.println("Student Repository");
        System.out.println("------------------");
        studentRepository.displayAll();

        System.out.println();
        System.out.println("Total students: " + studentRepository.size());
    }
}
