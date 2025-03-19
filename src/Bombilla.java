public class Bombilla {
    static public boolean interruptorGeneral=true;
    private boolean interruptor;

    //Constructor vacío, para crear el objeto bombilla en estado apagado
    public Bombilla() {this.interruptor=false;}

    // Metodo que enciende o apaga según como esté el interruptor
    public void encenderOapagar(){
        if(this.interruptor){
            this.interruptor=false;
        }else {
            this.interruptor=true;
        }
    }
    //////////////////////////////////////////////////////////////////
    //Metodo para cambiar estado
    public boolean estado(){return interruptorGeneral && this.interruptor;}

    //Metodo para mostrar el estado

    public String mostrarEstado(){
        return estado()?" Encendido " : " Apagado ";
    }
}
