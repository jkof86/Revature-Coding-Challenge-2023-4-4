public class Votes {
    private int upVotes;
    private int downVotes;

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public Votes(int upVotes, int downVotes){
        this.upVotes = upVotes;
        this.downVotes = downVotes;
    }

    public int getVoteCount(){
        return (upVotes-downVotes);
    }

public static void main(String[] args){
    Votes v = new Votes(5044, 1254);
    System.out.println("Up Votes: " + v.getUpVotes() + "\nDown Votes: " + v.getDownVotes() + 
    "\nTotal Vote Count: " + v.getVoteCount());
}

}