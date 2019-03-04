package com.stackroute.domain;

public class Movie {
    Actor actor;

    // Task-1 using setter injection
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(){
        super();
    }

    // Task-2 using constructor injection
    public Movie(Actor actor) {
        this.actor = actor;
    }
}
