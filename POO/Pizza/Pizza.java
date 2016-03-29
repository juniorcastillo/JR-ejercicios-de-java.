/**Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
El siguiente código del programa principal debe dar la salida que se muestra:

*pizza margarita mediana, pedida
*pizza funghi familiar, servida
*pizza cuatro quesos mediana, pedida
*esa pizza ya se ha servido
*pedidas: 3
*servidas: 1
*
*/

public class Pizza{

 private String tipo;
 private String tamano;
 public  String estado; 
 public static int  numPizaPedida;
 public static int numPizaServida;
 
//////Metodos /////////////////////////// 
 //constructor 
Pizza (String tipo , String tamano){
  
   this.tipo=tipo;
   this.tamano=tamano;
   this.estado="pedida";
   Pizza.numPizaPedida+=1;
   System.out.println(this.tipo +" "+ this.tamano+" " + this.estado); 
}

//envia el estado de la pizza y tambien cuantas se han pedido
public void sirve(){
  if(estado.equals("pedida")){
  Pizza.numPizaServida+=1;
  this.estado="servida";
  System.out.println(this.tipo +" "+ this.tamano+" " + this.estado); 

  }else{
    
   System.out.println("esa pizza ya se ha servido"); 
  }
 
}
//////////////getter///////////////////////

//manda las veces que se han servido la pizza
public static int  getTotalServidas(){
  
 return Pizza.numPizaServida;
}
// consulta las veces que se han pedido las pizzas
public static int getTotalPedidas(){
  
 return Pizza.numPizaPedida;
}



}
