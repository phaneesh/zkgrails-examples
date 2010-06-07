package zk.ondemand.loading

import org.zkoss.zk.ui.event.ForwardEvent
import org.zkoss.zkgrails.GrailsComposer

class EmployeeComposer extends GrailsComposer {

    def employeeModel

    def afterCompose = { c ->
        employeeModel = new EmployeeListModel()
    }
}
