import com.Conection.Conection;
import java.sql.ResultSet;

public class Principal {
   public static void main (String[] args){ 
      Conection con = new Conection();
      String nome = con.procurarLivro("Iracema");
      String res = con.executarCodigoAvaliation();
      
       System.out.println(res);
   }
}
