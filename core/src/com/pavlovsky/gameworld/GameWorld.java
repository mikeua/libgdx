package com.pavlovsky.gameworld;

import com.badlogic.gdx.Gdx;
import com.pavlovsky.gameobjects.Bird;


/**
 * Created by mike on 14.01.15.
 */
public class GameWorld {

    private Bird bird;

    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;

    }
}
