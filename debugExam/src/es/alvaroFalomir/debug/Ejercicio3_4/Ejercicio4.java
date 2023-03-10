package es.alvaroFalomir.debug.Ejercicio3_4;

public class Ejercicio4
{
   public static void main(String[] args)
   {
      test("culloaa", 4); // resultado esperado: 4 (ss, ss, pp, iii)
      test("aah!!!", 0); // resultado esperado: 0 (no hay letras repetidas)
      test("vetis!!!", 4); // resultado esperado: 4 (aa, bb, aaaa, bb)
   }

   public static void test(String s, int expected)
   {
      AnalizadorPalabras analizador = new AnalizadorPalabras(s);
      int result = analizador.cuentaGruposCaracteresRepetidos();
      
      System.out.println(result + " grupos de caracteres repetidos.");
      System.out.println("Esperados: " + expected);
   }
}