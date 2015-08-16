package controllers;

import model.Evento;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

public class QueueController extends Controller {



    public Result start(Long eventoId) {
        return ok(views.html.listaDeEspera.render(IngressoRapidoController.getEventosDisponiveis().get(eventoId)));
    }

    public Result send(Long eventoId) {
        return ok(views.html.listaDeEspera.render(IngressoRapidoController.getEventosDisponiveis().get(eventoId)));
    }

}
