package com.epam.rd.autocode.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
	
	public static void main(String[] args) {
		Project project = new Project(
			new Role(Position.P1, Level.L1, Skill.S1, Skill.S2),
			new Role(Position.P2, Level.L2, Skill.S1, Skill.S2, Skill.S3),
			new Role(Position.P3, Level.L3, Skill.S4, Skill.S5),
			new Role(Position.P3, Level.L3, Skill.S5));
		
		Set<Member> team = new HashSet<>(Arrays.asList(
			new Member("Name1", Level.L1, Skill.S1, Skill.S2),
			new Member("Name2", Level.L2, Skill.S1, Skill.S2, Skill.S3),
			new Member("Name3", Level.L3, Skill.S4, Skill.S5),
			new Member("Name4", Level.L3, Skill.S4)));

		System.out.println(project.getConformity(team));
	}

}
