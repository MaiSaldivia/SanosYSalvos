@echo off
setlocal
set GRADLE_HOME=%~dp0.gradle\wrapper\dists
set JAVA_EXE=%JAVA_HOME%\bin\java.exe
if not defined JAVA_HOME (
  set JAVA_EXE=java.exe
)
set GRADLE_WRAPPER_JAR=%~dp0gradle\wrapper\gradle-wrapper.jar
if not exist "%GRADLE_WRAPPER_JAR%" (
  echo ERROR: Gradle wrapper jar not found at %GRADLE_WRAPPER_JAR%
  exit /b 1
)
"%JAVA_EXE%" -jar "%GRADLE_WRAPPER_JAR%" %*
exit /b %ERRORLEVEL%
