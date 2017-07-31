import java.util.Scanner;

class seggrau {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  float a, b, c = 0f;
  float x1, x2, delta = 0f;

  System.out.print("Programa que determina as raizes de uma equação\ndo 2º grau\n"+"\n");
  System.out.print("a: ");
  a = input.nextFloat();
  System.out.print("b: ");
  b = input.nextFloat();
  System.out.print("c: ");
  c = input.nextFloat();

  System.out.println();
  if(a != 0) {
   delta = (b*b) - (4*a*c);
   delta = (float)Math.sqrt(delta);

   if(delta > 0) {
    System.out.println("Existem duas raizes");
    x1 = ((-1)*b + delta)/(2*a);
    x2 = ((-1)*b - delta)/(2*a);
    System.out.printf("%f e %f\n", x1, x2);
   }else{
    if(delta == 0) {
     System.out.println("As duas raizes são iguais");
     x1 = ((-1)*b + delta)/(2*a);
     x2 = ((-1)*b - delta)/(2*a);
     System.out.printf("%f e %f\n", x1, x2);
    }else{
     System.out.println("Não pertence aos números reais");
    }
   }
  }else{
   System.out.println("a tem que ser diferente de zero");
  }
 }
}
