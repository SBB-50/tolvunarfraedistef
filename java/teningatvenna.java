public class teningatvenna {
    private int ten1;
    private int ten2;

    public teningatvenna() {
        ten1 = 1;
        ten2 = 1;
    }

    public int getTen1Gildi() {
        return ten1;
    }

    public int getTen2Gildi() {
        return ten2;
    }

    public void kasta() {
        ten1 = (int) (Math.random() * 6) + 1;
        ten2 = (int) (Math.random() * 6) + 1;

    }

    public int getSamtalsGildi() {
        return ten1 + ten2;
    }

    public String toString() {
        return "Ten1=" + ten1 + " og Ten2=" + ten2;
    }
}
