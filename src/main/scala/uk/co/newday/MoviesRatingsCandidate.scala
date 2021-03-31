package uk.co.newday

import uk.co.newday.solutions.{Exercise1Candidate, Exercise2Candidate, Exercise3Candidate, Exercise4Candidate}

object MoviesRatingsCandidate {

  def main(args: Array[String]) {
    val (movies,ratings) = Exercise1Candidate.execute()
    val movieRatings = Exercise2Candidate.execute(movies, ratings)
    val ratingWithRankTop3 = Exercise3Candidate.execute(movies, ratings)
    Exercise4Candidate.execute(movies, ratings, movieRatings, ratingWithRankTop3)
  }
}
