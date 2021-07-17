/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyFactory;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Ozlem
 */
public class FileOperationFactory{
     public JTextArea textArea;
      public JFrame jFrame;
     
     public FileOperationFactory(JFrame jFrame,JTextArea textArea){
         this.textArea=textArea;
         this.jFrame=jFrame;
     }

     
      
      public  FileOperation getInstance(String type) {
           if(type == null){
         return null;
      }		
      if(type.equals("Save Operation")){
         return new SaveOperation(jFrame, textArea);
         
      } else if(type.equals("Close Operation")){
         return new CloseOperation();
         
      } else if(type.equals("Open Operation")){
         return new OpenOperation(jFrame, textArea);
      }
         return null;
      
      }

    
}
