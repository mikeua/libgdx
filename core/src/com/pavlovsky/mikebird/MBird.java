package com.pavlovsky.mikebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.pavlovsky.screens.GameScreen;
import com.pavlovsky.mhelpers.AssetLoader;

public class MBird extends Game {

    public void create() {
        Gdx.app.log("ZBGame", "created");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
