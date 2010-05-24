package zk.simple.twoway.databinding

import org.zkoss.zkgrails.*
import org.zkoss.zul.Listbox

//Index composer used to provide controller support for index.zul
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

    //Save or Update the model back to the database when Update button is clicked on the UI
    def onClick_doSubmit() {
        persons.each { p->
            p.save()
        }
    }
}