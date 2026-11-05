import java.util.*;

class Students {

    int id;
    int marks;
    String name;

    Students(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

class Markcomparator implements Comparator<Students> {

    public int compare(Students s1, Students s2) {
        return s1.marks - s2.marks;
    }
}

class Comparator2 {

    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students(1, 90, "ELEVEN"));
        students.add(new Students(2, 80, "MIKE"));
        students.add(new Students(3, 85, "DUSTIN"));
        students.add(new Students(4, 95, "LUCAS"));
        students.add(new Students(5, 70, "MAXX"));

        Collections.sort(students, (s1, s2) -> (s1.marks-s2.marks));

        System.out.println(students);
    }
}