import sbt._

object Dependencies {

  //awsJavaSdk
  val awsSdkVersion = "1.11.58"
  val awsJavaSdkS3 = "com.amazonaws" % "aws-java-sdk-s3" % awsSdkVersion
  val awsJavaSdkDynamo = "com.amazonaws" % "aws-java-sdk-dynamodb" % awsSdkVersion
  val awsJavaSdkIAM = "com.amazonaws" % "aws-java-sdk-iam" % awsSdkVersion

  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
  val logBack = "ch.qos.logback" % "logback-classic" % "1.1.7"

  val jodaTime = "joda-time" %  "joda-time" % "2.9.4"
  val joda = "org.joda" %  "joda-convert" % "1.8.1"
  
  // Typesafe Config
  val config = "com.typesafe" % "config" % "1.3.0"
   
  lazy val rootDeps = Seq(
    awsJavaSdkIAM,
    awsJavaSdkS3,
    awsJavaSdkDynamo,
    scalaLogging,
    jodaTime,
    joda,
    logBack,
    scalaTest % Test,
    config % Test
  )
  
  lazy val awsCoreDeps = Seq(
    awsJavaSdkIAM,
  scalaLogging,
  jodaTime,
  joda,
  logBack,
  scalaTest
  )

  lazy val awsS3Deps = Seq(
    awsJavaSdkS3,
    scalaLogging,
    jodaTime,
    scalaTest,
    logBack
  )

  lazy val awsDynamoDeps = Seq(
    awsJavaSdkDynamo,
    scalaLogging,
    jodaTime,
    scalaTest,
    logBack
  )

  lazy val awsIAMDeps = Seq(
    awsJavaSdkIAM,
    scalaLogging,
    jodaTime,
    joda,
    logBack,
    scalaTest
  )
}