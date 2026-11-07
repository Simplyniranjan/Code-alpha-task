
import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Double> marks = new ArrayList<>();

    Student(String name, ArrayList<Double> marks) {
        this.name = name;
        this.marks = marks;
    }

    double average() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.size();
    }

    double highest() {
        double high = marks.get(0);
        for (double mark : marks) {
            if (mark > high) high = mark;
        }
        return high;
    }

    double lowest() {
        double low = marks.get(0);
        for (double mark : marks) {
            if (mark < low) low = mark;
        }
        return low;
    }
}
