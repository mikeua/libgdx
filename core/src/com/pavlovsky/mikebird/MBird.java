package com.pavlovsky.mikebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.pavlovsky.screens.GameScreen;

public class MBird extends Game {

    public void create() {
        Gdx.app.log("ZBGame", "created");
        setScreen(new GameScreen());
    }
}
