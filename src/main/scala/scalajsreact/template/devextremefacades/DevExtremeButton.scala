package scalajsreact.template.devextremefacades

import japgolly.scalajs.react.{CtorType, _}
import japgolly.scalajs.react.component.Js.Component

import scala.scalajs.js.annotation.{JSGlobal, JSImport, JSName}
import scalajs.js
object DevExtremeButton {
  @JSImport("devextreme-react/Button", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  type OnClick = js.Function0[Unit]

  @js.native
  trait Props extends js.Object {
    var text: String = js.native
    var onClick: OnClick = js.native
  }

  def props(text: String, onClick: Callback = Callback.empty): Props = {
    val p = (new js.Object).asInstanceOf[Props]
    p.text = text
    p.onClick = () => onClick.runNow()
    p
  }

  val Component = JsComponent[Props, Children.None, Null](RawComponent)
}
