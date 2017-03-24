package alisolarflare;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ChessComponent extends JComponent{
	private static final long serialVersionUID = 5676704394523598432L;
	private ChessBoard chessBoard;
	
	public ChessComponent(){
		this.chessBoard = new ChessBoard();
	}
	
	
	@Override
	public Dimension getMinimumSize(){
		return new Dimension(200,200);
	}
	
	@Override
    public Dimension getPreferredSize() {
		return new Dimension(400,400);
	}
	
	@Override
    public void paintComponent(Graphics g) {
		chessBoard.draw((Graphics2D) g, getSize());
	}
}
