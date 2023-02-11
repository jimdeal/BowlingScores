package BowlingScore;

import java.util.ArrayList;

public class BowlingScore {

    ArrayList<FrameInfo> game = new ArrayList<BowlingScore.FrameInfo>();
    ArrayList<Integer> bonusThrows = new ArrayList<Integer>();

    enum FrameType { Strike, Spare, Normal};

    class FrameInfo {
        public int first = 0;
        public int second = 0;
        BowlingScore.FrameType frameType = BowlingScore.FrameType.Normal;
    }
    public int getNumberOfFramesPlayed() {
        return game.size();
    }

    public void AddFrameToGame(int first, int second) {
        BowlingScore.FrameInfo frameToAdd = new BowlingScore.FrameInfo();
        frameToAdd.first = first;
        frameToAdd.second = second;
        if(first == 10)
        {
            frameToAdd.frameType = BowlingScore.FrameType.Strike;
        } else if(first + second == 10){
            frameToAdd.frameType = BowlingScore.FrameType.Spare;
        } else {
            //normal type is default
        }
        game.add(frameToAdd);
    }

    public int getCurrentScore() {

        int currentScore = 0;
        int currentGameSize = game.size();

        ArrayList<Integer> currentScoresByFrame = new ArrayList<Integer>(currentGameSize);

        for (int currentGame = 0; currentGame < currentGameSize; currentGame++) {
            BowlingScore.FrameInfo frame1;
            frame1 = game.get(currentGame);

            // start by getting frame type of incoming frame
            // following this : we'll check for preceding game type(s)
            // at this point we want to go back and see if there are
            // two preceding games - and if so..
            //
            // .. whether we will have to update the scores for those
            // preceding frame(s) - based on the incoming frame
            //
            // TASK NOTE & COMMENT:
            // This leads to a huge number of combinations of the three
            // (then two, then one) frames that we need to check and process
            // to ensure that the current score table is correct.
            //
            // This in turn leads to the possibility of refactoring the code
            // based on patterns of frame processing. That would be the next step.
            //
            // HOWEVER: It should also be noted that although the current approach
            // has led to a fair amount of code repetition : it's also made adding
            // code for frame combinations relatively straight forward.
            //
            // Create new unit test : commit test - then implement / debug so that
            // new unit test passes & ensuring that ALL previous tests still pass
            //
            // This could be a justified approach to development :
            // complete the task first to attain required unit test coverage
            // THEN refactor.
            if (frame1.frameType == FrameType.Normal) {
                if (currentGame - 2 >= 0) {
                    BowlingScore.FrameInfo frame2 = game.get(currentGame - 2);

                    if (frame2.frameType == FrameType.Strike) {
                        BowlingScore.FrameInfo frame3 = game.get(currentGame - 1);

                        if (frame3.frameType == FrameType.Strike) {
                            int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                            int currentFrameFirstScore = frame1.first;
                            currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                            int prevScore = currentScoresByFrame.get(currentGame - 1);
                            currentFrameFirstScore = frame1.first + frame1.second;
                            currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);

                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                        } else if (frame3.frameType == FrameType.Normal) {
                            int currentFrameFirstScore = frame1.first + frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                        } else {
                            if (frame1.frameType == FrameType.Normal) {
                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                prevScore += frame1.first;
                                currentScoresByFrame.set(currentGame - 1, prevScore);

                                int currentFrameScore = frame1.first + frame1.second;
                                currentScoresByFrame.add(currentGame, currentFrameScore);
                            } else {
                                int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                                int currentFrameFirstScore = frame1.first;
                                currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            }
                        }
                    } else {
                        BowlingScore.FrameInfo frame3 = game.get(currentGame - 1);
                        if (frame3.frameType == FrameType.Spare) {
                            int prevScore = currentScoresByFrame.get(currentGame - 1);
                            int currentFrameFirstScore = frame1.first;
                            currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            currentFrameFirstScore += frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);

                        } else if (frame3.frameType == FrameType.Strike) {
                            int prevScore = currentScoresByFrame.get(currentGame - 1);
                            int currentFrameFirstScore = frame1.first;
                            currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            currentFrameFirstScore += frame1.second + frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);

                        } else {
                            int currentFrameScore = frame1.first + frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameScore);
                        }
                    }
                } else if (currentGame - 1 >= 0) {
                    BowlingScore.FrameInfo frame2 = game.get(currentGame - 1);
                    if (frame2.frameType == FrameType.Spare) {
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                    } else if (frame2.frameType == FrameType.Strike) {
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first + frame1.second;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                    }
                    int currentFrameScore = frame1.first + frame1.second;
                    currentScoresByFrame.add(currentGame, currentFrameScore);
                } else {
                    int currentFrameScore = frame1.first + frame1.second;
                    currentScoresByFrame.add(currentGame, currentFrameScore);
                }
            } else if (frame1.frameType == FrameType.Spare) {

                if (currentGame - 2 >= 0) {
                    BowlingScore.FrameInfo frame2 = game.get(currentGame - 2);

                    if (frame2.frameType == FrameType.Strike) {
                        BowlingScore.FrameInfo frame3 = game.get(currentGame - 1);

                        if (frame3.frameType == FrameType.Strike) {
                            if (frame1.frameType == FrameType.Normal){

                            } else if(frame1.frameType == FrameType.Spare){
                                int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                                int currentFrameFirstScore = frame1.first;
                                currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);

                                currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                            } else {
                                int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                                int currentFrameFirstScore = frame1.first;
                                currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);

                                currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                            }
                        } else if (frame3.frameType == FrameType.Normal) {
                            int currentFrameFirstScore = frame1.first + frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                        } else {
                            if (frame1.frameType == FrameType.Normal) {
                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                prevScore += frame1.first;
                                currentScoresByFrame.set(currentGame - 1, prevScore);

                                int currentFrameScore = frame1.first + frame1.second;
                                currentScoresByFrame.add(currentGame, currentFrameScore);
                            } else {
                                int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                                int currentFrameFirstScore = frame1.first;
                                currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            }
                        }
                    } else if (frame2.frameType == FrameType.Normal) {
                        BowlingScore.FrameInfo frame3 = game.get(currentGame - 1);
                        if (frame3.frameType == FrameType.Strike) {
                            int prevScore = currentScoresByFrame.get(currentGame - 1);
                            prevScore += frame1.first + frame1.second;
                            currentScoresByFrame.set(currentGame - 1,  prevScore);
                        }

                        int currentFrameScore = frame1.first + frame1.second;
                        currentScoresByFrame.add(currentGame, currentFrameScore);
                    } else { // spare
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                        int currentFrameScore = frame1.first + frame1.second;
                        currentScoresByFrame.add(currentGame, currentFrameScore);
                    }
                } else if (currentGame - 1 >= 0) {
                    BowlingScore.FrameInfo frame2 = game.get(currentGame - 1);
                    if (frame2.frameType == FrameType.Spare) {
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                    } else if (frame2.frameType == FrameType.Strike) {
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first + frame1.second;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                    }
                    int currentFrameScore = frame1.first + frame1.second;
                    currentScoresByFrame.add(currentGame, currentFrameScore);
                } else {
                    int currentFrameScore = frame1.first + frame1.second;
                    currentScoresByFrame.add(currentGame, currentFrameScore);
                }
            } else {
                if (currentGame - 2 >= 0) {
                    BowlingScore.FrameInfo frame3 = game.get(currentGame - 2);
                    if (frame3.frameType == FrameType.Normal) {

                        BowlingScore.FrameInfo frame2 = game.get(currentGame - 1);
                        if (frame2.frameType == FrameType.Normal) {
                            if (frame1.frameType == FrameType.Strike) {
                                int currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                            } else {
                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                int currentFrameFirstScore = frame1.first;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            }
                        } else if (frame2.frameType == FrameType.Strike) {
                            if (frame1.frameType == FrameType.Strike) {
                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                int currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                                currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                            } else {
                                int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                                int currentFrameFirstScore = frame1.first;
                                currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                                int prevScore = currentScoresByFrame.get(currentGame - 1);
                                currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            }
                        } else {
                            int currentFrameFirstScore = frame1.first + frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                        }
                    } else if ((frame3.frameType == FrameType.Strike)) {
                        BowlingScore.FrameInfo frame2 = game.get(currentGame - 1);
                        if (frame2.frameType == FrameType.Strike) {
                            int prevPrevScore = currentScoresByFrame.get(currentGame - 2);
                            int currentFrameFirstScore = frame1.first;
                            currentScoresByFrame.set(currentGame - 2, currentFrameFirstScore + prevPrevScore);

                            int prevScore = currentScoresByFrame.get(currentGame - 1);
                            currentFrameFirstScore = frame1.first + frame1.second;
                            currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                        } else if (frame2.frameType == FrameType.Normal) {
                            if (frame1.frameType == FrameType.Strike) {
                                int currentFrameFirstScore = frame1.first + frame1.second;
                                currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                            }
                        } else { // spare
                            int prevScore = currentScoresByFrame.get(currentGame - 1);
                            int currentFrameFirstScore = frame1.first;
                            currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);

                            currentFrameFirstScore = frame1.first + frame1.second;
                            currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                        }
                    } else { // spare
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);

                        currentFrameFirstScore = frame1.first + frame1.second;
                        currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                    }

                } else if (currentGame - 1 >= 0) {
                    BowlingScore.FrameInfo frame2 = game.get(currentGame - 1);
                    if (frame2.frameType == FrameType.Strike) {
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                        currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                    } else if (frame2.frameType == FrameType.Normal) {
                        int currentFrameFirstScore = frame1.first + frame1.second;
                        currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                    } else { // spare
                        int prevScore = currentScoresByFrame.get(currentGame - 1);
                        int currentFrameFirstScore = frame1.first;
                        currentScoresByFrame.set(currentGame - 1, currentFrameFirstScore + prevScore);
                        currentScoresByFrame.add(currentGame, currentFrameFirstScore);
                    }
                } else {
                    int currentFrameScore = frame1.first;
                    currentScoresByFrame.add(currentGame, currentFrameScore);
                }
            }
        }

        // Now we have to look at bonus ball processing - in the tenth frame
        if (game.size() == 10) {
            BowlingScore.FrameInfo lastFrame = game.get(9);
            if (lastFrame.frameType == FrameType.Spare) {
                if (bonusThrows.size() == 1) {
                    int lastInt = lastFrame.first + lastFrame.second + bonusThrows.get(0);
                    currentScoresByFrame.set(9, lastInt);
                }
            } else if (lastFrame.frameType == FrameType.Strike) {
                if (bonusThrows.size() == 2) {

                    if ((bonusThrows.get(0) == 10) && (bonusThrows.get(1) == 10)) {
                        int prevPrevScore = currentScoresByFrame.get(8);
                        int updateprevPrevScore = prevPrevScore + 10;
                        currentScoresByFrame.set(8, updateprevPrevScore);

                        int prevScore = currentScoresByFrame.get(9);
                        prevScore += prevPrevScore;
                        currentScoresByFrame.set(9, prevScore);
                    } else if ((bonusThrows.get(0) == 10) && (bonusThrows.get(1) != 10)) {
                        int prevPrevScore = currentScoresByFrame.get(8);
                        int updateprevPrevScore = prevPrevScore + 10;
                        currentScoresByFrame.set(8, updateprevPrevScore);

                        int prevScore = currentScoresByFrame.get(9);
                        prevScore = prevPrevScore + bonusThrows.get(1);
                        currentScoresByFrame.set(9, prevScore);
                    } else if (bonusThrows.get(0) + bonusThrows.get(1) == 10) {
                        int prevPrevScore = currentScoresByFrame.get(8);
                        int updateprevPrevScore = prevPrevScore + bonusThrows.get(0);
                        currentScoresByFrame.set(8, updateprevPrevScore);

                        int prevScore = currentScoresByFrame.get(9);
                        updateprevPrevScore = prevScore + bonusThrows.get(0) + +bonusThrows.get(1);
                        currentScoresByFrame.set(9, updateprevPrevScore);
                    } else {
                        int prevPrevScore = currentScoresByFrame.get(8);
                        int updateprevPrevScore = prevPrevScore + bonusThrows.get(0);
                        currentScoresByFrame.set(8, updateprevPrevScore);

                        int prevScore = currentScoresByFrame.get(9);
                        updateprevPrevScore = prevScore + bonusThrows.get(0) + +bonusThrows.get(1);
                        currentScoresByFrame.set(9, updateprevPrevScore);
                    }
                }
            }
        }

        // Now the we have all the score correctly processed - we can total up
        // the score for the current frame
        for(int totalScore = 0; totalScore<currentScoresByFrame.size();totalScore++){
            currentScore += currentScoresByFrame.get(totalScore);
        }

        return currentScore;
    }

    public void AddBonusThrow(Integer score) {
        // only thrown at last frame = max number of bonus throws 3
        if((game.size()==10)&&(bonusThrows.size() <= 3)){
            // WIP - may depend on value of previous bonus throws
            bonusThrows.add(score);
        }
    }

}
