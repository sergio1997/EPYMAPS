package br.com.educacao.epymaps.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.com.educacao.epymaps.Model.Usuario;

/**
 * Created by Jaelson on 25/04/2017.
 */

public class UsuarioDAO extends GenericDAO<Usuario> {

    private SQLiteDatabase database;
    public UsuarioDAO(Context context) {
        super(context);
        database = getWritableDatabase();
    }

    @Override
    public boolean salvar(Usuario usuario) {
        database.execSQL("INSERT INTO usuario(nome,sobrenome,email,endereco,cidade,estado,dataNascimento)");
        return false;
    }
}