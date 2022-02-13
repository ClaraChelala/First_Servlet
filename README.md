# First_Servlet


FirstServlet.java et FirstServlet.class se trouvent dans C:\Program Files\apache-tomcat-9.0.58\webapps\examples\WEB-INF\classes

web.xml se trouve dans C:\Program Files\apache-tomcat-9.0.58\webapps\examples\WEB-INF

PremierServlet.html se trouve dans C:\Program Files\apache-tomcat-9.0.58\webapps\examples


1- J'ai installer le zip file apache tomcat 9.0.58 et ajuster les environment variables

2- J'ai créé et compilé FirstServlet.java qui affiche Bonjour Clara Chelala

3- J'ai ajusté web.xml en ajoutant 
    <servlet>
        <servlet-name>FirstServlet</servlet-name>
        <servlet-class>FirstServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>FirstServlet</servlet-name>
        <url-pattern>/FirstServlet</url-pattern>
    </servlet-mapping>
    
 4- J'ai créé PremierServlet.html qui fait une référence à /FirstServlet
 
 5- J'ai démarré startup.bat qui se trouve dans C:\Program Files\apache-tomcat-9.0.58\bin
 
 6- J'ai testé :
 
![image](https://user-images.githubusercontent.com/83409958/153766324-c4d038f3-7efd-4c33-a172-745c7efb1c34.png)
![image](https://user-images.githubusercontent.com/83409958/153766335-0444f380-45a7-4d98-9096-66b456053070.png)

