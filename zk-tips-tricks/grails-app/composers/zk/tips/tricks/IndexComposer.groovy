package zk.tips.tricks

import org.zkoss.zkgrails.*
import org.zkoss.zul.Window
import org.zkoss.zul.Textbox

class IndexComposer extends GrailsComposer {

    def Window parentWindow
    def Textbox composers
    def afterCompose = { window ->
        parentWindow = window as Window
    }

    def onClick_getComposers() {
        composers.value = parentWindow.attributes[parentWindow.id +"\$composer"].toString() +"\n"
        parentWindow.children.each { f ->
            if(f instanceof Window) {
                composers.value = composers.value +f.attributes[f.id +"\$composer"].toString() +"\n"
            }
        }
    }
}
