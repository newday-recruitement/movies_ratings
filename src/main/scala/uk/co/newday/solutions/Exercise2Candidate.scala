package uk.co.newday.solutions

import org.apache.spark.sql.DataFrame

object Exercise2Candidate {

  def execute(movies: DataFrame, ratings: DataFrame): (DataFrame) = {
    val joined_df=ratings_df.join(movies_df,"MovieID")
  }
}
