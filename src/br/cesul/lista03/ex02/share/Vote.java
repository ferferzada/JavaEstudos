package br.cesul.lista03.ex02.share;

import br.cesul.lista03.ex02.share.votes.VoteCandidate;
import br.cesul.lista03.ex02.share.votes.VoteNull;
import br.cesul.lista03.ex02.share.votes.VoteWhite;
import br.cesul.lista03.ex02.share.votes.interfaceVote;
import java.util.Scanner;

public class Vote {

    private final interfaceVote Vote;


    public Vote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your vote: ");
        String vote = scanner.nextLine();
        switch (vote.toLowerCase()) {
            case "candidate" -> {
                System.out.println("Enter name candidate: ");
                String name = scanner.nextLine();
                Candidate candidate = new Candidate(name);
                this.Vote = new VoteCandidate(candidate);
            }
            case "is null" -> this.Vote = new VoteNull(true);
            case "is white" -> this.Vote = new VoteWhite(true);
            default -> this.Vote = new VoteNull(true);
        }
        
     
    }


    public String getVote(){
        return Vote.myType();
    }



}
