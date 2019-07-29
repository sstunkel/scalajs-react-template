package scalajsreact.template.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js.|

object ScottTestComponent {
  case class Props(name: String)

  val myComponent = ScalaComponent.builder[Props]("ScottTestComponent")
    .render_P(props => {
      <.div("Hello there ", props.name):VdomNode
    })
    .build
}
