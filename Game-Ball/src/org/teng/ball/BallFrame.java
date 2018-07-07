package org.teng.ball;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 游戏界面
 * @author 1730451344@qq.com
 * @author tengqianan
 * @version 1.0
 * */

public class BallFrame extends JFrame{

	private final int BALLPANEL_WIDTH = 307;//定义JPanel宽度
	private final int BALLPANEL_HEIGHT = 400;//定义JPanel高度
	private BallPanel ballPanel = null;//定义画板
	private int sticckX = -1;//定义挡板x的坐标
	private BallService service = null;//创建一个BallServices实例
	Timer timer = null;
	
	public BallFrame() throws IOException{
		super();
		initialize();
	}

	private void initialize() {
		this.setTitle("弹球");//设置窗口标题
		this.setResizable(false);//设置为窗口不可变
		this.setBackground(Color.BLACK);//背景为黑色
		//获取画板
		ballPanel = getBallPanel();
		
		
	}

	/**
	 * 获取画板
	 * @return BallPanel返回BallPanel
	 * */
	private BallPanel getBallPanel() {
		
		if(ballPanel == null){
			//新建一个画板
			ballPanel = new BallPanel();
			//设置画板大小
			ballPanel.setPreferredSize(new Dimension(BALLPANEL_WIDTH,BALLPANEL_HEIGHT));
		}
		return ballPanel;
	}
	/**
	 * 定义一个JPanel内部类来完成画图功能
	 * 重写void paint(Graphics g)方法
	 * */
	public class BallPanel extends JPanel{
		public void paint(Graphics g){
			//画图
			service.draw(g);
		}
	}
}
