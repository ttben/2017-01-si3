# Use JSON Object to draw Charts

The benchmark analyse the whole execution trace that is produced by the Executor component. The benchmark analyse the trace (text file) and produces a JSON description of its analysis that will be consummed by the visualisation. In the [POJOToJson folder](https://github.com/ttben/2017-01-si3/tree/master/POJOToJson) you will find a way to convert a Plain Old Java Object (POJO) that describes something (a raw metric, a comparison, an evolution, ...) into a JSON Object and its description. 

In the current folder you will find *a way* to use these results in JSON format to draw charts (using Google Chart). These charts are here to illustrate how to manipulate JSON data and draw charts from it, not as example of perfect charts. You have to respect the standards and convention in terms of naming, charts type, and so on.
