package oop.g8.generator.relation.person;

import java.util.Date;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2C;

public class P2CG {
	public static P2C generateP2C(Person p, Country c, String relationName, String link, Date date) {
		return new P2C(relationName, link, date,  p, c);
	}
}
