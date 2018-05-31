package kr.ac.cau.mecs.lenerd.chess;

import java.awt.image.BufferedImage;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;

public class Pawn {
	static BufferedImage black = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN);
	static BufferedImage white = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN);
	static BufferedImage red = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_PAWN);
	static BufferedImage green = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_PAWN);
}
