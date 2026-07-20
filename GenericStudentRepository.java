import java.util.ArrayList;

public class GenericStudentRepository {

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

        public void remove(int index) {
            if (index >= 0 && index < items.size()) {
                items.remove(index);
                System.out.println("Item removed.");
            } else {
                System.out.println("Invalid index.");
            }
        }

        public int size() {
            return items.size();
        }

        public void displayAll() {
            if (items.isEmpty()) {
                System.out.println("No items found.");
            } else {
                for (T item : items) {
                    System.out.println(item);
                }
            }
        }
    }

    static class Student {
        private String studentId;
        private String name;
        private double mark;

        public Student(String studentId, String name, double mark) {
            this.studentId = studentId;
            this.name = name;
            this.mark = mark;
        }

        @Override
        public String toString() {
            return studentId + " - " + name + " - Mark: " + mark;
        }
    }

    public static void main(String[] args) {
        Repository<Student> students = new Repository<>();

        students.add(new Student("STU1001", "Alex Tan", 88.5));
        students.add(new Student("STU1002", "Mei Ling", 76.0));
        students.add(new Student("STU1003", "Ravi Kumar", 92.0));

        System.out.println("All Students");
        System.out.println("------------");
        students.displayAll();

        System.out.println();
        System.out.println("Total students: " + students.size());

        System.out.println();
        students.remove(1);

        System.out.println();
        System.out.println("After Removing One Student");
        System.out.println("--------------------------");
        students.displayAll();
    }
}
