
public class ValidarCaracterSequencial {

	public static void main(String[] args) {
		  String senha = "ac134";	
		
		  if (validaSequencial(senha)) {
			  System.out.println("tem sequencia");
		  } else {
			  System.out.println("nao tem sequencia"); 
		  }
	}
	
	public static boolean validaSequencial(String senha) {
		String proximoCaracter = "";
		String caracterAtual = "";
		boolean sequencial = false;
		
		for (char ch: senha.toCharArray()) {
		    caracterAtual = String.valueOf(ch); 
			if (proximoCaracter.equals(caracterAtual)) {
				sequencial = true;
			}			
			int charcaracterAtual = caracterAtual.charAt(0);
			proximoCaracter = String.valueOf( (char) (charcaracterAtual + 1));			
		}
		return sequencial;
	}

}
