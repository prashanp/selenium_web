mvn clean install -Dcucumber.options="--tags @tc01" -P web
mvn clean install -Dcucumber.options="--tags @tc02" -P single
mvn clean install -Dcucumber.options="--tags @mobile" -P web