package kr.ac.cau.mecs.lenerd.chess;

import java.awt.image.BufferedImage;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;

public class Queen {
	static BufferedImage black = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN);
	static BufferedImage white = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN);
	static BufferedImage red = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_QUEEN);
	static BufferedImage green = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_QUEEN);
}
