
HoskiWebapp is a java web application in Google App Engine

See Google App Engine documents at https://developers.google.com/appengine

HoskiWebapp source files are in https://github.com/tvesalainen/hoski-webapp.git

HoskiLib source files are in https://github.com/tvesalainen/hoski-lib.git

build.xml is a NetBeans build file. Deployment to server is possible in NetBeans
IDE. Edit projects nbproject/private/private.properties file and add the following entries:

appengine.bin=<appengine-java-sdk-X.X.X>\\bin
appserver=${appengine.bin}\\dev_appserver.cmd
appcfg=${appengine.bin}\\appcfg.cmd
appenginepwd=< here is the secret password >

replace <appengine-java-sdk-X.X.X> and < here is the secret password > according
to your environment.





