package zk.databinding.singleinstance

import org.zkoss.zkgrails.*

class PersonComposer extends GrailsComposer {

    //person model
    def person

    //Controls
    def personId
    def firstName
    def lastName
    //Annotation binder
    def binder

    def afterCompose = { window ->
        person = new Person()
    }

    def onChange_personId() {
        person = Person.findById(personId.value)
        binder.loadComponent(firstName)
        binder.loadComponent(lastName)
    }

    def onClick_savePerson() {

    }

}
