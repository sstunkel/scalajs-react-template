package scalajsreact.template.css

import scalacss.Defaults._
import scalacss.internal.mutable.GlobalRegistry
import scalajsreact.template.components.{LeftNav, TopNav}
import scalajsreact.template.pages.{HomePage, ItemsPage}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("devextreme/dist/css/dx.common.css", JSImport.Namespace)
object DXCommonCss extends js.Object

@js.native
@JSImport("devextreme/dist/css/dx.light.css", JSImport.Namespace)
object DXLightThemeCss extends js.Object


object AppCSS {
  def load = {
    val dxCommonCss = DXCommonCss
    val dxLightThemeCss = DXLightThemeCss
    GlobalRegistry.register(GlobalStyle,
                            TopNav.Style,
                            LeftNav.Style,
                            ItemsPage.Style,
                            HomePage.Style)
    GlobalRegistry.onRegistration(_.addToDocument())
  }
}
