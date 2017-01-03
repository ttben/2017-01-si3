# Boilerplate: an example of Plain Old Java Object (`POJO`) to `JSON` conversion

The Benchmark and Visualisation modules have to communicate. The benchmark has to give results of execution trace analysis to the Visualisation. This is done via a `JSON` object.
To convert the results of the analysis (a `POJO`) into a `JSON` object, you have to use a specific library. Differents libraries exist to handle `JSON` in the `Java` world, with [their own pros and cons](http://blog.takipi.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/).
In this folder, I choose to use `JSONSimple` library since it works the same way as an `HashMap` in Java (You remember `HashMap`, don't you?).
In this folder you will find an example converting `POJOs` into a `JSON` string representation, that [can be given to the visualisation](https://github.com/ttben/2017-01-si3/tree/master/JsonToChart).
