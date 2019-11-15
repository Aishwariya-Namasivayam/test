package com.test.refactor;

public class Main {

  public static void main(String[] args) {
    String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

   // String result = new Customer().statement(new Rental(Arrays.asList(new Movie("ABC", Movie.REGULAR), new Movie("LLL", Movie.REGULAR))));
    
    Customer customer = new Customer("C. U. Stomer");
    customer.addRental(new MovieRental(new Movie("You've Got Mail", Movie.REGULAR),3));
    customer.addRental(new MovieRental(new Movie("Matrix", Movie.REGULAR),1));
    
    String result = customer.statement();
System.out.println(result);
    if (!result.equals(expected)) {
      throw new AssertionError("Expected: " + System.lineSeparator() + String.format(expected) + System.lineSeparator() + System.lineSeparator() + "Got: " + System.lineSeparator() + result);
    }

    System.out.println("Success");
  }
}
