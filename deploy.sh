#!/usr/bin/env bash

###
killTomcat()
{
    pid=`ps -ef|grep tomcat|grep java|awk '{print $2}'`
    echo "tomcat Id list :$pid"
    if [ "$pid" = ""]
    then
        echo "no tomcat pid alive"
    else
        kill -9 $pid
    fi
}

cd $PROJ_PATHT/testj
mvn clean install


killTomcat

rm -rf $TOMCAT_APP_PATH/webapps/ROOT
rm -f $TOMCAT_APP_PATH/webapps/ROOT.war
rm -f $TOMCAT_APP_PATH/webapps/test.war

cp -rf $PROJ_PATH/test/target/testj.war $TOMCAT_APP_PATH/webapps/

cd $TOMCAT_APP_PATH/webapps/
mv testj.war ROOT.war


cd $TOMCAT_APP_PATH/webapps/
sh bin/startup.sh

