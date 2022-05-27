package com.trybe.simuladordepix;

/**
 * ErroChaveEmBranco.
 */
public class ErroChaveEmBranco extends ErroDePix {
  private static final long serialVersionUID = 1L;
  static String mes = Mensagens.CHAVE_EM_BRANCO;

  public ErroChaveEmBranco() {
    super(mes);
  }
}
