

public static void main(String[] args) {
  
  int[] arr = {6,8,11,15,20,25,30};
  ArrayList<Integer> lista = new ArrayList<>();
  
  
  for(int i = 0; i< arr.lenght; i++){
       lista.add(arr[i]);  
  }
  // Iterador Arraylist
  // clase interador --> importar libreria
  Iterator<Integer> iter = lista.iterador();
  // retorna 6
  int a = iter.next();
  System.out.println("a: " + a);
  // retorna 8
  a = iter.next():
  System.out.println("a: " + a);
  
  // entonces hacer...
  while(iter.hasNext()){
    a = iter.next();
    System.out.println("a: " + a);
  
  }
  // definirlo de nuevo para empezar de 0
  // imprime 6
  iter = lista.iterator();
  a = iter.next();
  System.out.println("a: " + a);
  
  // elimina donde esta posicionado actualmente
  // Al eliminar un elemento el puntero aun se queda en el elemento eliminador (por eso el iter.next)
  iter.remove();
  a = iter.next();
  System.out.println("a: " + a);
  
  iter = lista.iterator();
  a = iter.next();
  System.out.println("aaa: " + a);
  iter = lista.iterator();
  
  // borra numeros impares
  while(iter.hasNext()){
    a = iter.next();
    if(a%2 == 1){
      iter.remove();
    } 
 }
  
  
  


  



}
