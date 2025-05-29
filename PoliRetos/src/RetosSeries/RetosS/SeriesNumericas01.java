package RetosSeries.RetosS;

public class SeriesNumericas01 {
   public SeriesNumericas01() {
   }

   public String akSerieFibonacci(int var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = 0;
      int var4 = 1;

      for(int var5 = 0; var5 < var1; ++var5) {
         var2.append(var3).append(" ");
         int var6 = var3 + var4;
         var3 = var4;
         var4 = var6;
      }

      var2.append("...");
      return var2.toString();
   }
}