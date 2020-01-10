package objects;

public class Grade {
    private Profession profession;
    private int score;

    public Grade(Profession profession, int score) {
        this.profession = profession;
        setScore(score);
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 40 && score <= 100){
            this.score = score;
        }
        else{
            System.out.println("Not a valid grade");
        }
    }

    @Override
    public String toString() {
        return ", Profession " + profession + " Grade " + score;
    }
}
