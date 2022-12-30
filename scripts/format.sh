#!/usr/bin/env bash
set -e

# usage: format java codes

script_dir=`dirname $0`
project_root=`realpath $script_dir/..`

cd $project_root

mvn -f server/server-parent/pom.xml net.revelc.code.formatter:formatter-maven-plugin:2.11.0:format