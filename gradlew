#!/bin/sh
APP_HOME="$(cd "$(dirname "$0")" && pwd)"
GRADLE_JAR="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"
java -cp "$GRADLE_JAR" org.gradle.wrapper.GradleWrapperMain "$@"
