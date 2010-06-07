import zk.ondemand.loading.Employee

class BootStrap {

     def init = { servletContext ->
           10000.times { i ->
            new Employee(firstName: "First Name $i", lastName: "Last Name $i").save()
        }
     }
     def destroy = {
     }
} 