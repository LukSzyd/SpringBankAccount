/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sevenet.SpringSevenet.exception;

/**
 *
 * @author lszydlow
 */
public class BankTransactionException extends Exception {
     
    private static final long serialVersionUID = -3128681006635769411L;
     
    public BankTransactionException(String message) {
        super(message);
    }
 
}
