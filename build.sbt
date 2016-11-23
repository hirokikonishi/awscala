import Dependencies._

lazy val root = (project in file(".")).
  aggregate(awsCore,awsS3,awsDynamo).
  settings(
    name := "aws-scala",
    organization := "com.github.hirokikonishi",
    scalaVersion := "2.12.0",
    sbtPlugin := true,
    libraryDependencies ++= rootDeps 
  )

lazy val awsCore = (project in file("aws/core")).
  settings(
    name := "aws-core",
    scalaVersion := "2.12.0",
    libraryDependencies ++= awsCoreDeps
  )

lazy val awsS3 = (project in file("aws/s3")).
  dependsOn(awsCore).
  settings(
    name := "aws-s3",
    scalaVersion := "2.12.0",
    libraryDependencies ++= awsS3Deps
  )

lazy val awsDynamo = (project in file("aws/dynamo")).
  dependsOn(awsCore).
  settings(
    name := "aws-dynamo",
    scalaVersion := "2.12.0",
    libraryDependencies ++= awsDynamoDeps
  )

lazy val awsSimpleDB = (project in file("aws/simpledb")).
  dependsOn(awsCore).
  settings(
    name := "aws-simpledb",
    scalaVersion := "2.12.0",
    libraryDependencies ++= awsSimpleDBDeps
  )

lazy val awsIAM = (project in file("aws/iam")).
  dependsOn(awsCore).
  settings(
    name := "aws-iam",
    scalaVersion := "2.12.0",
    libraryDependencies ++= awsIAMDeps
  )
