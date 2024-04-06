package JogoPersonagem;

public class Player extends Personagem {

    private int fome;
    private int sono;
    private int inventario;

    public Player(String nome, int energia, int fome, int sono) {
        super(nome, energia, 100);
        setFome(fome);
        setSono(sono);
        inventario = 0;
    }

    @Override
    public String toString() {
        String status = "Energia:" + getEnergia();
        status += " | Fome: " + this.fome;
        status += " | Sono: " + this.sono;
        status += " | Inventário: " + this.inventario;
        return status;
    }

    public int getFome() {
        return fome;
    }

    public int getSono() {
        return sono;
    }

    public void setFome(int fome) {
        if (fome <= 0) {
            this.fome = 0;
        } else if (fome >= 10) {
            this.fome = 10;
        } else {
            this.fome = fome;
        }
    }

    public void setSono(int sono) {
        if (sono <= 0) {
            this.sono = 0;
        } else if (sono >= 10) {
            this.sono = 10;
        } else {
            this.sono = sono;
        }
    }

    void cacar() {
        if (getEnergia() >= 2) {
            System.out.println(getNome() + " cacando");
            setEnergia(getEnergia() - 2);
            inventario++;
            fome = Math.min(fome + 1, 10);
            sono = Math.min(sono + 1, 10);
            if (getEnergia() <= 0) {
                setVida(0);
            }
        } else {
            System.out.println(getNome() + " cansado...");
        }
    }

    void comer() {
        if (fome >= 1 && inventario > 0) {
            System.out.println(getNome() + " comendo");
            fome--;
            inventario--;
            setEnergia(Math.min(getEnergia() + 1, 10));
        } else {
            System.out.println(getNome() + " sem fome");
        }
    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(getNome() + " zzzzzzzz");
            sono--;
            setEnergia(Math.min(getEnergia() + 1, 10));
        } else {
            System.out.println(getNome() + " sem sono");
        }
    }
}
