package namingconvention;

public interface DrawableCircel {

//    Follow the same rules as class names (PascalCase).
//    Use singular nouns to represent a fixed set of constants.


    enum Day { MONDAY, TUESDAY, WEDNESDAY }
    enum Status { ACTIVE, INACTIVE, PENDING }


//    Use camelCase.
//    Be descriptive and meaningful.
//    Avoid single-letter names unless the context is clear.
    default void setEmployeeName(String employeeName) {

    }
    default void calculateInterest(double principalAmount, int years) {

    }

//    Use prefixes like is, has, can, or should to indicate a true/false condition.
    boolean isActive = false;
    boolean hasPermission();
    boolean canExecute();

}
