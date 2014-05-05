
HoskiWebapp is a java web application in Google App Engine

HoskiAdmin java application can be downloaded at:
http://hsk-members.appspot.com/hsk-members-admin.zip

See Google App Engine documents at https://developers.google.com/appengine

See dependencies at pom.xml.

Compiling
---------
mvn install

Deployment
----------

Deploy to appengine
-------------------
mvn appengine:update

If update fails use 

mvn appengine:rollback
Commit to git
-------------

Change <version>3</version> 

in pom.xml

Deploy to Maven Central Repository
----------------------------------
not necessary