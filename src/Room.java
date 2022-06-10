public class Room {

    int roomnumber;
    int number_of_students;

    Room(){

    }
    public Room(int roomNum) {
        try {
            if (roomNum > 99) {
                roomnumber = roomNum;
            } else {
                System.out.println("Room Not Created");
                throw new Exception("Invalid Room Number It should be of 3 digits");
            }
        } catch (Exception e) {
        }

    }

    public void addNewStudent() {
        try {
            if (number_of_students <= 5) {
                number_of_students++;
            } else {
                throw new Exception("Room is Already Full");
            }
        } catch (Exception e) {

        }
    }

    public void removeStudent(){
        try {
            if(number_of_students>=1){
                number_of_students--;
            }else{
                throw new Exception("Room is Already Empty");
            }
        } catch (Exception e) {

        }
    }
    public int getRoomNumber(){
        return roomnumber;
    }

    public int getNumberOfStudents(){
        return number_of_students;
    }


}
