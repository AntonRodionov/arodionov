package ru.job4j.extend;

/**
 * Created by Ant on 15.05.2017.
 */
public class Engineer extends Profession {
    public int realizedProjects;
    public BuildingScheme toProject(String report){
        return new BuildingScheme(report);
    }
}
