package com.epam.rd.autocode.set;

import java.util.EnumSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberTest {

	@Test
	void test1() {
		Member m = new Member("Name1", Level.L1, Skill.S1);
		Class<?> expected = EnumSet.class;
		Class<?> actual = m.getSkills().getClass().getSuperclass();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Member m = new Member("Name2", Level.L1, Skill.S1, Skill.S2, Skill.S3);
		Class<?> expected = EnumSet.class;
		Class<?> actual = m.getSkills().getClass().getSuperclass();
		Assertions.assertEquals(expected, actual);
	}

}
