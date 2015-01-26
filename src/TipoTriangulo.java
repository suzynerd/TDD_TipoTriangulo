
public class TipoTriangulo {
	private String tipo;
	public String getTipo() {
		return tipo;
	}
	
	public boolean verificaTriangulo(int lado1, int lado2, int lado3)
	{
		if((lado1+lado2>lado3) & (lado1+lado3>lado2) & (lado2+lado3>lado1))
		{
			if((lado1 == lado2) & (lado2 == lado3))
	         {
	            tipo = "equilátero";
	            return true;
	         }
	         if((lado1 == lado2)& (!(lado2 == lado3)) || (lado1 == lado3)& (!(lado2 == lado3)) || (lado2 == lado3)& (!(lado1 == lado3))   )
	         {
	            tipo = "isósceles";
	            return true;
	         }
	            else if(lado1!=lado2 & lado2!=lado3 & lado3 !=lado1)
	         {
	            tipo = "escaleno";
	            return true;
	         }
	      }
	        
	         tipo = "indefinido";
	         return false;
	}
}

