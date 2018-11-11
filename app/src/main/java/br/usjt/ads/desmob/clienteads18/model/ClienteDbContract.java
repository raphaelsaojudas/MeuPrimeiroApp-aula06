package br.usjt.ads.desmob.clienteads18.model;

import android.provider.BaseColumns;

public class ClienteDbContract {
    public ClienteDbContract(){}

    public static abstract class Cliente implements BaseColumns{
        public static final String TABLE_NAME = "cliente";
        public static final String ID = "id";
        public static final String NOME = "nome";
        public static final String EMAIL = "email";
        public static final String DIRETOR = "diretor";
        public static final String DATA = "data";
        public static final String GENERO = "genero";
        public static final String SINOPSE = "sinopse";
        public static final String POPULARIDADE = "popularidade";
        public static final String BILHETERIA = "bilheteria";
        public static final String ELENCO = "elenco";
        public static final String FOTO = "foto";


    }
}