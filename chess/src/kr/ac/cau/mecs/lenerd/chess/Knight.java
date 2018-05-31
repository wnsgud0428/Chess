package kr.ac.cau.mecs.lenerd.chess;

import java.awt.image.BufferedImage;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;

public class Knight {
	static BufferedImage black = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT);
	static BufferedImage white = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT);
	static BufferedImage red = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KNIGHT);
	static BufferedImage green = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KNIGHT);
}
