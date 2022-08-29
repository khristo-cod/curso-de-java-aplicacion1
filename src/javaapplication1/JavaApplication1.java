package javaapplication1;

//mi clase en java, 



public class JavaApplication1 {

    public static void main(String[] args) {
//        var contador = 0;
//        while(contador < 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//        
//        var cont = 0;
//        do {
//            System.out.println("cont = " + cont);
//            cont++;
//        }while(cont < 3);

        for( var cont = 0 ; cont < 3 ; cont++ ){
           if(cont % 2 == 0)
            System.out.println("cont = " + cont);
        }

    }
}
