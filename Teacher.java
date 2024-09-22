public class Teacher extends User {

    private Integer teacherId;

    public Teacher(Integer integer, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "firstName" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", middleNAme='" + super.getMiddleName() + '\'' +
                '}';

    }
}
