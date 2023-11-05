//Создайте класс Student со следующими полями:
// String fName, String lName, int doneHomeWork, int missingLesson}.
// Реализуйте в нем интерфейс Comparable. Студенты должны быть сравниваемы по количеству пропущенных уроков.
// Создайте список студентов, отсортируйте этот список в порядке по возрастанию пропущенных студентом уроков.
public  class Student implements Comparable <Student>{
    private String fName;
    private String lName;
    private int doneHomeWork;// сделано Домашняя Работа
    private int missingLesson;//количеству пропущенных уроков

    public Student(String fName, String lName, int doneHomeWork, int missingLesson) {
        this.fName = fName;
        this.lName = lName;
        this.doneHomeWork = doneHomeWork;
        this.missingLesson = missingLesson;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public String toString() {
        return fName + "," + lName + "," + doneHomeWork + "," + missingLesson + "\n";
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getDoneHomeWork() {
        return doneHomeWork;
    }

    public int getMissingLesson() {
        return missingLesson;
    }
}
