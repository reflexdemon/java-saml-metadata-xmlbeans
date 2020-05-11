# java-saml-metadata-xmlbeans [![Maven Central](https://img.shields.io/maven-central/v/io.vpv.saml.metadata/java-saml-metadata-xmlbeans.svg)](https://search.maven.org/search?q=g:io.vpv.saml.metadata%20AND%20a:java-saml-metadata-xmlbeans)
                               
[![HitCount](http://hits.dwyl.com/reflexdemon/java-saml-metadata-xmlbeans.svg)](http://hits.dwyl.com/reflexdemon/java-saml-metadata-xmlbeans)

This is a project to generate xmlbeans for the [SAML Metadata XML](https://docs.oasis-open.org/security/saml/v2.0/saml-schema-metadata-2.0.xsd)


This will be published to maven artifactory and you should be able to download them soon.

Check back here as soon as the xmlbeans are published.

Links to project resources.

1. [Maven Side Documentation](https://reflexdemon.github.io/java-saml-metadata-xmlbeans/index.html)
2. [Generated Javadoc](https://reflexdemon.github.io/java-saml-metadata-xmlbeans/apidocs/io/vpv/saml/metadata/xml/modal/package-summary.html)

### Maven Dependency

To include this library on to your project,
```xml
<dependency>
  <groupId>io.vpv.saml.metadata</groupId>
  <artifactId>java-saml-metadata-xmlbeans</artifactId>
  <version>1.0</version>
</dependency>
```

### Gradle Dependency
```groovy
compile group: 'io.vpv.saml.metadata', name: 'java-saml-metadata-xmlbeans', version: '1.0'
``` 


## Building

The Minimum JDK required for this is `JDK 11`. To build the project locally clone the repo and run the below command.


```shell script
./mvnw clean package
```
This should result in the `jar` file on the `/target` folder.

## Publishing Snapshot builds

If we wish to publish snapshot build to reporitory please issue the below command.

```shell script
./mvnw clean deploy site
```

## Making a Release Build

To make a release build we will have to do the following steps in sequence.

### Step 1
```shell script
./mvnw release:clean release:prepare
```
### Step 2
```shell script
./mvnw release:perform
```

## Troubleshooting

Some of the common issues that you face during publish.

1. Ensure to have your SCM workspace clean before release.
2. Refer to the [Maven deployment guideline].
3. If it fails in the middle of publish, then cleanup your local SCM workspace and begin



## Links

1. [Maven deployment guideline](https://central.sonatype.org/pages/apache-maven.html)
2. [SAML Metadata XML](https://docs.oasis-open.org/security/saml/v2.0/saml-schema-metadata-2.0.xsd)