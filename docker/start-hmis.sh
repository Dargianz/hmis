#!/bin/sh
set -eu
asadmin start-domain domain1 >/tmp/payara-start.log 2>&1 || true
until asadmin list-domains 2>/dev/null | while IFS= read -r line; do case "$line" in *"domain1 running"*) exit 0;; esac; done; do sleep 2; done
asadmin create-jdbc-connection-pool --datasourceclassname com.mysql.cj.jdbc.MysqlDataSource --restype javax.sql.DataSource --property 'serverName:db:portNumber:3306:databaseName:coop:user:hmis:password:hmis-test' hmisPool || true
asadmin create-jdbc-resource --connectionpoolid hmisPool jdbc/ruhunu || true
asadmin stop-domain domain1 >/tmp/payara-stop.log 2>&1 || true
exec asadmin start-domain --verbose domain1
