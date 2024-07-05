package com.epam.rd.autocode.set;

import java.util.EnumSet;
import java.util.Set;

public class Role {
	private Position position;
	private Level level;
	private Set<Skill> skills;

	public Role(Position position, Level level, Skill... skills) {
		this.position = position;
		this.level = level;
		this.skills = EnumSet.of(skills[0], skills); // Use EnumSet for efficient set operations
	}

	public Position getPosition() {
		return position;
	}

	public Level getLevel() {
		return level;
	}

	public Set<Skill> getSkills() {
		return skills;
	}
}
