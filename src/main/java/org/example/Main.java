package org.example;

import lib.Location;
import manager.RelationManager;
import org.joda.time.Period;
import people.Human;
import physical.Book;
import physical.PhysicalObject;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Location location = new Location("Location");
        Book book = new Book(human, location, "author", "book");
        book.simulateTimePassage(Period.years(1));
        System.out.println(book.getLeaseTime().toString() + " " + book.getCurrentTime().toString());
    }
}