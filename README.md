# Project skills

The purpose of this exercise is to train you to use containers of type of Set.  

Duration _60 minutes_.

## Description

There is a `Project`, every project has roles.  
Every `Role` has a `Level`, a position and required skills as `Set<Skill>` (use `EnumSet` as an implementation).  

There is also a team as `Set<Member>` (use `HashSet` as an implementation).  
Every `Member` has a name, a `Level` and skills as `Set<Skill>` (use `EnumSet<Skill>` as an implementation).  
You have to determine a percentage of a conformity of the team and skills of the project.  

It is necessary to use the following algorithm to do it:  

(1) Generate a **projectEntries** list of pairs _<Level, Skill>_ for project's roles.

For a example, if a project has roles:
`R1` which has a level `L1` and skills `S1`, `S2`;
`R2` which has a level `L1` and skills `S2`;
`R3` which has a level `L2` and skills `S2`, `S3`, `S4`.

Then the list of paris will be: 
projectEntries = **[<L1, S1>, <L1, S2>, <L1, S2>, <L2, S2>, <L2, S3>, <L2, S4>]**

(2) Generate a **teamEntries** list of pairs _<Level, Skill>_ for team's members.

For a example, if a team has members:
`M1` which has a level `L1` and skills `S1`, `S2`;
`M2` which has a level `L2` and skills `S1`.

Then the list of paris will be:
teamEntries = **[<L1, S1>, <L1, S2>, <L2, S1>]**

(3) Save the size of the list (1)

size = 6

(4) Remove from the list (1) and (2) all the common elements:

projectEntries = [<L1, S2>, <L2, S2>, <L2, S3>, <L2, S4>]
teamEntries = [<L2, S1>]

The result can be calculated by the following formula: 
**(size - projectEntries.size()) * 100 / size**

For the example above this value is (6 - 4) * 100 / 6 = 33%

Please, proceed to `Member` class and implement its content:  

* `public Member(String name, Level level, Skill... skills)` creates a member with the specified name, level and skills;

* `getName/getLevel/getSkills` returns a value of the appropriate field.

Proceed to `Role` class and implement its content:  

* `public Role(Position position, Level level, Skill... skills)` creates a role with the specified position, level and skills;

* `getPosition/getLevel/getSkills` returns a value of the appropriate field.

Proceed to `Project` class and implement its content:  

* `public Project(Role... roles)` creates a project with the specified roles;

* `public int getConformity(Set<Member> team)` returns a percentage of a conformity of the team and skills of the project;

* `private static class Entry` a structure to create entries of <level, skill>;

> Class `Entry` must have a properly implemented methods `equals` and `hashCode`. Two entries are equaled if and only if they have the same level and skill.

