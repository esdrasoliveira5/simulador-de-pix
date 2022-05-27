package com.trybe.simuladordepix;

/**
 * ErroInterno.
 */
public class ErroInterno extends ErroDePix {
  private static final long serialVersionUID = 1L;
  static String mes = Mensagens.ERRO_INTERNO;

  public ErroInterno() {
    super(mes);
  }
}
