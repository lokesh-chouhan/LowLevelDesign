package com.lowleveldesign.tictactoe;

public class Board {

    int size;
    int freeCells;
    Figure[][] figures;
    Board(int size) {
        this.size = size;
        this.freeCells = size*size;
        figures = new Figure[size][size];

    }

    public boolean isCellFree(int r, int c){
        if(figures[r][c] == null)return true;
        return false;
    }

    public boolean isBoardFull(){
        if(freeCells == 0)return true;
        return false;
    }

    public boolean addFigure(Figure figure, int r, int c){
        if(isCellFree(r,c)){
            figures[r][c] = figure;
            freeCells--;
            printBoard();
            return true;
        }
        System.out.println("Please enter empty cell!!");
        return false;

    }

    public boolean checkRow(Figure figure, int r){

        for(int i=0;i<size;i++){
            if(figures[r][i] == null ||
                    !(figures[r][i].figureType.equals(figure.figureType))) return false;
        }
        return true;
    }

    public boolean checkCol(Figure figure, int c){

        for(int i=0;i<size;i++){
            if(figures[i][c] == null ||
                    !(figures[i][c].figureType.equals(figure.figureType))) return false;
        }
        return true;
    }

    public boolean checkDiag(){return false;}

    public boolean checkAntiDiag(){return false;}

    public void printBoard(){

        for(int i=0;i<size;i++){

            for(int j=0;j<size;j++){

                if(figures[i][j] == null) System.out.print("   |");
                else if(figures[i][j].figureType.equals(FigureType.O)) System.out.print("  O|");
                else System.out.print("  X|");
            }

            System.out.println();
        }

    }
}
