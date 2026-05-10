#!/usr/bin/env sh
# -----------------------------------------------------------------------------
# Gradle start up script for UN*X
#
# Copyright 2012 the original author or authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
# -----------------------------------------------------------------------------

set -e

PRG="$0"
while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`"/$link"
  fi

done

SAVED="`pwd`"
cd "`dirname "$PRG"`"
PRG="`pwd -P`/`basename "$PRG"`"
cd "$SAVED"

GRADLE_HOME=`dirname "$PRG"`/.gradle

default_java="java"
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        default_java="$JAVA_HOME/jre/sh/java"
    else
        default_java="$JAVA_HOME/bin/java"
    fi
fi

exec "$default_java" -jar "`dirname "$PRG"`/gradle/wrapper/gradle-wrapper.jar" "$@"
