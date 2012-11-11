#!/bin/sh

if ! [ -e $1/WEB-INF/web.xml ]; then
  echo "USAGE $0 <war directory> <test|run>"
  exit 1
fi

if ! [ -e $1/WEB-INF/${2}-appengine-web.xml ]; then
  echo "USAGE $0 <war directory> <test|run>"
  exit 1
fi


cp $1/WEB-INF/${2}-appengine-web.xml $1/WEB-INF/appengine-web.xml

/opt/appengine-java-sdk-1.6.4/bin/appcfg.sh -e sovellus.kehitys@hoski.fi update $1
