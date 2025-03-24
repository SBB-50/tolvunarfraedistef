public class Keppandi {
    boolean erManneskja;
    int heildarStigafjoldi;
    int stigafjoldiUmferd;


    public Keppandi(boolean erManneskja) {
        this.erManneskja = erManneskja;
        this.heildarStigafjoldi = 0;
        this.stigafjoldiUmferd = 0;

    }

    public boolean getErManneskja() {
        return erManneskja;
    }

    public int getHeildarStigafjoldi() {
        return heildarStigafjoldi;
    }

    public int getStigafjoldiUmferd() {
        return stigafjoldiUmferd;
    }

    public void setErManneskja(boolean erManneskja) {
        this.erManneskja = erManneskja;
    }

    public void setHeildarStigafjoldi(int heildarStigafjoldi) {
        this.heildarStigafjoldi = heildarStigafjoldi;
    }

    public void setStigafjoldiUmferd(int stigafjoldiUmferd) {
        this.stigafjoldiUmferd = stigafjoldiUmferd;
    }

    public void uppfaeraStigafjoldiIumferd(int stigafjoldiUmferd) {
        this.stigafjoldiUmferd += stigafjoldiUmferd;
    }

    public void uppfaeraHeildarstig() {
        this.heildarStigafjoldi += this.stigafjoldiUmferd;

    }

    public String toString() {
        String keppandi = "thu med ";
        if (!getErManneskja())
            keppandi = "tolvan med ";
        return keppandi + getHeildarStigafjoldi() + " stig";
    }
}
