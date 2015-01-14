package com.pavlovsky.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.pavlovsky.gameworld.GameRenderer;
import com.pavlovsky.gameworld.GameWorld;
import com.pavlovsky.mhelpers.InputHandler;

/**
 * Created by mike on 14.01.15.
 */
public class GameScreen implements Screen {
    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world);

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
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
