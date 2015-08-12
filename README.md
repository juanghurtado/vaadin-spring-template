# Vaadin Spring template project

## Running this project

You can run this app with Spring Boot by:

- Launching `src/main/java/demo/AppInitializer.java` file as a Java application
- As a Maven project with a `spring-boot:run` goal

## Profiles

If you are launching the app using the Spring Boot Java application, you can choose the active profile by passing a `--spring.profiles.active=<profile>` argument to the program.

If you are using Maven, just configure the profile in the "Maven Build" configuration wizard, or pass the profile to the command line: `mvn spring-boot:run -P<profile>`

### Default profile (no name)

All profiles inherit this properties, which can be overriden.

- Properties file: `src/main/resources/application.properties`
- SQL server DB

### local_hsql

- Properties file: `src/main/resources/application-local_hsql.properties`
- Local HSQL DB
- Spring banner hidden

## Packagging the project

Just use Maven: `mvn package -P<profile>`

This will create a WAR under the `target/` folder. This WAR is created with the `spring-boot:repackage` goal of the Spring Boot Maven plugin.

## Logger

Logging should be made using the `Log` class, found in `src/main/java/demo/lib/utils/Demo.java`. For example:

```java
Log.info(getClass(), "This is a sample info message");
Log.severe(getClass(), "This is a sample severe message", new Exception());
```

Log config can be found in: `src/main/resources/logback.xml`.

Log files are written in the folder configured in the `logging.path` Spring config var, defined in `src/main/resources/application.properties`.

## i18n

Properties files for i18n are located in `src/main/resources/i18n/`. To get a localized string, use the `i18n` class, found in `src/main/java/demo/lib/utils/i18n.java`. For example:

```java
i18n.get("SAMPLE_KEY"); // Returns the localized string for the given key for current locale
i18n.get("SAMPLE_KEY", new Locale("en")); // Returns the English string for the given key

i18n.setLocale(new Locale("fr")); // You can set the locale for future calls to .get()
i18n.get("SAMPLE_KEY"); // Returns the French string for the given key
 
```