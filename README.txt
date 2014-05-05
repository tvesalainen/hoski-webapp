
HoskiWebapp is a java web application in Google App Engine

HoskiAdmin java application can be downloaded at:
http://hsk-members.appspot.com/hsk-members-admin.zip

See Google App Engine documents at https://developers.google.com/appengine

HoskiWebapp is a Maven project
groupId:    fi.hoski
artifactId: hoski-webapp

See dependencies at pom.xml.

Deployment
----------

Clone sources from github

run

mvn install

To compile

Deploy to appengine

mvn appengine:update

If update fails use 

mvn appengine:rollback

to recover

Commit to git
-------------

Change <version>1.0.1</version> 
and also 
<appengine-web-app.version>1-0-1</appengine-web-app.version> <!-- this is the same as project.version with dots changed to dashes-->

in pom.xml

Deploy to Maven Central Repository
----------------------------------

See http://central.sonatype.org/ how to create environment for deployment

Run:

mvn clean:clean javadoc:jar source:jar deploy
 
