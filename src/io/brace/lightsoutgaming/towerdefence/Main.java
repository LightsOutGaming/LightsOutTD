package io.brace.lightsoutgaming.towerdefence;

import io.brace.lightsoutgaming.engine.LightsOut;

public class Main extends LightsOut {
	
	public static void main(String[] args){
		new Main().init();
	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		this.createDisplay("Lights Out Tower Defence", 900, 600);
		this.start();
	}

	@Override
	protected void render() {
		// TODO Auto-generated method stub
		screen.clear();
		
		show();
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		
	}

}
