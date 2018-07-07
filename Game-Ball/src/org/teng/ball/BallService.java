package org.teng.ball;

import java.awt.Graphics;

/**
 * 处理游戏逻辑的对象
 * @author 1730451344@qq.com
 * @author tengqianan
 * @version 1.0
 * */
public class BallService {
	private Stick stick = null;//定义一个Stick挡板
	private Ball ball = null;//定义一个弹球
	private BallComponent gameOver = null;//定义一个游戏结束图
	private BallComponent gameWon = null;//定义一个赢了游戏图片
	private Brick[][] brick = null;//定义砖块图片数组
	private int width;
	private int height;
	BallFrame ballFrame = null;
	/**
	 * 画图
	 * Graphics 用来画图的对象
	 * */
	public void draw(Graphics g) {
		if(isWon()){
			//绘制赢的图片
			g.drawImage(gameWon.getImage(), gameWon.getX(), gameWon.getY(),
					width, height-10, null);
		}else if(isStop()){
			//绘制游戏结束的图片
			g.drawImage(gameOver.getImage(), gameOver.getX(), gameOver.getY(),
					width,height-10,null);
		}else{
			//清除原理的图像
			g.clearRect(0, 0, width, height);
			//绘制挡板图像
			g.drawImage(stick.getImage(), stick.getX(), stick.getY(), 
					stick.getPreWidth(), stick.getImage().getHeight(null), null);
			//绘制砖块
			for(int i=0;i<brick.length;i++){
				for(int j=0;j<brick[i].length;i++){
					
				}
			}
		}
		
	}
	private boolean isStop() {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean isWon() {
		// TODO Auto-generated method stub
		return false;
	}
}
