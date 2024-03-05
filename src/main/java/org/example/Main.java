package org.example;

import com.github.javafaker.Faker;
import lib.Location;
import lib.furniture.Counter;
import manager.RelationManager;
import org.joda.time.*;
import people.Human;
import people.LibraryWorker;
import physical.Book;
import physical.PhysicalObject;
import simulation.TimeData;
import simulation.TimeSimulator;

public class Main {
    public static void main(String[] args) {
        TimeSimulator t = new TimeSimulator();
        Human h = new Human(t, "human", LocalDate.now());
        Location l = new Location(t, "location", TimeData.getCurrentDateTime().toLocalTime());
        Book b = new Book(t, h, l, "author", "title");
        t.simulateTimePassage(new Period(Hours.ONE));
        System.out.println(t.getCurrentTime());
    }
}