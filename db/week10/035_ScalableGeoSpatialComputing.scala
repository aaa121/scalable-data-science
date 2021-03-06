// Databricks notebook source exported at Tue, 14 Jun 2016 03:20:20 UTC
// MAGIC %md
// MAGIC 
// MAGIC # [Scalable Data Science](http://www.math.canterbury.ac.nz/~r.sainudiin/courses/ScalableDataScience/)
// MAGIC 
// MAGIC 
// MAGIC ### prepared by [Raazesh Sainudiin](https://nz.linkedin.com/in/raazesh-sainudiin-45955845) and [Sivanand Sivaram](https://www.linkedin.com/in/sivanand)
// MAGIC 
// MAGIC *supported by* [![](https://raw.githubusercontent.com/raazesh-sainudiin/scalable-data-science/master/images/databricks_logoTM_200px.png)](https://databricks.com/)
// MAGIC and 
// MAGIC [![](https://raw.githubusercontent.com/raazesh-sainudiin/scalable-data-science/master/images/AWS_logoTM_200px.png)](https://www.awseducate.com/microsite/CommunitiesEngageHome)

// COMMAND ----------

// MAGIC %md
// MAGIC # What is Geospatial Analytics?
// MAGIC 
// MAGIC 
// MAGIC **(watch now 3 minutes and 23 seconds)**:
// MAGIC 
// MAGIC [![Spark Summit East 2016 - What is Geospatial Analytics by Ram Sri Harsha](http://img.youtube.com/vi/1lF1oSjxMT4/0.jpg)](https://www.youtube.com/v/1lF1oSjxMT4?rel=0&autoplay=1&modestbranding=1&start=111&end=314)

// COMMAND ----------

// MAGIC %md
// MAGIC 
// MAGIC # Some Concrete Examples of Scalable Geospatial Analytics
// MAGIC 
// MAGIC ## 1. Let us check out cross-domain data fusion in MSR's Urban Computing Group 
// MAGIC * lots of interesting papers to read at [http://research.microsoft.com/en-us/projects/urbancomputing/](http://research.microsoft.com/en-us/projects/urbancomputing/).

// COMMAND ----------

def frameIt( u:String, h:Int ) : String = {
      """<iframe 
 src=""""+ u+""""
 width="95%" height="""" + h + """"
 sandbox>
  <p>
    <a href="http://spark.apache.org/docs/latest/ml-features.html">
      Fallback link for browsers that, unlikely, don't support frames
    </a>
  </p>
</iframe>"""
   }
displayHTML(frameIt("http://research.microsoft.com/en-us/projects/urbancomputing/",700))

// COMMAND ----------

// MAGIC %md
// MAGIC ## 1. Several sciences are naturally geospatial 
// MAGIC * forestry, 
// MAGIC * geography, 
// MAGIC * geology, 
// MAGIC * seismology, 
// MAGIC * etc. etc.
// MAGIC 
// MAGIC See for example the global EQ datastreams from US geological Service below.
// MAGIC 
// MAGIC **A bold idea: **
// MAGIC Imagine the non-parametric inference problem of estimating co-exciting Hawkes-like processes for modelling earth quakes on the entire planet! 
// MAGIC 
// MAGIC For a global data source, see US geological Service's Earthquake hazards Program ["http://earthquake.usgs.gov/data/](http://earthquake.usgs.gov/data/).

// COMMAND ----------

displayHTML(frameIt("http://earthquake.usgs.gov/data/",700))

// COMMAND ----------

// MAGIC %md
// MAGIC 
// MAGIC # [Scalable Data Science](http://www.math.canterbury.ac.nz/~r.sainudiin/courses/ScalableDataScience/)
// MAGIC 
// MAGIC 
// MAGIC ### prepared by [Raazesh Sainudiin](https://nz.linkedin.com/in/raazesh-sainudiin-45955845) and [Sivanand Sivaram](https://www.linkedin.com/in/sivanand)
// MAGIC 
// MAGIC *supported by* [![](https://raw.githubusercontent.com/raazesh-sainudiin/scalable-data-science/master/images/databricks_logoTM_200px.png)](https://databricks.com/)
// MAGIC and 
// MAGIC [![](https://raw.githubusercontent.com/raazesh-sainudiin/scalable-data-science/master/images/AWS_logoTM_200px.png)](https://www.awseducate.com/microsite/CommunitiesEngageHome)