package zk.databinding.validation

import org.zkoss.zkgrails.*

class IndexComposer extends GrailsComposer {

    def selectedItem

    def afterCompose = { window ->
        // initialize components here
    }

    public List<Person> getPersons() {
        return Person.list()
    }
}
