package Game;

import People.Person;
import People.Tool;
import Rooms.Room;
import Rooms.WinningRoom;
import Board.Board;
import java.util.Scanner;

public class Runner {
	//make it so that it tells the person if they have been to that room before


	public static boolean gameOne = true;
	public static boolean gameTwo = false;
	Tool[] Tools;


	public static void main(String[] args) {
		boolean portal = false;

		Room[][] building = new Room[5][5];
		Room[][] poolhouse = new Room[2][2];
		//Fill the poolhouse with regular rooms
		for (int x = 0; x < poolhouse.length; x++) {
			for (int y = 0; y < poolhouse[x].length; y++) {
				poolhouse[x][y] = new Room(x, y);
			}
		}

		//Fill the building with normal rooms
		for (int x = 0; x < building.length; x++) {
			for (int y = 0; y < building[x].length; y++) {
				building[x][y] = new Room(x, y);
			}
		}
		// make buildings which would  represent the poolhouse and house. Would i need two buildings
		// label locations of special rooms

		//Create a random winning room.
		//int x = (int)(Math.random()*building.length);
		//int y = (int)(Math.random()*building.length);
		//s
		// building[x][y] = new WinningRoom(x, y);
		int xx = 2;
		int yy = 2;
		building[xx][yy] = new Rooms.Kitchen(xx, yy);
		int a = 3;
		int aa = 2;
		building[a][aa] = new Rooms.SpecialRoom1(a, aa);
		int b = 1;
		int bb = 3;
		building[b][bb] = new Rooms.SpecialRoom2(b, bb);
		int c = 2;
		int cc = 1;
		building[c][cc] = new Rooms.DangerRoom1(c, cc);
		int d = 3;
		int dd = 4;
		building[d][dd] = new Rooms.DangerRoom2(d, dd);
		int e = 4;
		int ee = 2;
		building[e][ee] = new Rooms.DangerRoom3(e, ee);
		int h=0;
		int hh=4;
		building[h][hh]= new Rooms.SpecialRoom3(h,hh);
		int g = 4;
		building[g][g] = new Rooms.Portal(g, g);
		int f = 1;
		int ff = 1;
		poolhouse[f][ff] = new Rooms.WinningRoom(f, ff);

		//Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0, 0, 50);
		building[0][0].enterRoom(player1);
		Board Board = new Board(building);
		Board Board2 = new Board(poolhouse);
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to my haunted house! Your goal is to get to the last room (coordinates 4,4)");
		while (gameOne) {
			Board.createHouse();
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();


			if (validMove(move, player1, building)) {
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

			} else {

				System.out.println("Please choose a valid move.");
			}
		}
		poolhouse[0][0].enterRoom(player1);
		while (gameTwo) {
			Board2.createHouse();
			//poolhouse[0][0].enterRoom(player1);
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if (validMove(move, player1, poolhouse)) {
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

			} else {

				System.out.println("Please choose a valid move.");
			}
		}

		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 *
	 * @param move the move chosen
	 * @param p    person moving
	 * @param map  the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map) {
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0) {
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);
					return true;
				} else {
					return false;
				}
			case "e":
				if (p.getyLoc() < map[p.getyLoc()].length - 1) {
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				} else {
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1) {
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
					return true;
				} else {
					return false;
				}

			case "w":
				if (p.getyLoc() > 0) {
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
					return true;
				} else {
					return false;
				}
			default:
				break;

		}
		return true;
	}

	public static void gameOff() {
		gameOne = false;
		gameTwo = false;
	}
	


}
