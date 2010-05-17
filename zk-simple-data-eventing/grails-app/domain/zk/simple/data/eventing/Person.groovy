package zk.simple.data.eventing

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
