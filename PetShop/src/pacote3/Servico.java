package pacote3;


public abstract class Servico {
	
	
	public String descricao;
	public double preco;
	
	
	public Servico(String descricao, double preco) {
		
		this.descricao = descricao;
		this.preco = preco;
		
	}
	public abstract String descricao();
	public abstract double preco();

	
	
	public class Banho extends Servico {

		public Banho() {
			super("Banho", 20.0);
		}

		@Override
		public String descricao() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public double preco() {
			// TODO Auto-generated method stub
			return 0;
		}

		
	}

	public class Tosa extends Servico {

		public Tosa() {
			super("Tosa", 30.0);
		}

		@Override
		public String descricao() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public double preco() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	

}
