package alisolarflare;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ChessBoard {
	int rows = 8;
	int columns = 8;
	Color darkSquare = new Color(209,139,71);
	Color lightSquare = new Color(255, 206, 158);
	
	Tile[][] chessArray = new Tile[columns][rows];
	
	public void draw(Graphics2D g, Dimension dim){
		double ratio = rows/(double)columns;
		double dimRatio = dim.height/(double)dim.width;
		double squareLength = (ratio >= dimRatio) ? dim.height / (double)rows : dim.width / (double)columns;
		
		squareLength = Math.max(20, squareLength);
		squareLength = Math.min(80, squareLength);
		
		for (int columnIndex = 0; columnIndex < columns; columnIndex++){
			for(int rowIndex = 0; rowIndex < rows; rowIndex++){
				drawTile(g, columnIndex, rowIndex,squareLength);
				if (columnIndex == 1 && rowIndex == 1){
					drawRedSquare(g, columnIndex, rowIndex, squareLength);
				}
				drawText(g, columnIndex, rowIndex, squareLength);
			}
		}
	}
	private void drawText(Graphics2D g, int columnIndex, int rowIndex, double squareLength){
		g.setColor(new Color(0,0,0));

		int x = (int) (squareLength * columnIndex + squareLength / 4);
		int y = (int) (squareLength * rowIndex + squareLength / 2 );
		
		
		
		
		g.drawString(columnIndex + "|" + rowIndex, x, y);
	}
	
	
	Color squareColor = new Color(255,0,0);
	private void drawRedSquare(Graphics2D g, int columnIndex, int rowIndex, double squareLength) {
		g.setColor(squareColor);

		int x = (int) ((squareLength) * columnIndex);
		int y = (int) ((squareLength) * rowIndex);
		
		g.fillRect(x + (int)(squareLength/4), y + (int)(squareLength/4), (int)squareLength/2, (int)squareLength/2);
	}


	public void drawTile(Graphics g, int columnIndex, int rowIndex, double squareLength){
		if ((columnIndex + rowIndex) % 2 == 0){ // Top Right
			g.setColor(lightSquare);
		}else{ //Top Left
			g.setColor(darkSquare);
		}
		
		int x = (int) ((squareLength) * columnIndex);
		int y = (int) ((squareLength) * rowIndex);
		
		g.fillRect(x, y, (int)squareLength+1, (int)squareLength+1);
		
	}
}
