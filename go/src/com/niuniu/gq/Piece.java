package com.niuniu.gq;

import java.awt.Color;
import java.awt.Graphics;

public class Piece {

	private int size = 40;
	
	private int x;
	private int y;

	boolean isWhite = true;

	/**
	 * 构造方法
	 * 
	 * @param x
	 * @param y
	 * @param isWhite
	 */
	public Piece(int x, int y, boolean isWhite) {
		super();
		this.x = x-size/2;
		this.y = y-size/2;
		this.isWhite = isWhite;
	}

	@Override
	public String toString() {
		return "Piece [x=" + x + ", y=" + y + ", isWhite=" + isWhite + "]";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isWhite() {
		return isWhite;
	}

	/**
	 * 画棋子
	 * @param g
	 */
	public void draw(Graphics g) {
		g.setColor(isWhite?Color.WHITE: Color.black);
		g.fillOval(x, y, size, size);
		
	}
	


}
