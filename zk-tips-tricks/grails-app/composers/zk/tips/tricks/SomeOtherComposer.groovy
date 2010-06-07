package zk.tips.tricks

import org.zkoss.zul.Window
import org.zkoss.zkgrails.GrailsComposer

class SomeOtherComposer extends GrailsComposer {

    def Window parentWindow

    def afterCompose = { window ->
        parentWindow = window as Window
    }

}
