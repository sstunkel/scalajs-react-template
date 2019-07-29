package scalajsreact.template.components.items

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.window
import scalajsreact.template.components.ScottTestComponent
import scalajsreact.template.devextremefacades.DevExtremeButton

object ItemsInfo {

  val component = ScalaComponent.builder
    .static("ItemsInfo")(
      <.div(" Items Root Page  ",
        ScottTestComponent.myComponent(ScottTestComponent.Props("Scott")),
        DevExtremeButton.Component(DevExtremeButton.props("test", Callback({
          println("blah blah")
          window.alert("hey")})))
      )
    )
    .build

  def apply() = component().vdomElement
}
