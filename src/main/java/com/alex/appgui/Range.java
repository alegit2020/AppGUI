/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.appgui;

/**
 *
 * @author alexg
 */
public class Range {
    NomeRange nome_range;
    boolean isFloat;
    Integer val1_int , val2_int;
    Double val1_double , val2_double;
    EtichettaRange etichetta_val1 , etichetta_val2;

    /**
     * Costruttore per Range di tipo FLOAT/DOUBLE
     * @param nome_range  : A cosa si riferisce il Range
     * @param etichetta_val_1 : Significato del val_1
     * @param val_1
     * @param etichetta_val_2 : Significato del val_2
     * @param val_2 
     */
    public Range(NomeRange nome_range , EtichettaRange etichetta_val_1 , double val_1 , EtichettaRange etichetta_val_2 , double val_2) {
        this.isFloat = true;
        this.nome_range = nome_range;
        this.val1_double = val_1;
        this.val2_double = val_2;  
        this.etichetta_val1 = etichetta_val_1;
        this.etichetta_val2 = etichetta_val_2;
    }

    /**
     * Costruttore per Range di tipo INTERI
     * @param nome_range
     * @param etichetta_val_1
     * @param val_1
     * @param etichetta_val_2
     * @param val_2 
     */
    public Range(NomeRange nome_range , EtichettaRange etichetta_val_1 , int val_1 , EtichettaRange etichetta_val_2 , int val_2) {
        this.isFloat = false;
        this.nome_range = nome_range;
        this.val1_int = val_1;
        this.val2_int = val_2;  
        this.etichetta_val1 = etichetta_val_1;
        this.etichetta_val2 = etichetta_val_2;
    }
    
    /**
     * Permette di sapere se i valori di range sono double o int
     * @return boolean true se il range è float/double - false se int
     */
    
    public boolean isFloat(){
        return this.isFloat;
    }
    
    
    @Override
    public String toString(){
        if (isFloat)
        return "range " + this.nome_range + " = [" + 
                this.val1_double.toString() + "("+this.etichetta_val1+"):" + 
                this.val2_double.toString()+"("+ this.etichetta_val2+ ")]"; 
        else 
        return "range " + this.nome_range + " = [" + 
                this.val1_int.toString() + "("+this.etichetta_val1+"):" + 
                this.val2_int.toString()+"("+ this.etichetta_val2+ ")]"; 


    }
}
