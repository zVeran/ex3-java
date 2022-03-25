/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Java3 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        um();
    }
    public static void extenso(String a, int b){
		
        String[][] unidade = {
            {"dez","zero", "", "", ""}, 
            {"onze","um", "", "cento", "mil"},
            {"doze", "dois", "vinte", "duzentos", "dois mil"}, 
            {"treze", "três", "trinta", "trezentos", "três mil"},
            {"quatorze", "quatro", "quarenta", "quatrocentos", "quatro mil"}, 
            {"quinze", "cinco", "cinquenta", "quinhentos", "cinco mil"},
            {"dezesseis", "seis", "sessenta", "seiscentos", "seis mil"},
            {"dezesete", "sete", "setenta", "setecentos", "sete mil"},
            {"dezoito", "oito", "oitenta", "oitocentos", "oito mil"},
            {"dezenove", "nove", "noventa", "novecentos", "nove mil"} 
            
        };
        
        System.out.print(unidade[ Integer.parseInt((a)) ][b]); 
    }
    public static void um(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        String num = leitor.nextLine();
        leitor.close();
      
        String cen = "",
                dez = "",
                uni = "",
                mii = ""; 

        uni += num.charAt(num.length() - 1); 

        if(num.length() > 3){ 
            mii += num.charAt( num.length() - 4 ); 
            if(num.charAt( num.length() - 4 ) != '0'){ 
                extenso(mii, 4);
                System.out.print(" ");
                
            }
        }
        if(num.length() > 2){ 
            cen += num.charAt( num.length() - 3 ); 
            if(num.charAt( num.length() - 3 ) != '0'){ 
                extenso(cen, 3);
                if(num.charAt( num.length() - 2) != '0')
                System.out.print(" e ");
            }
        }
        
        if(num.length() > 1){
            dez += num.charAt( num.length() - 2); 
            if(num.charAt( num.length() - 2) != '0') {
                if(num.charAt( num.length() - 2) == '1') 
                    extenso(uni, 0);
                else{ 
                    
                    extenso(dez, 2);
                    if(num.charAt( num.length() - 1) != '0')
                    System.out.print(" e ");
                }
            }
        }
        
        try { 
            if(num.charAt( num.length() - 2) != '1')  
            extenso(uni, 1);
        } catch (Exception e) {
            extenso(uni, 1);
        }
    }
    
    public static void dois(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int num = leitor.nextInt();
        int result = num;
        int i = 1;
        while(num > 0){
            System.out.println("Digite outro valor");
            num = leitor.nextInt();
            
            if(num > 0){
                result += num;
                i++;
            }      
        }
        System.out.println("A media foi: " + (result / i));
    }
    
    public static void tres(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = leitor.nextInt();
        int i = 0;
        int result = 0;
        while(i <= n){
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
