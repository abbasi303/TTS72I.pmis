public class Main {

    public static void main(String[] args) {
        Room r=new Room(13);
        r.addNewStudent();
        r.addNewStudent();
        r.addNewStudent();
        r.removeStudent();
        System.out.println(r.getRoomNumber());
        System.out.println(r.getNumberOfStudents());
    }


}
