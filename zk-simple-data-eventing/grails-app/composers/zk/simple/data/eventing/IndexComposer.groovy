package zk.simple.data.eventing

import org.zkoss.zkgrails.*

class IndexComposer extends GrailsComposer {

    def selectedItem
    
    def afterCompose = { window ->
        // initialize components here
    }

    //Get the list of person objects
    //TODO: Service should be used to perform CRUD and all function calls
    //Service dependency will be injected by Spring
    public List<Person> getPersons() {
        return Person.list()
    }
}
