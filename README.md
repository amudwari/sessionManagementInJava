# sessionManagementInJava

This is a web application in java Servlet which uses Session Management. Session in Java Servlet are managed through different ways, such as Cookies, HttpSession API, URL rewriting etc. This program implements session using HttpSession.
Servlet API provides Session management through HttpSession interface. We can get session from HttpServletRequest object using following methods. HttpSession allows us to set objects as attributes that can be retrieved in future requests.

HttpSession getSession() – This method always returns a HttpSession object. It returns the session object attached with the request, if the request has no session attached, then it creates a new session and return it.
HttpSession getSession(boolean flag) – This method returns HttpSession object if request has session else it returns null.
