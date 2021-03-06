package oop.g8.generator.relation.time;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2E;

public class T2EG {

	public static T2E generateT2E(Time t, Event e, String relationName, String link, Date date) {
		return new T2E(relationName,  link, date, t, e);
	}
}
