package zk.simple.twoway.databinding

import org.zkoss.zkgrails.*
import org.zkoss.zul.Listbox

//Index composer used to provide controller support for index.zul
class IndexComposer extends GrailsComposer {

    def lstSample

    def persons

    def afterCompose = { window ->
        persons = Person.list()
    }
}