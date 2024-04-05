package lista03.ex02.share.votes;

import lista03.ex02.share.Candidate;

public class VoteCandidate implements interfaceVote{

    private final Candidate candidate;

    public VoteCandidate(Candidate candidate){
        this.candidate =  candidate;
    }

    public String myType(){
        if(candidate != null){
            return "Candidate " + candidate.getNome();
        }
        return "not";
    }
}
