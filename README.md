# java-saml-metadata-xmlbeans

This is a project to generate xmlbeans for the SAML Metadata XML. The Schema for these XML can be found here
https://docs.oasis-open.org/security/saml/v2.0/saml-schema-metadata-2.0.xsd

This will be published to maven artifactory and you should be able to download them soon.

Check back here as soon as the xmlbeans are published.

## Building

The Minimum JDK required for this is `JDK 11`. To build the project locally clone the repo and run the below command.


```bash
./mvnw clean package
```
This should result in the `jar` file on the `/target` folder.