package lista03.ex02.share.votes;

public class VoteWhite implements interfaceVote {

    private final boolean isWhite;

    public VoteWhite(boolean isWhite){
        this.isWhite = isWhite;
    }

    @Override
    public String myType() {
        if(isWhite){
            return "isWhite";
        }else{
            return "not";
        }

    }
}
