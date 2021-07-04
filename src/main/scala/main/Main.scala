package main
import typings.capacitorGeolocation.definitionsMod.PositionOptions
import typings.capacitorGeolocation.mod.Geolocation

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello!")

    import com.raquo.laminar.api.L._
    import org.scalajs.dom
    val app = div(
      h1("Hello world!"),
      child <-- EventStream
        .fromJsPromise(
          Geolocation
            .getCurrentPosition(PositionOptions().setEnableHighAccuracy(true))
        )
        .map { position =>
          s"Your position: ${position.coords.latitude}, ${position.coords.longitude}"
        }
    )
    render(dom.document.getElementById("root"), app)
  }
}
