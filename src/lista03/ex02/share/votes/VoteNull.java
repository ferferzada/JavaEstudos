package lista03.ex02.share.votes;

public class VoteNull implements interfaceVote {

    public boolean isNull;

    public VoteNull(boolean vote){
        this.isNull = vote;
    }
    public String myType() {
        if(isNull){
            return "isNull";
        }
        return "not";
    }
}
