package kr.ac.cau.mecs.lenerd.chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class setPiece {
	private ImageIcon white = new ImageIcon("c://white.png");
	private ImageIcon pattern = new ImageIcon("c://pattern.png");

	setPiece(JFrame frame) {
		JLabel[] map = new JLabel[64];

		for (int i = 0; i < map.length; i++) {
			if ((i / 8) % 2 == 0) {
				if ((i % 2) == 0) {
					map[i] = new JLabel(white);
				} else {
					map[i] = new JLabel(pattern);
				}
			} else {
				if ((i % 2) == 0) {
					map[i] = new JLabel(pattern);
				} else {
					map[i] = new JLabel(white);
				}
			}
			map[i].setBounds(500 + (100 * (i % 8)), 100 + (100 * (i / 8)), 100, 100);
			frame.add(map[i]);
		}
		
		ImageIcon[][] piece = new ImageIcon[6][4];
		piece[5][0] = new ImageIcon(King.black);
		JLabel[][] king = new JLabel[1][4];
		king[0][0] = new JLabel(piece[5][0]);
		king[0][0].setBounds(0, 0, 100, 100);
		map[4].add(king[0][0]);

		piece[4][0] = new ImageIcon(Queen.black);
		JLabel[][] queen = new JLabel[1][4];
		queen[0][0] = new JLabel(piece[4][0]);
		queen[0][0].setBounds(0, 0, 100, 100);
		map[3].add(queen[0][0]);

		piece[3][0] = new ImageIcon(Bishop.black);
		JLabel[][] bishop = new JLabel[2][4];
		for (int i = 0; i < 2; i++) {
			bishop[i][0] = new JLabel(piece[3][0]);
			bishop[i][0].setBounds(0, 0, 100, 100);
		}
		map[2].add(bishop[0][0]);
		map[5].add(bishop[1][0]);

		piece[2][0] = new ImageIcon(Knight.black);
		JLabel[][] knight = new JLabel[2][4];
		for (int i = 0; i < 2; i++) {
			knight[i][0] = new JLabel(piece[2][0]);
			knight[i][0].setBounds(0, 0, 100, 100);
		}
		map[1].add(knight[0][0]);
		map[6].add(knight[1][0]);

		piece[1][0] = new ImageIcon(Look.black);
		JLabel[][] look = new JLabel[2][4];
		for (int i = 0; i < 2; i++) {
			look[i][0] = new JLabel(piece[1][0]);
			look[i][0].setBounds(0, 0, 100, 100);
		}
		map[0].add(look[0][0]);
		map[7].add(look[1][0]);

		piece[0][0] = new ImageIcon(Pawn.black);
		JLabel[][] pawn = new JLabel[8][4];
		for (int i = 0; i < 8; i++) {
			pawn[i][0] = new JLabel(piece[0][0]);
			pawn[i][0].setBounds(0, 0, 100, 100);
		}
		for (int i = 8; i < 16; i++) {
			map[i].add(pawn[i - 8][0]);
		}

		piece[5][1] = new ImageIcon(King.white);
		king[0][1] = new JLabel(piece[5][1]);
		king[0][1].setBounds(0, 0, 100, 100);
		map[60].add(king[0][1]);

		piece[4][1] = new ImageIcon(Queen.white);
		queen[0][1] = new JLabel(piece[4][1]);
		queen[0][1].setBounds(0, 0, 100, 100);
		map[59].add(queen[0][1]);

		piece[3][1] = new ImageIcon(Bishop.white);
		for (int i = 0; i < 2; i++) {
			bishop[i][1] = new JLabel(piece[3][1]);
			bishop[i][1].setBounds(0, 0, 100, 100);
		}
		map[61].add(bishop[0][1]);
		map[58].add(bishop[1][1]);

		piece[2][1] = new ImageIcon(Knight.white);
		for (int i = 0; i < 2; i++) {
			knight[i][1] = new JLabel(piece[2][1]);
			knight[i][1].setBounds(0, 0, 100, 100);
		}
		map[62].add(knight[0][1]);
		map[57].add(knight[1][1]);

		piece[1][1] = new ImageIcon(Look.white);
		for (int i = 0; i < 2; i++) {
			look[i][1] = new JLabel(piece[1][1]);
			look[i][1].setBounds(0, 0, 100, 100);
		}
		map[63].add(look[0][1]);
		map[56].add(look[1][1]);

		piece[0][1] = new ImageIcon(Pawn.white);
		for (int i = 0; i < 8; i++) {
			pawn[i][1] = new JLabel(piece[0][1]);
			pawn[i][1].setBounds(0, 0, 100, 100);
		}
		int j=48;
		for (int i = 0; i < 8; i++) {
			
			map[j].add(pawn[i][1]);
			j++;
		}
	}
}