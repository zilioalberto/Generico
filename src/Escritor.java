import java.util.HashMap;
public class Escritor {
    private final HashMap<Character, Letra> letras = new HashMap<>();

    public Escritor() {
        letras.put('A', new A());
        letras.put('B', new B());
        letras.put('C', new C());
        letras.put('D', new D());
        letras.put('F', new F());
        letras.put('G', new G());
        letras.put('H', new H());
        letras.put('I', new I());
        letras.put('J', new J());
        letras.put('K', new K());
        letras.put('L', new L());
        letras.put('M', new M());
        letras.put('N', new N());
        letras.put('O', new O());
        letras.put('P', new P());
        letras.put('Q', new Q());
        letras.put('R', new R());
        letras.put('S', new S());
        letras.put('T', new T());
        letras.put('U', new U());
        letras.put('V', new V());
        letras.put('W', new W());
        letras.put('X', new X());
        letras.put('Y', new Y());
        letras.put('Z', new Z());
    }

    public void escreverPalavra(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            Letra letraObj = letras.getOrDefault(letra, new LetraDesconhecida());
            char[][] arr = letraObj.desenhar();
            escrever(arr);
        }
    }

    private void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}