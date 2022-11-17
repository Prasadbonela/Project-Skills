package com.epam.rd.autocode.set;

import java.util.EnumSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoleTest {

	@Test
	void test1() {
		Role r = new Role(Position.DEVELOPER, Level.A1, Skill.JAVA);
		Class<?> expected = EnumSet.class;
		Class<?> actual = r.getSkills().getClass().getSuperclass();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Role r = new Role(Position.DEVELOPER, Level.A1, Skill.JAVA, Skill.DATABASE, Skill.SPRING);
		Class<?> expected = EnumSet.class;
		Class<?> actual = r.getSkills().getClass().getSuperclass();
		Assertions.assertEquals(expected, actual);
	}

}
