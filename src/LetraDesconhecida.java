 public class LetraDesconhecida implements Letra {
     @Override
     public char[][] desenhar() {
         char[][] arr = {
                 {'?', '?', '?', '?', '?'},
                 {'?', '?', '?', '?', '?'},
                 {'?', '?', '?', '?', '?'},
                 {'?', '?', '?', '?', '?'},
                 {'?', '?', '?', '?', '?'}
         };
         return arr;
     }
 }
