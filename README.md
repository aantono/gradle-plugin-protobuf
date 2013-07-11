# Protobuf Plugin for Gradle
The Protobuf plugin provides protobuf compilation to your project.

## Latest Version
ws.antonov.gradle.plugins:gradle-plugin-protobuf:0.8 - Available on Maven Central

## Usage
To use the protobuf plugin, include in your build script:

```groovy
apply plugin: 'protobuf'

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'ws.antonov.gradle.plugins:gradle-plugin-protobuf:0.8'
    }
}

// Optional - defaults to 'protoc' searching through your PATH
protocPath = '/usr/local/bin/protoc'
// Optional - defaults to value below
extractedProtosDir = "${project.buildDir.path}/extracted-protos"
// Optional - defaults to "${project.buildDir}/generated-sources/${sourceSet.name}"
generatedFileDir = "${projectDir}/src"
// Optional - defaults to true (append the current ${sourceSet.name} to ${generatedFileDir})
appendSourceSetName = false

dependencies {
    // If you have your protos archived in a tar file, you can specify that as a dependency
    //   ... alternative archive types supported are: jar, tar, tar.gz, tar.bz2, zip
    protobuf files("lib/protos.tar.gz")
    // Different configuration fileSets are supported
    testProtobuf files("lib/protos.tar")
}
```
