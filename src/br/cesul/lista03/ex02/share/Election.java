package br.cesul.lista03.ex02.share;

import java.util.Random;

import java.util.ArrayList;
import java.util.List;

public class Election {

    private Random randomVote;

    private List<Vote> arrayVote = new ArrayList<>();
    
    protected int Canditate1;

    protected String Candidate1Name =  "jose";

    protected String Candidate2Name =  "maria";

    protected int Candidate2;

    protected int isNull;

    protected  int isWhite;


    public Election(){

        for (int i = 0; i < 5; i++) {

            arrayVote.add(new Vote());
        }
        
    }

    public String calculeVotes(){
      for ( Vote vote : arrayVote) {
        if ("Candidate".equals(vote.getVote())) {
            if (("Candidate " + Candidate1Name).equals(vote.getVote())) {
                Canditate1++;
            } else if (("Candidate " + Candidate2Name).equals(vote.getVote())) {
                Candidate2++;
            }
        } else if ("not".equals(vote.getVote())) {
            isNull++;
        } else if ("White".equals(vote.getVote())) {
            isWhite++;
        }
      }
      if(Canditate1 > Candidate2){
          return "The winner is: " + Candidate1Name;
      } else if(Candidate2 > Canditate1){
          return "The winner is: " + Candidate2Name;
      } else {
        if(isNull > isWhite){
            return "The winner is: Null votes";
        } else if(isWhite > isNull){
            return "The winner is: White votes";
        } else {
            return "The election was a tie, common second round";
        }
      }
    }
    
}
