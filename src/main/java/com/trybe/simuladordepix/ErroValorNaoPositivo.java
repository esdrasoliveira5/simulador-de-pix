package com.trybe.simuladordepix;

/**
 * ErroValorNaoPositivo.
 */
public class ErroValorNaoPositivo extends ErroDePix {
  private static final long serialVersionUID = 1L;
  static String mes = Mensagens.VALOR_NAO_POSITIVO;

  public ErroValorNaoPositivo() {
    super(mes);
  }
}
