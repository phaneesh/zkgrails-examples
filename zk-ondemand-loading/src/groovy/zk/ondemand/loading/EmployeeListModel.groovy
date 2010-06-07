package zk.ondemand.loading

import org.zkoss.zkplus.databind.BindingListModel
import org.zkoss.zul.AbstractListModel

class EmployeeListModel extends AbstractListModel implements BindingListModel {
    //-- ListModel --//
    def int getSize() {
        return Employee.count();
    }

    def Object getElementAt(int j) {
        println( "Loading Employee: $j" )
        Employee e = Employee.findById( j+1 )
        return e;
    }

    public void sort(Comparator cmpr, boolean ascending) {}

    public int indexOf(Object obj) { return 0; }
}
