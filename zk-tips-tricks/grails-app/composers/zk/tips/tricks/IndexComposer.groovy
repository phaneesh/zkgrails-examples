package zk.tips.tricks

import org.zkoss.zkgrails.*
import org.zkoss.zul.Window

class IndexComposer extends GrailsComposer {

    def Window parentWindow

    def afterCompose = { window ->
        parentWindow = window as Window
    }

    def onClick_getComposers() {
        println("***********************************************")
        println("Parent Composer : " +parentWindow.attributes[parentWindow.id +"\$composer"])
        println("***********************************************")
        println("Total Childern : $parentWindow.childern.size()")
        parentWindow.children.each { f ->
            if(f instanceof Window) {
                println("Embeded Composer : " +f.attributes[f.id +"\$composer"])
            }
        }
        println("***********************************************")
    }
}
