package com.trybe.simuladordepix;

/**
 * ErroChaveNaoEncontrada.
 */
public class ErroChaveNaoEncontrada extends ErroDePix {
  private static final long serialVersionUID = 1L;
  static String mes = Mensagens.CHAVE_NAO_ENCONTRADA;

  public ErroChaveNaoEncontrada() {
    super(mes);
  }
}
