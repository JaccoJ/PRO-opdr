package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.ArrayList;


public class platformer extends ApplicationAdapter {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Ground ground;
	private Player player1;
	private CollisionHandler collisionHandler;
	private Music music;
	private ArrayList<Bullet> bullets;

	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 400);
		batch = new SpriteBatch();

		music = Gdx.audio.newMusic(Gdx.files.internal("sounds/music2.mp3"));

		ground = new Ground(batch);
		ground.setPosition(0,0);

		bullets = new ArrayList<Bullet>();

		player1 = new Player(batch, bullets);
		player1.setPosition(100, 400);

		collisionHandler =	new CollisionHandler(ground, player1);
	}
	private void handleInput()
	{
		if (Gdx.input.isKeyPressed(Input.Keys.P))
		{
			camera.translate(0,3,0);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.L))
		{
			camera.translate(0,-3,0);
		}
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();

		batch.setProjectionMatrix(camera.combined);

		handleInput();
		batch.begin();
		ground.update();
		player1.update();
		collisionHandler.update();
		player1.update2();
		batch.end();


		if (player1.playsound == true)
		{
			music.play();
		}
		else
		{
			music.pause();
		}


	}
	public void resize()
	{
		camera.update();
	}

	@Override
	public void dispose () {
		batch.dispose();
		music.dispose();
		player1.guy.dispose();
	}
}
