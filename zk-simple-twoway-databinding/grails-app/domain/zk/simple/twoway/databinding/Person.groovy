package zk.simple.twoway.databinding

class Person {

    String firstName

    String lastName

    String fullName

    public String getFullName() {
        return firstName + " " + lastName
    }

    static constraints = {
    }
}
