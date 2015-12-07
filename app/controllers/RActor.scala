package controllers

import akka.actor.{Actor, ActorLogging, Props}
import common.Common.Message


/**
  * Created by Daniela on 05.12.2015.
  */
class RActor extends Actor with ActorLogging{
  override def receive: Receive = {
    case msg:String => log.info("recieved message " +msg)
    case Message(msg) => log.info(msg)
  }

  override def preStart(): Unit ={
    log.info("i am started")
    log.info(self.toString())
  }

}

object RActor {
  val props = Props[RActor]

}
