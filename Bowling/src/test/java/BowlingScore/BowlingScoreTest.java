package BowlingScore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingScoreTest {

    @Test
    public void ScoreOneGame1(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(2,1);
        assertEquals(1, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(3, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreOneGame2(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(8, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreOneGame3(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(9, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreOneGame4(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        bowlingTwo.AddFrameToGame(2,1);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame1(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(1, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(10, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame2(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(19, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame3(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(15, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame4(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(29, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame5(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(24, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame6(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(24, bowlingTwo.getCurrentScore());
    }


    @Test
    public void ScoreSpareGame7(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(20, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame8(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(48, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame9(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(5,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(40, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame10(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(86, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame11(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(9, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(162, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame12(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(1,1);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(165, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame13(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddBonusThrow(1);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(182, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame14(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(1,9);
        bowlingTwo.AddBonusThrow(5);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(178, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreSpareGame15(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(1,9);
        assertEquals(9, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(154, bowlingTwo.getCurrentScore());
    }


    @Test
    public void ScoreStrikeGame1(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(1, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(10, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame2(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(20, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame3(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(15, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame4(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }


    @Test
    public void ScoreStrikeGame5(){
        ////////
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(25, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame6(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(25, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame7(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(20, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame8(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(44, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame9(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(35, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame10(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(60, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame11(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame12(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame13(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame14(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(25, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame15(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(49, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame16(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(49, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame17(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(40, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame18(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(40, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame19(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(4, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(35, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame20(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(35, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame21(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(35, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame22(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(35, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame23(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame24(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(54, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame25(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(54, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame26(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(45, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame27(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(79, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame28(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(79, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame29(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(70, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame30(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(104, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame31(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(5, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(95, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame32(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        assertEquals(9, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(224, bowlingTwo.getCurrentScore());
    }
    @Test
    public void ScoreStrikeGame33(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(9, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(204, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame34(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(4,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(9, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(194, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame35(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddBonusThrow(10);
        bowlingTwo.AddBonusThrow(10);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(300, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame36(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddBonusThrow(10);
        bowlingTwo.AddBonusThrow(5);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(295, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame37(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddBonusThrow(5);
        bowlingTwo.AddBonusThrow(5);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(285, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame38(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddBonusThrow(2);
        bowlingTwo.AddBonusThrow(8);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(282, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeGame39(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddBonusThrow(2);
        bowlingTwo.AddBonusThrow(2);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(276, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame1(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame2(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        assertEquals(2, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(30, bowlingTwo.getCurrentScore());
    }


    @Test
    public void ScoreStrikeSpareGame3(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(1,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(32, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame4(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(1,1);
        bowlingTwo.AddFrameToGame(9,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(24, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame5(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(1,1);
        assertEquals(3, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(33, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame6(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0); //
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddBonusThrow(2);
        bowlingTwo.AddBonusThrow(8);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(240, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame7(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0); //
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(1,0);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(201, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame8(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(1,0); //
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(1,0);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(154, bowlingTwo.getCurrentScore());
    }

    @Test
    public void ScoreStrikeSpareGame9(){
        BowlingScore bowlingTwo = new BowlingScore();
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(1,0); //
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(10,0);
        bowlingTwo.AddFrameToGame(9,1);
        bowlingTwo.AddBonusThrow(1);
        assertEquals(10, bowlingTwo.getNumberOfFramesPlayed());
        assertEquals(181, bowlingTwo.getCurrentScore());
    }

}