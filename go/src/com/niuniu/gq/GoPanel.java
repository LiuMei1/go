package com.niuniu.gq;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 面板
 * 
 * @author LiuMei
 *
 */
public class GoPanel extends JPanel {
	/**
	 * 图片
	 */
	private BufferedImage image;
	private ArrayList<Piece> piecesList = new ArrayList<Piece>();

	/**
	 * 构造方法
	 */
	public GoPanel() {
		try {
			image = ImageIO.read(new File("niu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 注册一个监听器
		addMouseListener(new PanelListener());

	}

	public void paint(Graphics g) {
		super.paint(g);

		// System.out.printf("w = %d,h=%d/n",getWidth() ,getHeight());
		// g.drawLine(0, 0, 500, 500);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		
		//画棋子
		for(Piece p:piecesList){
			
			p.draw(g);
		}
	}

	/**
	 * 面板中鼠标事件的监听（适配器模式）
	 * 
	 * @author LiuMei
	 *
	 */
	class PanelListener extends MouseAdapter {

		boolean isWhite = true;

		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			e.getX();
			e.getY();
			// System.out.printf("(%d,%d)\n",e.getX(),e.getY());
			Piece piece = new Piece(e.getX(), e.getY(), isWhite);
			piecesList.add(piece);

			isWhite = !isWhite;
			
			//重绘
			repaint();
		}
	}

}
