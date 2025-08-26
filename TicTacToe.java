import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static String[] board;
    static String turn;
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");

    }
    static String checkWinner(){
        for(int i=0;i<8;i++){
            String line=null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if(line.equals("XXX")){
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
            for(int a=0;a<9;a++){
                if(Arrays.asList(board).contains(String.valueOf(a+1))){
                    break;
                } else if (a==8) {
                    return "Draw";
                }
            }
        }
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a=0; a<9;a++){
            board[a] = String.valueOf(a+1);
        }
        printBoard();
        System.out.println("Player X turn first : ");
        while (winner == null){
            int numinpt;
            try{
                numinpt=in.nextInt();
                if(!(numinpt >0 && numinpt<=9)){
                    System.out.println("Invalid Input, Please select a number from 0 to 9");
                    continue;
                }
                if (board[numinpt-1].equals(String.valueOf(numinpt))){
                    board[numinpt-1]=turn;
                    turn = turn.equals("X") ? "O" : "X";
                    printBoard();
                    winner = checkWinner();
                }
                else{
                    System.out.println("Slot already taken, Re-enter slot number");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input; re-enter slot number:");
                in.nextLine();
            }
        }
        if(winner.equalsIgnoreCase("draw")){
            System.out.println("Its Draw");
        }
        else {
            System.out.println("Winner is : "+winner);
        }

    }
}
