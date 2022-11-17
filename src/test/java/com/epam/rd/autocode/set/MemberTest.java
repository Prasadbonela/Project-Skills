package com.epam.rd.autocode.set;

import java.util.EnumSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberTest {

	@Test
	void test1() {
		Member m = new Member("Name1", Level.A1, Skill.JAVA);
		Class<?> expected = EnumSet.class;
		Class<?> actual = m.getSkills().getClass().getSuperclass();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Member m = new Member("Name2", Level.A1, Skill.JAVA, Skill.DATABASE, Skill.SPRING);
		Class<?> expected = EnumSet.class;
		Class<?> actual = m.getSkills().getClass().getSuperclass();
		Assertions.assertEquals(expected, actual);
	}

}
