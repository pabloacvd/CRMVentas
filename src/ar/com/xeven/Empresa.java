package ar.com.xeven;

import java.util.List;

public class Empresa { // XEVEN (empresa VENDEDORA)
    List<Vendedor> vendedoras; // tatiana, alba, geraldine
    List<Item> catalogo; // lo que puedo vender (productos y servicios)
    String direccion;
    String nombreEmpresa;
    List<Oportunidad> oportunidades;// LAZY !! PORFA
}
