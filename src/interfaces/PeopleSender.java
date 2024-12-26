package interfaces;

import classes.Human;
import exceptions.IllegalPeopleNumber;


public interface PeopleSender
{
    void sendOut(Human human, int count) throws IllegalPeopleNumber;
}
