package ru.job4j.extend;

/**
 * Created by Ant on 15.05.2017.
 */
public class Doctor extends Profession {
    public int publicActivity;
    public void toHeal (Profession patient){
        patient.physicalCondition = true;
    }
}
