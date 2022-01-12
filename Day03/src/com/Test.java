package com;

public class Test {
	public static void main(String[] args) {
          Movie movie=new Movie("ABC", "26364");
          
          System.out.println(Movie.getMovieCount()+"  "+movie.getMovieId());
          
          Movie movie2=new Movie("Charli", "Naryana", "Priydarsan", 153,"2005", CATEGORY.COMEDY);
          System.out.println(Movie.getMovieCount()+"  "+movie2.getMovieId());
          
          System.out.println(movie2.showDetails());
          
          Movie movie3=new SpecialMovie("ABCD", "Akshay");
          System.out.println(movie3.showDetails());
	}
}
