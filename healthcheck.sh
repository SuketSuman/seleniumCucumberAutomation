#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# BROWSER

echo "Checking if hub is ready - $HUB_HOST"

while [ "$( curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

# start the java command
java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* \
    -DseleniumHubHost=$HUB_HOST \
    -Dbrowser=$BROWSER \
    -Dcucumber.options=classpath:FeatureFiles \
    org.junit.runner.JUnitCore com.tutorialsninja.automation.runner.TestRunner