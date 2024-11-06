public class FactoryStudent {
    private int id;
    private String name;

    public static Student getStudent(TypeStudent typeStudent) {
        switch (typeStudent) {
            case MATHSTUDENT:
                return new StudentMath();
            case HISTORYSTUDENT:
                return new StudentHIstory();
            default:
                throw new IllegalArgumentException("Type black is unsupported");
        }
    }

}
