package zk.databinding.validation

class Person {

    String firstName
    String lastName
    String fullName
    Integer age

    public String getFullName() {
        return firstName +", " +lastName
    }

    static constraints = {
        
    }
}
