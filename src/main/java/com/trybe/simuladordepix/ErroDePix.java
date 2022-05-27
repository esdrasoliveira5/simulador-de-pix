package com.trybe.simuladordepix;

/**
 * ErroDePix.
 */
public abstract class ErroDePix extends Exception {

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
