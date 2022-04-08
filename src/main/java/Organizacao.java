public class Organizacao {

    private String nome;
    private Time time;

    public Organizacao(String nome){
        this.nome = nome;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public String getTime(){
        if (this.time == null){
            throw new NullPointerException("Organização sem time");
        }
        return this.time.getJogadores();
    }
}
