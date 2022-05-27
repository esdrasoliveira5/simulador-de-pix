package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Servidor.
 */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
