package TicTacToe;
//https://www.codewars.com/kata/525caa5c1bf619d28c000335/train/java
//If we were to set up a Tic-Tac-Toe game, we would want to
// know whether the board's current state is solved, wouldn't
// we? Our goal is to create a function that will check that for us!
//
//Assume that the board comes in the form of a 3x3 array, where the
// value is if a spot is empty, if it is an "X", or if it is an "O", like so:012
//We want our function to return:
//
//-1 if the board is not yet finished AND no one has won yet (there are empty spots),
//1 if "X" won,
//2 if "O" won,
//0 if it's a cat's game (i.e. a draw).
//You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
public class Solution {

    public static int isSolved(int[][] board) {
        // your code here
        int sum = 0;
        int r = 0;
        int[] net = new int[9];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(r < 9){
                    net[r] = board[i][j];
                    r++;

                }
            }
        }

        int line = -1;


        if(net[0] == net[1] && net[1] == net[2]){
            sum = net[0] + net[1] + net[2];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[3] == net[4] && net[4] == net[5]){
            sum = net[3] + net[4] + net[5];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[6] == net[7] && net[7] == net[8]){
            sum = net[6] + net[7] + net[8];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[0] == net[3] && net[3] == net[6]){
            sum = net[0] + net[3] + net[6];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[1] == net[4] && net[4] == net[7]){
            sum = net[1] + net[4] + net[7];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[2] == net[5] && net[5] == net[8]){
            sum = net[2] + net[5] + net[8];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[0] == net[4] && net[4] == net[8]){
            sum = net[0] + net[4] + net[8];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }

        }
        if(net[2] == net[4] && net[4] == net[6]){
            sum = net[2] + net[4] + net[6];
            if(sum == 3){
                return line = 1;
            }
            else if(sum == 6){
                return line = 2;
            }
        }
        else if(net[0] != 0 && net[1] != 0 && net[2] != 0 && net[3] != 0 && net[4] != 0 &&
                net[5] != 0 && net[6] != 0 && net[7] != 0 && net[8] != 0){
            return line = 0;
        }


        return line;

    }

}


