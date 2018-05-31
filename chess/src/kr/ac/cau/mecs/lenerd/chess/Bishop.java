package kr.ac.cau.mecs.lenerd.chess;

import java.awt.image.BufferedImage;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;

public class Bishop {
	static BufferedImage black = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP);
	static BufferedImage white = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP);
	static BufferedImage red = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_BISHOP);
	static BufferedImage green = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_BISHOP);
	Bishop(){
	}

	
}
