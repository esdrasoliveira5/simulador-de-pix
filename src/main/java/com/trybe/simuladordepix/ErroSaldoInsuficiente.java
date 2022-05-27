package com.trybe.simuladordepix;

/**
 * ErroSaldoInsuficiente.
 */
public class ErroSaldoInsuficiente extends ErroDePix {
  private static final long serialVersionUID = 1L;
  static String mes = Mensagens.SALDO_INSUFICIENTE;

  public ErroSaldoInsuficiente() {
    super(mes);
  }
}
