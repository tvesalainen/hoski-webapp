
HoskiWebapp is a java web application in Google App Engine

See Google App Engine documents at https://developers.google.com/appengine

HoskiWebapp source files are in https://github.com/tvesalainen/hoski-webapp.git

HoskiLib source files are in https://github.com/tvesalainen/hoski-lib.git

HoskiAdmin source files are in https://github.com/tvesalainen/hoski-admin.git

Creating development environment
--------------------------------

Clone the sources to separate directories. Example:

hoskiwebapp
hoskilib
hoskiadmin

Download Google App Engine SDK from appengine.google.com

Create a properties file in hoskilib directory
hoskilib/private.properties

Write the following properties:

appengine.path=<directory where you downloaded App Engine SDK>
hoskiwebapp.path=<path to hoskiwebapp sources>
hoskilib.path=<path to hoskilib sources>
hoskiadmin.path=<path to hoskiadmin sources>

Example:
appengine.path=/Users/tkv/Downloads
hoskilib.path=../hoskilib
hoskiadmin.path=../hoskiadmin
hoskiwebapp.path=../hoskiwebapp

Additionally you need the normal java development tools (java, javac, ant, ...)

Deploying
---------

hoskiwebapp/build.xml has target deploy. It uses Oauth2 authentication. First
time it generates a token, which the deployment process will ask you.






