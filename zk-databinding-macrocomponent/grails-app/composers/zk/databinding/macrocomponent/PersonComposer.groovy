package zk.databinding.macrocomponent

import org.zkoss.zkgrails.*

class PersonComposer extends GrailsComposer {

    def person

    def afterCompose = { window ->
        person = Person.findById(1)
    }
}
