package com.lowleveldesign.tictactoe;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Board board;
    LinkedList<Player> players;


    Game(){}

    public void initializeGame(){

        board  = new Board(3);
        players = new LinkedList<>();
        players.addLast(new Player(new OFigure()));
        players.addLast(new Player(new XFigure()));
    }

    public void startGame(){
        boolean hasWinner = false;
        while(!board.isBoardFull() && !hasWinner){

            Player player = players.removeFirst();
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String ar[] = str.split(",");
            boolean added = board.addFigure(player.figure, Integer.parseInt(ar[0]), Integer.parseInt(ar[1]));
            if(added)players.addLast(player);
            else players.addFirst(player);



        }


    }
}
