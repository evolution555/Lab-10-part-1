
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/playlab_crud-part3/conf/routes
// @DATE:Wed Nov 30 11:27:29 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
