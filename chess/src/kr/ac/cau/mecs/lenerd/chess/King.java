package kr.ac.cau.mecs.lenerd.chess;

import java.awt.image.BufferedImage;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;

public class King {
	static BufferedImage black = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING);
	static BufferedImage white = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING);
	static BufferedImage red = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KING);
	static BufferedImage green = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KING);
}
