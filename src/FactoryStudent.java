public class FactoryStudent {

    public String FactoryStudent(Student typeStudent, int id, String name) {
        switch (typeStudent) {
            case StudentHistory:
                return new StudentHistory;
            case StudentMath:
                return "数学";
            default:
                throw new IllegalArgumentException("");
        }
    }
}
