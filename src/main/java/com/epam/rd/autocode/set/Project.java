package com.epam.rd.autocode.set;

import java.util.*;

public class Project {

	private List<Role> roles;

	public Project(Role... roles) {
		this.roles = Arrays.asList(roles);
	}

	public List<Role> getRoles() {
		return roles;
	}

	public int getConformity(Set<Member> team) {
		List<Entry> projectEntries = generateEntryList(roles);
		List<Entry> teamEntries = generateEntryList(team);

		int originalSize = projectEntries.size();

		projectEntries.removeAll(teamEntries);

		int newSize = projectEntries.size();
		int conformityPercentage = (originalSize - newSize) * 100 / originalSize;

		return conformityPercentage;
	}

	private List<Entry> generateEntryList(List<Role> roles) {
		List<Entry> entries = new ArrayList<>();
		for (Role role : roles) {
			for (Skill skill : role.getSkills()) {
				entries.add(new Entry(role.getLevel(), skill));
			}
		}
		return entries;
	}

	private List<Entry> generateEntryList(Set<Member> team) {
		List<Entry> entries = new ArrayList<>();
		for (Member member : team) {
			for (Skill skill : member.getSkills()) {
				entries.add(new Entry(member.getLevel(), skill));
			}
		}
		return entries;
	}

	private static class Entry {
		private Level level;
		private Skill skill;

		public Entry(Level level, Skill skill) {
			this.level = level;
			this.skill = skill;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Entry entry = (Entry) o;
			return level == entry.level && skill == entry.skill;
		}

		@Override
		public int hashCode() {
			return Objects.hash(level, skill);
		}
	}
}
