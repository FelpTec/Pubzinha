public class ControleRemoto implements Controlador{

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("_|-");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void abaixarVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

}
