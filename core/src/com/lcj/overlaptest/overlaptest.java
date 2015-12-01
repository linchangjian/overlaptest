package com.lcj.overlaptest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.uwsoft.editor.renderer.Overlap2DStage;

public class overlaptest extends ApplicationAdapter {
	private GameStage stage;

	@Override
	public void create () {
		stage = new GameStage();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.8f, 0.8f, 0.8f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act();
		stage.draw();
	}

	public class GameStage extends Overlap2DStage {

		public GameStage() {

			// This will create SceneLoader instance and configure all things like default resource manager, physics e.t.c
			initSceneLoader();

			// This will load MainScene data from json and make Actors from it
			sceneLoader.loadScene("MainScene");

			// Get the root actor and add it to stage
			addActor(sceneLoader.getRoot());
		}
	}

}
