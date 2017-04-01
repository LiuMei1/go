package com.niuniu.gq;

import javax.swing.JFrame;

public class AppFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6652016715219382972L;

	private GoPanel panel;

	public AppFrame() {

		initUi();
		setVisible(true);
	}

	/**
	 * 初始化用户接口
	 */
	public void initUi() {
		setTitle("五子棋");
		setSize(506, 533);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new GoPanel();
		add(panel);
	}
}
