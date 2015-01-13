package com.pavlovsky.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.pavlovsky.gameworld.GameRenderer;
import com.pavlovsky.gameworld.GameWorld;

/**
 * Created by mike on 14.01.15.
 */
public class GameScreen implements Screen {
    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld(); // initialize world
        renderer = new GameRenderer(world); // initialize renderer
    }

    public void render(float delta) {

        world.update(delta); // GameWorld updates
        renderer.render(); // GameRenderer renders

    }

    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    public void dispose() {
        // Leave blank
    }
}
