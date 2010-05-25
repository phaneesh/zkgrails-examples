package zk.databinding.multibean

class Person {

    String firstName

    String lastName

    String fullName
    
    static constraints = {
    }

    public String getFullName() {
        return firstName +" " +lastName;
    }
}
