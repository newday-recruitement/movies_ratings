package uk.co.newday.solutions

import org.apache.spark.sql.DataFrame

object Exercise1Candidate {

  private case class Movie (movieId:Int, title:String, genre:String)
  private case class Rating (userId:Int, movieId:Int, rating:Int, timestamp:Int)

  def execute(): (DataFrame, DataFrame) =
    {
        //Please load movies and ratings csv's in output dataframes.
      (null, null)
    }
}
