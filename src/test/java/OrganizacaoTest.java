import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class OrganizacaoTest {

    @Test
    public void deveRetornarJogadoresEmOrganizacao(){

        Time time = new Time("Flamengo");

        Jogador jogador = new Jogador("Arrascaeta");
        Jogador jogador2 = new Jogador("Pedro");
        Jogador jogador3 = new Jogador("João Gomes");
        Jogador jogador4 = new Jogador("David Luiz");

        time.addJogador(jogador);
        time.addJogador(jogador2);
        time.addJogador(jogador3);
        time.addJogador(jogador4);

        Organizacao organizacao = new Organizacao("Organizacao 1");
        organizacao.setTime(time);

        assertEquals("Time: Flamengo\n" +
                "Jogador: Arrascaeta\n" +
                "Jogador: Pedro\n" +
                "Jogador: João Gomes\n" +
                "Jogador: David Luiz\n", organizacao.getTime());

    }

    @Test
    public void deveRetornarOrganizacaoSemTime(){
        try {
            Organizacao organizacao = new Organizacao("Flamengo");
            organizacao.getTime();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Organização sem time", e.getMessage());
        }
    }

}
