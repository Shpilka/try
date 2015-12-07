package controllers

import akka.actor.{Props, ActorSystem}
import com.typesafe.config.ConfigFactory
import common.Common.Message
import play.api._
import play.api.libs.concurrent.Akka
import play.api.mvc._
import play.api.Play.current

class Application extends Controller {

  def index = Action {

val system = ActorSystem("systema",ConfigFactory.load().getConfig("some"))

    val remote  = system.actorOf(Props[RActor],"sampleActor")
    remote ! Message("local message")
    Ok(views.html.index("Your new application is ready."))
  }

}
