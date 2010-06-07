package zk.tips.tricks

import org.zkoss.zul.Window
import org.zkoss.zkgrails.GrailsComposer

/**
 * Created by IntelliJ IDEA.
 * User: Phaneesh.Nagaraja
 * Date: Jun 7, 2010
 * Time: 10:26:07 AM
 * To change this template use File | Settings | File Templates.
 */
class OtherComposer  extends GrailsComposer {
    def Window parentWindow

     def afterCompose = { window ->
         parentWindow = window as Window
     }
}
