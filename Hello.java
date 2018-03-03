import java.util.ArrayList;

import static java.lang.System.out;

public class Hello {

  public static void main(String... args) {
    var datas = new ArrayList<String>();
    datas.add("One");
    datas.add("Two");
    
    for(var i=0; i<datas.size(); i++) {
      out.printf("Data %d = %s\n", i, datas.get(i));
    }
  }

}
