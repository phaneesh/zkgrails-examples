
package zk.simple.databinding

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
