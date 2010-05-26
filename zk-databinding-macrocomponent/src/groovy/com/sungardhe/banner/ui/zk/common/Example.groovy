package com.sungardhe.banner.ui.zk.common

import org.zkoss.zk.ui.HtmlMacroComponent

/**
 * Created by IntelliJ IDEA.
 * User: Phaneesh.Nagaraja
 * Date: May 26, 2010
 * Time: 1:16:04 PM
 * To change this template use File | Settings | File Templates.
 */
class Example extends HtmlMacroComponent {


    def setFirstName(String value) {
        getFellow("firstName").value = value
        refreshValues()
    }

    def setLastName(String value) {
        getFellow("lastName").value = value
        refreshValues()
    }

    def getFirstName() {
       return getFellow("firstName").value
    }

    def getLastName() {
        return getFellow("lastName").value
    }

    def refreshValues() {
        getFellow("fullName").value = getFirstName() +" " +getLastName()
    }
}
