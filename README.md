# Drone delivery
This repository contains examples and resources for the drone delivery project.

# Interaction between Benchmark and Visualisation

The benchmark analyse the execution trace of the Schedule component. From this analysis, it will produce data for a visualisation (_i.e._ charts). How to _pass_ data from benchmark component to a visualisation component? Via the JSON format, with a JSON file or a JSON string representation. So the benchmark analyse the trace (text file) and produces a JSON description of its analysis that will be consummed by the visualisation. In the [POJOToJson folder](https://github.com/ttben/2017-01-si3/tree/master/POJOToJson) you will find a way to convert a Plain Old Java Object (POJO) that describes something (a raw metric, a comparison, an evolution, ...) into a JSON Object and its description. Then, in the [JSONToChart folder](https://github.com/ttben/2017-01-si3/tree/master/JsonToChart) you will find *a way* to use these results in JSON format to draw charts (using Google Chart).

You can find resources about JSON [here](http://json.org/), [here](https://www.mkyong.com/java/json-simple-example-read-and-write-json/), [here](http://stackoverflow.com/questions/1695883/what-is-json-can-you-explain-it-to-a-newbie) and [here](https://www.copterlabs.com/json-what-it-is-how-it-works-how-to-use-it/)

# Visualisation
You **can** use Google Chart for visualisation since it is a simple, trusted, and a well documented one.
You will find the different types of charts [here](https://google-developers.appspot.com/chart/interactive/docs/gallery).
Here are examples of charts that can be usefull in our context:
- [PieChart](https://google-developers.appspot.com/chart/interactive/docs/gallery/piechart) to represent a proportion between measured metric
- [LineChart](https://google-developers.appspot.com/chart/interactive/docs/gallery/linechart) to represent a evolution, usually over time
- [ColumnChart](https://google-developers.appspot.com/chart/interactive/docs/gallery/columnchart) to compare different series on different metrics
- [CandleStick](https://developers.google.com/chart/interactive/docs/gallery/candlestickchart) to focus on variation. [CandleStick chart](https://en.wikipedia.org/wiki/Candlestick_chart) is also called [Box plot](https://en.wikipedia.org/wiki/Box_plot) or [Boite à moustache](https://fr.wikipedia.org/wiki/Bo%C3%AEte_%C3%A0_moustaches) in french.

Feel free to use other charts or customise these one as long as you do that to underline what you want to show in this chart. Remember that a chart is a visual representation of results obtained in a scientific way through an experiment done to demonstrate or try something very specific. (yes. all of that.)

In the official documentation of each chart, you can hit the _'Code it yourself on JSFiddle'_ button. You will end on the JSFiddle website that allows one to test html/css/js code quickly and, in our case, see how a particular chart behave or wait as input.

In the [JSONToChart folder](https://github.com/ttben/2017-01-si3/tree/master/JsonToChart) you will find an example drawing a dashboard from a string representation of a JSON Object

