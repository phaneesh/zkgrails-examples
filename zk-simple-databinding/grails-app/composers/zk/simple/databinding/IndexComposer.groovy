package zk.simple.databinding

import org.zkoss.zkgrails.*

//Index composer used to provide controller support for index.zul
class IndexComposer extends GrailsComposer {

    def lstSample

    def afterCompose = { window ->

    }

    //Get the list of person objects
    //TODO: Service should be used to perform CRUD and all function calls
    //Service dependency will be injected by Spring 
    public List<Person> getPersons() {
        return Person.list()
    }
}