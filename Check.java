/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author uglevod
 */
  class  Check {
    
    
    
    public static String[] ch(String ln){
      // переменная для хранения ответа  
      String[] res = new String[4];
        String s[];
      // разделяем по оперратору  
        s = ln.split("[-+*/]");
      // если операндов больше чем 2 то ошибка  
        if (s.length>2) {res[3]="Err";}
      // проверка на односистемность
      String rdec = "[0-9]+";
      String rrim = "[IVXLCDMivxlcdm]+"; 
      
      if (s[0].trim().matches(rdec) && s[1].trim().matches(rdec) && res[3]!="Err") {res[3]="Dec"; }
      else 
          if ( s[0].trim().matches(rrim) && s[1].trim().matches(rrim)) {res[3]="Rim"; } 
          else {res[3]="Err";}
       
      if (res[3]!="Err") {res[0]=s[0]; res[1]=s[1];}
     //   System.out.println(ln.);
      
      
      
      if (res[3]!="Err") {
      
      if (ln.contains("+")) {res[2]="+";}
      if (ln.contains("-")) {res[2]="-";}
      if (ln.contains("*")) {res[2]="*";}
      if (ln.contains("/")) {res[2]="/";}
      
      
      }
      
      
      
      
      return res;
    
    
    } 
}
