package section19;

class WhiteBoard {
    String content;
    int noOfStudents = 3;

    int countTimesRead = 0;

    private void updateReactCount(){
        countTimesRead++;
    }

    WhiteBoard(String content) {
        this.content = content;
    }

    synchronized public String getContent() {
        while(countTimesRead == 3){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        countTimesRead++;
        if(countTimesRead == 3){
            notify();
        }
        return content;
    }

    synchronized public void setContent(String content) {
        while (countTimesRead != 3){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.content = content;
        countTimesRead = 0;
        notifyAll();
    }
}

class Teacher extends Thread {
    WhiteBoard whiteBoard;

    Teacher(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            whiteBoard.setContent(Integer.toString(i));
            System.out.println("Teacher: " + i);
            i++;
        }
        // Do something
    }
}

class Student1 extends Thread {
    WhiteBoard whiteBoard;

    Student1(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("1: " + whiteBoard.getContent());
        }
    }
}

class Student2 extends Thread {
    WhiteBoard whiteBoard;

    Student2(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("2: " + whiteBoard.getContent());
        }
    }
}

class Student3 extends Thread {
    WhiteBoard whiteBoard;

    Student3(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("3: " + whiteBoard.getContent());
        }
    }
}

public class Lecture197 {
    public static void main(String[] args) {
        WhiteBoard whiteBoard = new WhiteBoard("");

        Teacher teacher = new Teacher(whiteBoard);
        Student1 student1 = new Student1(whiteBoard);
        Student2 student2 = new Student2(whiteBoard);
        Student3 student3 = new Student3(whiteBoard);

        teacher.start();
        student1.start();
        student2.start();
        student3.start();
//        Student1 student1 = new Student1()

    }
}
