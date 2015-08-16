package controllers;

import model.Evento;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IngressoRapidoController extends Controller {

    private static Map<Long,Evento> eventosDisponiveis;

    static {
        eventosDisponiveis = new HashMap<>();
        eventosDisponiveis.put(1l, new Evento(1l, "Missão: Impossível - Nação Secreta"));
        eventosDisponiveis.put(2l, new Evento(2l, "Meu Passado Me Condena 2"));
        eventosDisponiveis.put(3l, new Evento(3l, "Minions"));
        eventosDisponiveis.put(4l,new Evento(4l, "Homem-Formiga"));
    }

    public static Map<Long, Evento> getEventosDisponiveis() {
        return eventosDisponiveis;
    }

    public Result filaDeEspera() {
        return ok(views.html.ingressoRapidoClient.render(eventosDisponiveis.values()));
    }

}
