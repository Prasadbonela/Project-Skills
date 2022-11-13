package com.epam.rd.autocode.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProjectTest {

	@Test
	void test1() {
		Project project = new Project(new Role(Position.P1, Level.L1, Skill.S1, Skill.S2),
				new Role(Position.P2, Level.L2, Skill.S1, Skill.S2, Skill.S3),
				new Role(Position.P3, Level.L3, Skill.S4, Skill.S5), new Role(Position.P3, Level.L3, Skill.S5));

		Set<Member> team = new HashSet<>(Arrays.asList(new Member("Name1", Level.L1, Skill.S1, Skill.S2),
				new Member("Name2", Level.L2, Skill.S1, Skill.S2, Skill.S3),
				new Member("Name3", Level.L3, Skill.S4, Skill.S5), new Member("Name4", Level.L3, Skill.S4)));

		int expected = 87;
		int actual = project.getConformity(team);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Project project = new Project(new Role(Position.P1, Level.L1, Skill.S1, Skill.S2),
				new Role(Position.P3, Level.L3, Skill.S4, Skill.S5), new Role(Position.P3, Level.L3, Skill.S5));

		Set<Member> team = new HashSet<>(Arrays.asList(new Member("Name1", Level.L1, Skill.S1, Skill.S2),
				new Member("Name2", Level.L2, Skill.S1, Skill.S2, Skill.S3),
				new Member("Name3", Level.L3, Skill.S4, Skill.S5)));

		int expected = 80;
		int actual = project.getConformity(team);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test3() {
		Project project = new Project(new Role(Position.P1, Level.L1, Skill.S1),
				new Role(Position.P2, Level.L2, Skill.S1), new Role(Position.P3, Level.L3, Skill.S4),
				new Role(Position.P3, Level.L3, Skill.S5));

		Set<Member> team = new HashSet<>(Arrays.asList(new Member("Name1", Level.L1, Skill.S1, Skill.S2),
				new Member("Name2", Level.L2, Skill.S1, Skill.S2), new Member("Name4", Level.L3, Skill.S4)));

		int expected = 75;
		int actual = project.getConformity(team);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test4() {
		Project project = new Project(new Role(Position.P1, Level.L1, Skill.S1));

		Set<Member> team = new HashSet<>(Arrays.asList(new Member("Name1", Level.L1, Skill.S1, Skill.S1)));

		int expected = 100;
		int actual = project.getConformity(team);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test5() {
		Project project = new Project(new Role(Position.P1, Level.L1, Skill.S1));

		Set<Member> team = new HashSet<>();

		int expected = 0;
		int actual = project.getConformity(team);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void test6() {
		Project project = new Project(new Role(Position.P1, Level.L1, Skill.S1, Skill.S2),
				new Role(Position.P3, Level.L3, Skill.S4, Skill.S5), new Role(Position.P3, Level.L3, Skill.S5));

		Set<Member> team = new HashSet<>(Arrays.asList(new Member("Name1", Level.L1, Skill.S1, Skill.S2),
				new Member("Name4", Level.L3, Skill.S4)));

		int expected = 60;
		int actual = project.getConformity(team);
		Assertions.assertEquals(expected, actual);
	}
}
