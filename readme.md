# Mapstruct extensions

Some customizations for mapstruct

## Setup

Add this library to the classpath by adding the following maven dependency. Versions can be found [here](../../packages)

```xml

<dependency>
    <groupId>it.aboutbits</groupId>
    <artifactId>mapstruct-extensions</artifactId>
    <version>x.x.x</version>
</dependency>
```

## CustomAccessorNamingStrategy

The [CustomAccessorNamingStrategy.java](src%2Fmain%2Fjava%2Fit%2Faboutbits%2Fmapstruct%2Fspi%2FCustomAccessorNamingStrategy.java) adds support for Lombok's `@With` methods.
By default, Lombok would treat these generated functions as accessors and would try to map them.

## Building and releasing a new version:

To create a new version of this package and push it to the maven registry, you will have to use the GitHub actions workflow and manually trigger it.

## Information

About Bits is a company based in South Tyrol, Italy. You can find more information about us on [our website](https://aboutbits.it).

### Support

For support, please contact [info@aboutbits.it](mailto:info@aboutbits.it).

### Credits

- [All Contributors](../../contributors)

### License

The MIT License (MIT). Please see the [license file](license.md) for more information.
