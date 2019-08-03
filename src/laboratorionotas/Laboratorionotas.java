
package laboratorionotas;


public class Laboratorionotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Muestra de notas al azar:");
int nota = (int)(Math.random()*7) + 1; 
for(int i=1; i<=28; i+=4){
switch(nota) {
case 1:
System.out.println("do");
break;
case 2:
System.out.println("re");
break;
case 3:
System.out.println("mi"); 
break;
case 4:
System.out.println("fa");
break;
case 5:
System.out.println("so");
break;
case 6:

System.out.println("la");
break;
case 7:
System.out.println("si");
break;
default:
}
    }
    }
}
