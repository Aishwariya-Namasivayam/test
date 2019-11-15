package com.test.refactor;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<MovieRental> rentals = new ArrayList<MovieRental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	public void setName(String name) {
		this.name = name;
	}
	
	public void addRental(MovieRental arg) {
        rentals.add(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentEnterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (MovieRental each: rentals) {
            double thisAmount = 0;

            //determine amounts for each movie
            switch (each.getMovie().getCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDays() > 2)
                        thisAmount += (each.getDays() - 2) * 1.5;
                    break;
                case Movie.NEW:
                    thisAmount += each.getDays() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDays() > 3)
                        thisAmount += (each.getDays() - 3) * 1.5;
                    break;
            }

          //add frequent bonus points
            frequentEnterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getCode() == Movie.NEW) && each.getDays() > 2)
            	frequentEnterPoints++;

            //print figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentEnterPoints) + " frequent points" + "\n";

        return result;
    }
}
