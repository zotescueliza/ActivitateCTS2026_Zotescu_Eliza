package ro.ase.cts.facade.clase;

public class Salon {
    private boolean patLiber[] = new boolean[4];

    public Salon() {
        this.patLiber[0] = true;
        this.patLiber[2]= true;
    }

    public int getPatLiber(){
        for(int i=0; i<patLiber.length;i++){
            if(patLiber[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int indexPat){
        this.patLiber[indexPat] = false;
    }
}
