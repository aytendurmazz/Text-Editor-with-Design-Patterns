/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyFactory;

/**
 *
 * @author DELL
 */
public class CloseOperation implements FileOperation{

    @Override
    public void operation() {
       System.exit(0);
    }
    
}
