package ru.job4j.extend;

/**
 * Created by Ant on 15.05.2017.
 */
public class Teacher extends Profession {
    public String schoolType;
    public void toTeach(Profession learner){
        learner.newSkills = "mathematic";
    }

}
