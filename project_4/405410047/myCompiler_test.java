import org.antlr.runtime.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;


public class myCompiler_test {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myCompilerLexer lexer = new myCompilerLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myCompilerParser parser = new myCompilerParser(tokens);
      parser.program();
      FileReader fr = new FileReader(args[0]);
	  System.out.println("Using "+ args[0]);
	  BufferedReader br = new BufferedReader(fr);
	  while(br.ready()){
			  System.out.println(br.readLine());
	  }
	  String fn = args[0].replace("c","j");
	  FileWriter fw = new FileWriter(fn);
      /* Output text section */
      List<String> text_code = parser.getTextCode();
      for (int i=0; i < text_code.size(); i++){
      	   System.out.println(text_code.get(i));
		 fw.write(text_code.get(i) + "\n");
		 fw.flush();
	  }
	  fw.close();
  }
}
