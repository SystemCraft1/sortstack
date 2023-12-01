public class Coin {
    private String typ;
    public int val;

    public Coin(int wert) {
        this.val = wert;
        switch (val) {
            case 1:
                this.typ = "1ct";
                break;
            case 2:
                this.typ = "2ct";
                break;
            case 5:
                this.typ = "5ct";
                break;
            case 10:
                this.typ = "10ct";
                break;
            case 20:
                this.typ = "20ct";
                break;
            case 50:
                this.typ = "50ct";
                break;
            case 100:
                this.typ = "1EUR";
                break;
            case 200:
                this.typ = "2EUR";
                break;
            default:
                this.typ = "X";
                break;

        }

    }

    public String getTyp() {
        return typ;
    }
}
