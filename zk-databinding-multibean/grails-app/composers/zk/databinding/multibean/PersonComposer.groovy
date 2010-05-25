package zk.databinding.multibean

import org.zkoss.zkgrails.*
import org.zkoss.zul.Listbox

class PersonComposer extends GrailsComposer {


    //Models to store 
    def persons
    def departments

    def lstDepartments
    def lstPersons


    def afterCompose = { window ->
        persons = Person.list()
        departments = Department.list()
    }

    def saveData_onClick() {
        ((Listbox)lstPersons).model.each { p ->
            p.save()
        }
        ((Listbox)lstDepartments).model.each { d ->
            d.save()
        }

    }
}
