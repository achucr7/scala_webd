package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index: Action[AnyContent] = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def about: Action[AnyContent] = Action {
    Ok(views.html.ab(""))
  }

  def contact: Action[AnyContent] = Action {
    Ok(views.html.cont(""))
  }

  def services: Action[AnyContent] = Action {
    Ok(views.html.se(""))
  }

  def a: Action[AnyContent] = Action{
    Ok(views.html.aroute(""))
  }

  def b: Action[AnyContent] = Action{
    Ok(views.html.broute(""))
  }

  def c: Action[AnyContent] = Action{
    Ok(views.html.croute(""))
  }

  def d: Action[AnyContent] = Action{
    Ok(views.html.droute(""))
  }

  def e: Action[AnyContent] = Action{
    Ok(views.html.eroute(""))
  }

  def f: Action[AnyContent] = Action{
    Ok(views.html.froute(""))
  }
  def g: Action[AnyContent] = Action{
    Ok(views.html.groute(""))
  }
  def h: Action[AnyContent] = Action{
    Ok(views.html.hroute(""))
  }

  def i: Action[AnyContent] = Action{
    Ok(views.html.iroute(""))
  }
  def j: Action[AnyContent] = Action{
    Ok(views.html.jroute(""))
  }
  def k: Action[AnyContent] = Action{
    Ok(views.html.kroute(""))
  }
  def l: Action[AnyContent] = Action{
    Ok(views.html.lroute(""))
  }
  def m: Action[AnyContent] = Action{
    Ok(views.html.mroute(""))
  }
  def n: Action[AnyContent] = Action{
    Ok(views.html.nroute(""))
  }
  def o: Action[AnyContent] = Action{
    Ok(views.html.oroute(""))
  }
  def p: Action[AnyContent] = Action{
    Ok(views.html.proute(""))
  }
  def q: Action[AnyContent] = Action{
    Ok(views.html.qroute(""))
  }
  def r: Action[AnyContent] = Action{
    Ok(views.html.rroute(""))
  }
  def s: Action[AnyContent] = Action{
    Ok(views.html.sroute(""))
  }
  def t: Action[AnyContent] = Action{
    Ok(views.html.troute(""))
  }
  def u: Action[AnyContent] = Action{
    Ok(views.html.uroute(""))
  }
  def v: Action[AnyContent] = Action{
    Ok(views.html.vroute(""))
  }
  def w: Action[AnyContent] = Action{
    Ok(views.html.wroute(""))
  }
  def x: Action[AnyContent] = Action{
    Ok(views.html.xroute(""))
  }
  def y: Action[AnyContent] = Action{
    Ok(views.html.yroute(""))
  }
  def z: Action[AnyContent] = Action{
    Ok(views.html.zroute(""))
  }


}
